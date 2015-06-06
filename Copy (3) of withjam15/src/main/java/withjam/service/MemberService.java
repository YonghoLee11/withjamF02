package withjam.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import withjam.dao.MemberDao;
import withjam.domain.Member;

/* Service 컴포넌트의 역할
 * => 비즈니스 로직 수행
 * => 트랜잭션 관리
 */

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;


	public Member validate(String email, String pwd) {
		HashMap<String, String> params = new HashMap<>();
		params.put("email", email);
		params.put("pwd", pwd);
		return memberDao.existUser(params);
	}

	/*
	 * @Transactional 선언 => 메서드 안의 입력/변경/삭제(manipluation) 작업을 하나의 작업을 묶는다. => 모든
	 * 작업이 성공했을 때만 서버에 반영한다.
	 */
	@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
	public void add(Member member) {
		memberDao.insert(member);

	}
	
	public Member selectOne(int uid) {
		System.out.println(uid);
		return memberDao.selectOne(uid);
	}

	public Member myInfo(int uid) {
		// TODO Auto-generated method stub
		return memberDao.myInfo(uid);
	}

	public void updateMyInfo(Member member) {
		// TODO Auto-generated method stub
		memberDao.updateMyInfo(member);
	}

	public Member otherInfo(Member member) {
		// TODO Auto-generated method stub
		return memberDao.otherInfo(member);
	}
}
