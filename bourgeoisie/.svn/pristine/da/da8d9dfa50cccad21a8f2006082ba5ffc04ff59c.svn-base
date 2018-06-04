<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function myEnter(){
	//document.ansform.setCustomValidity("");
	if(document.ansform.password.value != document.ansform.password2.value){
		document.ansform.password.setCustomValidity("パスワード不一致");
		alert("パスワード不一致");
		return;
	}
     myRet = confirm("この内容で登録しますか？");
     console.log(myRet);
     if (myRet){
    	 console.log("あ");
    	 document.ansform.action="admin/system/RecordStoreInfoServlet2";
    	 document.ansform.submit();
     }else{
    	 document.ansform.action="admin/system/RecordStoreInfo.jsp";
         document.ansform.submit();

     }
}
/*
var form = document.ansform;
document.ansform.onsubmit = function() {
  // エラーメッセージをクリアする
  //form.password.setCustomValidity("");
  alert("onsubmit");
}
*/
</script>


<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h2>店舗登録</h2>
<form name="ansform" method = "post">
		店舗管理ID<input maxlength="8"   type="text"  name="storemanagerid" required><br>
		パスワード<input maxlength="16"  type="password"  name="password" value="****" required><br>
<br>
確認のためもう一度パスワードを入力してください。
<input maxlength='16' type="password" name="password2" value="****" required><br>
	<c:if test="${!empty error_message}">
		<c:forEach var="m" items="${error_message}">
			<c:out value="${m}" /><br>
		</c:forEach>
	</c:if>


<button type="button" onclick="myEnter(); return false;">登録する</button>
</form>


</body>

</html>