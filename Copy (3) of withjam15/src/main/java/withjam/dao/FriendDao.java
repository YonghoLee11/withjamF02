package withjam.dao;

import java.util.List;

import withjam.domain.Friend;
import withjam.domain.Member;


public interface FriendDao {
	Friend friendsMaxNo(int uid);
	List<?> myFollowList(int uid);
	List<?> friendDetailList(int uid);
	void FriendDelete(Member member);
	void FriendAdd(Member member);
	List<?> myFollowerList(int uid);
	Member otherInfo(Member member);
}