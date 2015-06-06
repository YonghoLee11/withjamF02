<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 로그인 폼 -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<link href="http://fonts.googleapis.com/css?family=Audiowide"
	rel="stylesheet" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">

<link rel='stylesheet' href='../css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/bootstrap-theme.min.css'>
<link rel='stylesheet' href='../css/bootstrap-theme.css.map'>
<script src='../js/jquery-1.11.1.js'></script>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<script type="text/javascript" src="../js/jquery.validate.js"></script>
<script type="text/javascript" src="../js/jquery.validate.password.js"></script>

<meta charset="UTF-8">

<title>Insert title here</title>
<style>
body {
	font-family: 'Open Sans', sans-serif;
	background: #ddd;
	color: white;
	text-align: center;
}

h2 {
	font-family: 'Audiowide';
	font-size: 2em;
}

h1 {
	font-family: 'Audiowide';
	font-size: 6em;
	position: absolute;
	top: 100px;
	bottom: 0;
	left: 15%;
	right: 0;
	height: 340px;
	width: 70%;
	-webkit-animation: floating-text 2s ease alternate infinite;
	-moz-animation: floating-text 2s ease alternate infinite;
	-ms-animation: floating-text 2s ease alternate infinite;
	-o-animation: floating-text 2s ease alternate infinite;
	animation: floating-text 2s ease alternate infinite;
}

.loginForm {
	/* color:rgba(255,255,255,.5); */
	position: absolute;
	top: 50px;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
	top: 45%;
	/* 	
	 height:150px; 
	width:30%;  
  border: 1px solid black; */
	/* background-color: #fff; */
	/*  font-weight:300; */
}

a {
	text-decoration: none;
	color: #fff;
}

@
-webkit-keyframes floating-text { 0% {
	-webkit-transform: translateY(.1em);
	text-shadow: 0 0 .5em rgba(255, 255, 255, .4), 0 0 .2em
		rgba(0, 0, 0, .3), 0 .3em .2em rgba(0, 0, 0, .3);
}

100%
{
text-shadow
















:
















0
0
.5em








 








rgba
















(255
,
255,255,
.4
















)
,
0
0
.2em








 








rgba
















(0
,
0,0,
.3
















)
,
0
.5em








 








.5em








 








rgba
















(0
,
0,0,
.3
















);
}
}
@
-moz-keyframes floating-text { 0% {
	-moz-transform: translateY(.1em);
	text-shadow: 0 0 .5em rgba(255, 255, 255, .4), 0 0 .2em
		rgba(0, 0, 0, .3), 0 .3em .2em rgba(0, 0, 0, .3);
}

100%
{
text-shadow
















:
















0
0
.5em








 








rgba
















(255
,
255,255,
.4
















)
,
0
0
.2em








 








rgba
















(0
,
0,0,
.3
















)
,
0
.5em








 








.5em








 








rgba
















(0
,
0,0,
.3
















);
}
}
@
-ms-keyframes floating-text { 0% {
	-ms-transform: translateY(.1em);
	text-shadow: 0 0 .5em rgba(255, 255, 255, .4), 0 0 .2em
		rgba(0, 0, 0, .3), 0 .3em .2em rgba(0, 0, 0, .3);
}

100%
{
text-shadow
















:
















0
0
.5em








 








rgba
















(255
,
255,255,
.4
















)
,
0
0
.2em








 








rgba
















(0
,
0,0,
.3
















)
,
0
.5em








 








.5em








 








rgba
















(0
,
0,0,
.3
















);
}
}
@
-o-keyframes floating-text { 0% {
	-o-transform: translateY(.1em);
	text-shadow: 0 0 .5em rgba(255, 255, 255, .4), 0 0 .2em
		rgba(0, 0, 0, .3), 0 .3em .2em rgba(0, 0, 0, .3);
}

100%
{
text-shadow
















:
















0
0
.5em








 








rgba
















(255
,
255,255,
.4
















)
,
0
0
.2em








 








rgba
















(0
,
0,0,
.3
















)
,
0
.5em








 








.5em








 








rgba
















(0
,
0,0,
.3
















);
}
}
@
keyframes floating-text { 0% {
	transform: translateY(.1em);
	text-shadow: 0 0 .5em rgba(255, 255, 255, .4), 0 0 .2em
		rgba(0, 0, 0, .3), 0 .3em .2em rgba(0, 0, 0, .3);
}

100%
{
text-shadow
















:
















0
0
.5em








 








rgba
















(255
,
255,255,
.4
















)
,
0
0
.2em








 








rgba
















(0
,
0,0,
.3
















)
,
0
.5em








 








.5em








 








rgba
















(0
,
0,0,
.3
















);
}
}
.subDiv1 {
	/* position:absolute; */
	margin: auto;
	background-color: #ddf;
	width: 500px;
	height: 100%;
}

.subDiv2 {
	/* position:absolute; */
	margin: auto;
	background-color: #eee;
	width: 450px;
	height: 100%;
}

html, body {
	height: 100%;
}

/* 로그인 폼 -----------------------------------------------------*/
@import
	"http://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css";

body {
	font: 13px/20px "Lucida Grande", Tahoma, Verdana, sans-serif;
	color: #404040;
	background: #0ca3d2;
}

.login {
	position: relative;
	padding: 15px 15px 15px;
	width: 310px;
	background: /* white */ #eef;
	border-radius: 5px;
	-webkit-box-shadow: 0 0 200px rgba(255, 255, 255, 0.5), 0 1px 2px
		rgba(0, 0, 0, 0.3);
	box-shadow: 0 0 200px rgba(255, 255, 255, 0.5), 0 1px 2px
		rgba(0, 0, 0, 0.3);
}

.login:before {
	content: '';
	position: absolute;
	/* top: -8px;
  right: -8px;
  bottom: -8px;
  left: -8px;
  z-index: -1; */
	background: rgba(0, 0, 0, 0.08);
	border-radius: 4px;
}

.login h1 {
	margin: -20px -20px 21px;
	line-height: 40px;
	font-size: 15px;
	font-weight: bold;
	color: #555;
	text-align: center;
	text-shadow: 0 1px white;
	background: #f3f3f3;
	border-bottom: 1px solid #cfcfcf;
	border-radius: 3px 3px 0 0;
	background-image: -webkit-linear-gradient(top, whiteffd, #eef2f5);
	background-image: -moz-linear-gradient(top, whiteffd, #eef2f5);
	background-image: -o-linear-gradient(top, whiteffd, #eef2f5);
	background-image: linear-gradient(to bottom, whiteffd, #eef2f5);
	-webkit-box-shadow: 0 1px whitesmoke;
	box-shadow: 0 1px whitesmoke;
}

.login p {
	margin: 20px 0 0;
}

.login p:first-child {
	margin-top: 0;
}

.login input[type=text], .login input[type=password] {
	width: 278px;
}

.login p.remember_me {
	float: left;
	line-height: 31px;
}

.login p.remember_me label {
	font-size: 12px;
	color: #777;
	cursor: pointer;
}

.login p.remember_me input {
	position: relative;
	bottom: 1px;
	margin-right: 4px;
	vertical-align: middle;
}

.login p.submit {
	text-align: right;
}

.login-help {
	margin: 20px 0;
	font-size: 11px;
	color: white;
	text-align: center;
	text-shadow: 0 1px #2a85a1;
}

.login-help a {
	color: #cce7fa;
	text-decoration: none;
}

.login-help a:hover {
	text-decoration: underline;
}

:-moz-placeholder {
	color: #c9c9c9 !important;
	font-size: 13px;
}

::-webkit-input-placeholder {
	color: #ccc;
	font-size: 13px;
}

input {
	font-family: 'Lucida Grande', Tahoma, Verdana, sans-serif;
	font-size: 14px;
}

input[type=text], input[type=password] {
	width: 200px;
	height: 34px;
	color: #404040;
	background: white;
	border: 1px solid;
	border-color: #c4c4c4 #d1d1d1 #d4d4d4;
	border-radius: 2px;
	outline: 5px solid #eff4f7;
	-moz-outline-radius: 3px;
	-webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
	box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.12);
}

input[type=text]:focus, input[type=password]:focus {
	border-color: #7dc9e2;
	outline-color: #dceefc;
	outline-offset: 0;
}

input[type=button] {
	padding: 0 18px;
	height: 29px;
	font-size: 12px;
	font-weight: bold;
	color: #527881;
	text-shadow: 0 1px #e3f1f1;
	background: #cde5ef;
	border: 1px solid;
	border-color: #b4ccce #b3c0c8 #9eb9c2;
	border-radius: 16px;
	outline: 0;
	-webkit-box-sizing: content-box;
	-moz-box-sizing: content-box;
	box-sizing: content-box;
	background-image: -webkit-linear-gradient(top, #edf5f8, #cde5ef);
	background-image: -moz-linear-gradient(top, #edf5f8, #cde5ef);
	background-image: -o-linear-gradient(top, #edf5f8, #cde5ef);
	background-image: linear-gradient(to bottom, #edf5f8, #cde5ef);
	-webkit-box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
	box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
}

input[type=button]:active {
	background: #cde5ef;
	border-color: #9eb9c2 #b3c0c8 #b4ccce;
	-webkit-box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
	box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
}

.lt-ie9 input[type=text], .lt-ie9 input[type=password] {
	line-height: 34px;
}

.password-meter-message-very-weak {
	color: red;
}

.password-meter-message-weak {
	color: red;
}

.password-meter-message-good {
	color: 80d1ff;
}

.password-meter-message-strong {
	color: #8cff80;
}

.password-meter-message {
	
}

.password-meter{
   border: 1px red solid;
   left: 100px;
}
</style>



</head>
<body>
	<div class="subDiv1">
		<div class="subDiv2">
			<h1>WithJam</h1>

			<!-- 로그인 폼  -->
			<div id="loginform" class="loginForm login">
				<div>
					<h2>Login</h2>
					<form method="post" action="">
						<p>
							<input type="text" name="email" value="" placeholder="Email">
						</p>
						<p>
							<input type="password" name="password" value=""
								placeholder="Password">
						</p>
						<p class="remember_me">
							<label> <input type="checkbox" name="remember_me"
								id="remember_me"> Remember
							</label>
						</p>

						<p class="submit">
							<input id="register" type="button" name="register"
								value="Register"> <input
								onClick="location.href='main_div.html'" type="button"
								name="commit" value="Login">
						</p>
					</form>
				</div>

			</div>

			<!-- 회원가입 폼  -->
			<div id="registerform" class="loginForm login">
				<div>
					<h2>Register</h2>
					<form method="post" action="add.do">
						<p>
							<input type="text" value="" placeholder="Email" id='email' name='email'>
							<span  id='email-validate'></span>
						</p>
						
						
						<p>
							<input type="password" value="" placeholder="Password" id='pwd' name='pwd'
								title='최소 8자 이상 입력하세요. 추측하기 쉬운 비밀번호는 사용하지 마세요'>
							<span
								 id='pwd-validate'></span>
						</p>
						


						<p>
							<input type="text" value="" placeholder="re-Password" id='pwd2'>
							<span  id='pwd2-validate'></span>
						</p>
						<p>
							<input type="text" id="uname" value="" placeholder="Nickname" name='uname'>
							<span  id='uname-validate'></span>
						</p>




						<button value="signup" id='signup'>signup</button>
						<button id='cancel'>cancel</button>

					</form>
				</div>
			</div>

            </div>
	</div>



	<script type="text/javascript">
	var emailValid = 'null';
	    
		$("#registerform").hide();

		$("#register").click(function() {
			$("#loginform").hide();
			$("#registerform").show();
		});

		$("#cancel").click(function() {
			$("#loginform").show();
			$("#registerform").hide();
		});

		$('#signup').click(function() {
            console.log(emailValid);
            
           if($('#email').val()==''){
            	return false;
            }
            
            if($('#pwd').val()==''){
            	return false;
            }
            
            if($('#pwd2').val()==''){
            	return false;
            }
            
            if($('#uname').val()==''){
            	return false;
            }
            
            if(emailValid=='false'){
            	return false;
            }
            
            if($('#pwd').val()!=$('#pwd2').val()){
            	return false;
            }
            
            if($('#pwd').val()<8){
            	return false;
            } 
            
            
            
            

			/* $.post('../json/member/add.do' 
			, { 
				email : $('#email').val(),
				pwd : $('#pwd').val(),
				uname : $('#uname').val()
			}, function(result) { 
				if (result.status == "success") {
				
				} else {
					alert("등록 실패!");
				}
			}, 'json' 
			.fail(function(jqXHR, textStatus, errorThrown) {
				alert(textStatus + ":" + errorThrown);
			});*/

		}); 
	
		$(function() {
			var tooltips = $("[title]").tooltip({
				position : {
					my : "left top",
					at : "right+5 top-5"
				}
			});

		});

		$('form>p>span').css('display', 'none');

		$("#email").focus(function() {
			$('#email-validate').css('display', '');
		});


	<!-- 회원가입 유효성 검사 -->
	
	<!-- email 유효성 검사. -->
		$("#email").focusout(function() {
			var email = $('#email').val();
			$('#email-validate').css('display', '');
			if (email == '') {
				$('#email-validate').html('필수 입력항목입니다.');
				
			}
		});

		$("#email")
				.keyup(
						function() {
							var email = $('#email').val();

							$('#email-validate').css('display', '');

							if (IsEmail(email) == false) {
								$('#email-validate').html('잘못된 email폼 입니다');
								
								emailValid = 'false';
								console.log(emailValid);
								

							} else if (IsEmail(email) == true) {
								$
										.get(
												"http://localhost:3000/idCheck?email="
														+ email,
												function(data) {
													if (data.length == 0) {

														$('#email-validate')
																.css('display',
																		'');
														$('#pwd2-validate').css('color','blue');
														$('#email-validate')
																.html(
																		'사용할 수 있는 email주소입니다.');
														emailValid = 'true';
														console.log(emailValid);

													}else{
														$('#email-validate')
														.html(
																'이미 등록된 이메일 주소입니다.');
														emailValid = 'false';
														
													}
												});

							}

							function IsEmail(email) {
								var regex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
								if (!regex.test(email)) {
									return false;
								} else {
									return true;
								}
							}
						});
		
			var pwd ;
			var pwd2 ;
			
			
		$("#pwd").focusout(function() {
			pwd = $('#pwd').val();
			$('#pwd-validate').css('display', '');
			if (pwd == '') {
				$('#pwd-validate').html('필수 입력항목입니다.');
				
			}else if(pwd.length<8){
				$('#pwd-validate').html('8자이상의 패스워드를 입력해주세요.');
				
			}else if(pwd.length>=8){
				$('#pwd-validate').html('');
			}
		});
		
		$("#pwd2").focusout(function() {
			pwd2 = $('#pwd2').val();
			$('#pwd2-validate').css('display', '');
			
			if (pwd2 == '') {
				$('#pwd2-validate').html('필수 입력항목입니다.');
				
			}
			
			if(pwd!=pwd2){
				$('#pwd2-validate').html('패스워드가 일치하지 않습니다.');
				
			}else if(pwd==pwd2){
				$('#pwd2-validate').html('동일한 패스워드입니다.');
				$('#pwd2-validate').css('color','blue');
			}
		});
		
		
		$("#uname").focusout(function() {
			var uname = $('#uname').val();
			$('#uname-validate').css('display', '');
			if (uname == '') {
				$('#uname-validate').html('필수 입력항목입니다.');
			}
		});
		
		$('#submit').click(function(){
			return false;
		}); 
		
		
		
		                
	</script>

</body>
</html>