package withjam.control;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import withjam.domain.Member;
import withjam.service.MemberService;

/* @SessionAttributes
 * => Model에 저장되는 값 중에서 세션에 저장될 객체를 지정한다.
 * => 사용법
 *    @SessionAttributes({"key", "key", ...})
 */

@Controller
@RequestMapping("/auth")
// 만약 Model에 loginUser라는 이름으로 값을 저장한다면
// 그 값은 request에 보관하지 말고 session에 보관하라!
// 그 값은 세션에 있는 값이다.
@SessionAttributes({ "loginUser", "requestUrl" })
public class AuthControl {
	@Autowired
	MemberService memberService;

//	@RequestMapping(value = "/add", method = RequestMethod.GET)
//	public ModelAndView form() throws Exception {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("member/mainPage");
//		return mv;
//	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String add(Member member) throws Exception {
//		System.out.println("test01");
		memberService.add(member);

		return "redirect:add.do";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String form(
			@CookieValue(/* required=false */defaultValue = "") String uid,
			Model model) throws Exception {
		model.addAttribute("uid", uid);
		return "auth/LoginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String uid, String pwd, String save, String requestUrl, /*
																				 * 세션에
																				 * 저장된
																				 * 값을
																				 * 달라고
																				 * 하려면
																				 * ?
																				 */
			HttpServletResponse response, Model model, SessionStatus status)
			throws Exception {

		if (save != null) { // 쿠키로 아이디 저장
			Cookie cookie = new Cookie("uid", uid);
			cookie.setMaxAge(60 * 60 * 24 * 15);
			response.addCookie(cookie);
		} else {
			Cookie cookie = new Cookie("uid", "");
			cookie.setMaxAge(0); // 무효화시킴
			response.addCookie(cookie);
		}

		Member member = memberService.validate(uid, pwd);

		if (member != null) {
			model.addAttribute("loginUser", member);
			if (requestUrl != null) {
				return "redirect:" + requestUrl;
			} else {
				return "redirect:../product/list.do";
			}

		} else {
			// @SessionAttributes로 지정된 값을 무효화시킨다.
			// => 주의!!!! 세션 전체를 무효화시키지 않는다.
			status.setComplete();
			return "redirect:login.do"; // 로그인 폼으로 보낸다.
		}
	}

	@RequestMapping("/logout")
	public String execute(SessionStatus status) throws Exception {
		status.setComplete();
		return "redirect:login.do";
	}

}