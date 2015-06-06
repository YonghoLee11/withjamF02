package withjam.control;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import withjam.domain.Member;
import withjam.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberControl {

	@Autowired
	MemberService memberService;

	@Autowired
	ServletContext servletContext;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView form() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/mainPage");
		return mv;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Member member) throws Exception {
        System.out.println("test01");
        memberService.add(member);

		return "redirect:add.do";
	}
	
	
}