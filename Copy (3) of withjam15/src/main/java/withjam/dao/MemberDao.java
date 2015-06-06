package withjam.dao;

import java.util.Map;

import withjam.domain.Member;


public interface MemberDao {
	
	void insert(Member member);
	Member existUser(Map<String,String> params);
	Member selectOne(int uid);
	Member myInfo(int uid);
	void updateMyInfo(Member member);
	Member otherInfo(Member member);
}