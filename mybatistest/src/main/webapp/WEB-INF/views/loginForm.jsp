<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>

<script type="text/javascript">
	function loginFormSubmit(loginform) {

		var loginid = $('#loginid').val();
		var loginpw = $('#loginpw').val();

		//공백이 있으면 지우는 것 
		loginform.loginid.value = loginform.loginid.value.trim();

		if (loginform.loginid.value.length == 0) {
			alert('로그인 아이디를 입력해주세요');
			loginform.loginid.focus();
			// 여기서 진행이 더 이상 되지 않게 함
			return;
		}

		if (loginform.loginpw.value.length == 0) {
			alert('비밀번호를 입력해주세요');
			loginform.loginpw.focus();
			// 여기서 진행이 더 이상 되지 않게 함
			return;
		}

		loginform.submit();

	}
</script>


<head>




<title>JAVA Class Board</title>
<link rel="stylesheet" href="css/css.css" />

<style type="text/css">
.bt_wrap {
	margin-top: 30px;
	text-align: center;
	font-size: 0;
}

.bt_wrap a, .bt_wrap input[type="submit"] {
	display: inline-block;
	min-width: 80px;
	margin-left: 10px;
	padding: 10px;
	border: 1px solid #000;
	border-radius: 2px;
	text-align: center;
	font-size: 1.4rem;
}

.bt_wrap a {
	margin-left: 20px;
}
</style>
</head>
<body>
	<div class="board_wrap">
		<div class="board_title">
			<div class="title1">
				<strong>JAVA Class Board</strong>
			</div>
		</div>
		<div class="board_login_wrap">
			<div class="board_login">
				<div class="login">
					<form action="./login" method="post" name="loginform"
						id="loginform" onsubmit="loginFormSubmit(this); return false;">

						<dl>
							<dt>아이디</dt>
							<dd>
								<input type="text" placeholder="아이디" name="loginid" id="loginid" />
							</dd>
						</dl>

						<dl>
							<dt>비밀번호</dt>
							<dd>
								<input type="password" placeholder="비밀번호" name="loginpw"
									id="loginpw" />
							</dd>
						</dl>
						<div class="logincheckfield"></div>
				</div>
			</div>
		</div>


		<div class="bt_wrap">

			<input type="submit" class="btn btn-primary btn-lg" value="로그인" />
			</form>
			<a class="btn btn-primary btn-lg" href="./join">회원가입</a>


		</div>
	</div>



</body>
</html>