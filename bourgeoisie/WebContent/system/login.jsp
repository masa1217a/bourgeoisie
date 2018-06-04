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

  <form action="Login" method="post">
		ユーザーID：<input type="text" name="uid" required max="20"><br>
		パスワード：<input type="password" name="upassword" required max="40"><br>
		<div style="display:inline-flex">
		<br> <br><input type="submit"value="ログイン">　　　　　　　　　<br><br><input type="submit"value="トップへ"></div>
  </form>

</body>
</html>