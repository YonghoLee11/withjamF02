package withjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.FriendDao;
import withjam.domain.Friend;
import withjam.domain.Member;

@Service
public class FriendService {
	
	@Autowired
	  FriendDao friendDao;

	public  Friend getMaxFriendNo(int uid) {
		
		
		Friend totalSize = friendDao.friendsMaxNo(uid);
		
		return totalSize;
	}

	public List<?> myFollowList(int uid) {
		
		return friendDao.myFollowList(uid);
	}

	public List<?> getFriendDetail(int uid) {
		
		return friendDao.friendDetailList(uid);
	}

	public void FriendDelete(Member member) {
		
		
		friendDao.FriendDelete(member);
	}

	public void FriendAdd(Member member) {
		// TODO Auto-generated method stub
		friendDao.FriendAdd(member);
	}

	public List<?> myFollowerList(int uid) {
		// TODO Auto-generated method stub
		return friendDao.myFollowerList(uid);
	}

	public Member otherInfo(Member member) {
		// TODO Auto-generated method stub
		return friendDao.otherInfo(member);
	}

}
