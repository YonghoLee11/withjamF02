//$(function() {
//$('#myInfo').load('templates/myInfo.html');

MyInfo();

$(".searchSubM1").hide();
$(".searchSubM2").hide();
$(".searchSubM3").hide();

$("#searchBoard").click(function() {
	$(".searchSubM1").slideToggle("middle"); // 글 찾기
	$(".searchSubM2").hide();
	$(".searchSubM3").hide();
	return false;
});
$("#searchAccount").click(function() {
	$(".searchSubM2").slideToggle("middle"); // 사람 찾기
	$(".searchSubM1").hide();
	$(".searchSubM3").hide();
	return false;
});
$("#searchFriend").click(function() {
	$(".searchSubM3").slideToggle("middle"); // 밴 찾기
	$(".searchSubM1").hide();
	$(".searchSubM2").hide();
	return false;
});

// 쪽지보내기 메뉴
// $(function() {
$(".band_content").hide();
$("#band_title").click(function() {
	$(".band_content").slideToggle("middle");
	return false;
});
// });
// });
$("#b-makebtn").click(function() {
	$(".band_content").slideToggle("middle");
});

// <!--modal 로드 -->
/*
 * $("#save_msg").click(function(){ $(".setting-content").hide();
 * $(".myphoto-big").hide(); $('.msg-content').load('msgbox_left.html').show();
 * });
 */

// <!--팔로워 클릭했을 때 상ㅅ ㅔ정보 모달-->
$(".profileImg").click(function() {
	$('.friend-modal-content').load('friend-modal.html').show();
});

// $("#following").click(
// function() {
// $('#myInfo4').show();
// $('.follower').hide();
// $('.band-detail').hide();
// $('.following').show();
//
// $.getJSON('/withjam15/json/auth/loginUser.do', function(data) {
// if (data.status == 'fail') {
// console.log('loginUser fail..');
// } else {
// var loginUser = data.loginUser;
// console.log(loginUser);
//
// $.getJSON('../json/friend/myFollowList.do?uid='
// + loginUser.uid, function(data) {
// console.log(data);
// require([ 'text!templates/myFollow.html' ], function(
// html) {
// var template = Handlebars.compile(html);
// $('.following').html(template(data));
// });
// });
// }
// });
//			
//			
// });
//
// $("#follower").click(function() {
// $('#myInfo4').show();
// $('.following').hide();
// $('.band-detail').hide();
// $('.follower').show();
//	
// $.getJSON('/withjam15/json/auth/loginUser.do', function(data) {
// if (data.status == 'fail') {
// console.log('loginUser fail..');
// } else {
// var loginUser = data.loginUser;
// console.log(loginUser);
//
// $.getJSON('../json/friend/myFollowerList.do?uid='
// + loginUser.uid, function(data) {
// console.log(data);
// require([ 'text!templates/myFollower.html' ], function(
// html) {
// var template = Handlebars.compile(html);
// $('.follower').html(template(data));
// });
// });
// }
// });
// });

// $(".band-detail-btn").click(function() {
// $('#myInfo4').show();
// $('.following').hide();
// $('.follower').hide();
// $('.band-detail').show();
//	
// console.log('test');
//	
// MyBandList();
//	
// });

function MyBandList() {
	$.getJSON('/withjam15/json/auth/loginUser.do', function(data) {
		if (data.status == 'fail') {
			console.log('loginUser fail..');
		} else {
			var loginUser = data.loginUser;
			console.log(loginUser);

			$.getJSON('../json/band/myBandList.do?uid=' + loginUser.uid,
					function(data) {
						console.log(data);
						require([ 'text!templates/myBandList.html' ], function(
								html) {
							var template = Handlebars.compile(html);
							$('#myInfo4').html(template(data));
						});
					});
		}
	})
}

function MyInfo() {
	$.getJSON('/withjam15/json/auth/loginUser.do', function(data) {
		if (data.status == 'fail') {
			console.log('loginUser fail..');
		} else {
			var loginUser = data.loginUser;

			$.getJSON('../json/friend/myInfo.do?uid=' + loginUser.uid,
					function(data) {

						require([ 'text!templates/myInfo.html' ],
								function(html) {
									var template = Handlebars.compile(html);
									$('#myInfo').html(template(data));
								});
					});
		}
	})
}



function OtherInfoFollowList(uid) {

			$.getJSON('../json/friend/myFollowList.do?uid='
					+ loginUser.uid, function(data) {
				console.log(data.friends);
				require([ 'text!templates/myFollow.html' ], function(
						html) {
					var template = Handlebars.compile(html);
					$('.following').html(template(data));
				});
			});
}
