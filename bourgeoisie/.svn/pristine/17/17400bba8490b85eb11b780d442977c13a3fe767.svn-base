<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	String message = request.getParameter("message");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>ログイン</h1>
  <p>IDとパスワードを入力してください</p>

  <form action="admin/system/login_check" method="post">
		ユーザーID：<input type="text" name="SyId" required max="20"><br>
		パスワード：<input type="password" name="SyPw" required max="40"><br>
		<div style="display:inline-flex">
		<br> <br><input type="submit"value="ログイン">&nbsp;</div>
  </form>
  ${error_login}
<br><br><a href ="top.jsp"><button>とっぷへ</button></a><br>>
</body>
</html>