<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous" />
<head>

<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>JAVA Class Board</title>
<link rel="stylesheet" href="css/css.css" />

<style type="text/css">
.board_list {
	width: 100%;
	border-top: 2px solid #000;
}

.board_list>div {
	border-bottom: 1px solid #ddd;
	font-size: 0;
}

.board_list>div.top {
	border-bottom: 1px solid #999;
}

.board_list>div.last-child {
	border-bottom: 1px solid #000;
}

.board_list>div>div {
	display: inline-block;
	padding: 15px 0;
	text-align: center;
	font-size: 1.4rem;
}

.board_list>div.top>div {
	font-weight: 600;
}

.board_list .num {
	width: 10%;
}

.board_list .cate {
	width: 10%;
}

.board_list .title {
	width: 50%;
	text-align: left;
}

.board_list .top .title {
	width: 50%;
	text-align: center;
}

.board_list .writer {
	width: 15%;
}

.board_list .date {
	width: 15%;
}
</style>

</head>
<body>
	<div class="board_wrap">
		<div class="board_title">
			<div class="title1">
				<strong>JAVA Class Board</strong>
			</div>



			<div class="bt_wrap" role="group" aria-label="Basic outlined example">
				<a href="./" class="on">강의 목록</a> <a href="./" class="on">질문 하기</a>

			</div>








			<c:if test="${ empty login }">
				<div class="title_btn">
					<a href="./loginForm" class="on">로그인</a> <a href="./">회원가입</a>
				</div>
			</c:if>

			<c:if test="${not empty login}">

				<div class="title_btn">
					<a>${login}님 안녕하세요!</a> <a href="./" class="on">로그아웃</a>
					<c:if test="${login eq 'master' }">
						<a href="./">회원 관리</a>

					</c:if>
					<c:if test="${login != 'master' }">
						<a href="./">마이 페이지</a>
					</c:if>
				</div>
			</c:if>
		</div>






		<div class="board_list_wrap">
			<div class="board_list">
				<div class="top">
					<div class="num">글번호</div>
					<div class="cate">카테고리</div>
					<div class="title">제목</div>
					<div class="writer">작성자</div>
					<div class="date">작성일</div>
				</div>


				<div>

					<c:forEach var="post" items="${postList.postlist}">

						<div class="num">${post.idpost}</div>
						<div class="cate">${post.cate}</div>
						<div class="title">
							<c:if test="${not empty login }">
								<a
									href="${pageContext.request.contextPath}/detail?idpost=${post.idpost}">${post.title}</a>
							</c:if>
							<c:if test="${empty login}">

								<a href="./login">${post.title}</a>
							</c:if>
						</div>
						<div class="writer">${post.id}</div>
						<div class="date">${post.date}</div>


					</c:forEach>







				</div>
			</div>
			<div class="board_page">
				<a href="?page=1" " class="bt first"> << </a>


				<c:forEach var="pageNum" begin="1" end="${postList.totalPage}">
					<a href="?page=${pageNum}" class="num">${pageNum}</a>
				</c:forEach>

				<a href="?page=${postList.totalPage}" class="bt last"> >> </a>
			</div>


			<c:if test="${not empty login}">

				<div class="title_btn">
					<a href="./write" class="on">글 쓰기</a>
				</div>
			</c:if>
		</div>
	</div>
	</div>
	</div>




	<!-- Option 1: Bootstrap Bundle with Popper -->

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous">
		
	</script>
</body>
</html>