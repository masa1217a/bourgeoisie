<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果</title>
</head>
<body>

<style type="text/css">
	table, td{
		border-style: solid;
		border-width: 1px;
		border-color: black;
		text-align: center;
	}
</style>
<!-- <jsp:include page="search_form.jsp"></jsp:include> -->

	<c:choose>
		<c:when test="${empty pagination}">検索してください</c:when>
<%--		<c:when test="${pagination.count == 0}">データが見つかりません</c:when> --%>
		<c:otherwise>
		<table style="width:500px;">
			<thead>
			<tr>
				<th>storename</th>
				<th>address</th>
				<th>storeinfomationtitle</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="store" items="${store_list}">
			<tr>
				<td><a href="./StoreDetailServlet?storeid=${store.storeid}"><c:out value="${store.storename}" /></a></td>
				<td><c:out value="${store.address}" /></td>
				<td><c:out value="${store.storeinfomationtitle}" /></td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
		<%--jsp:include page="./pagination.jsp"></jsp:include> --%>
		</c:otherwise>
	</c:choose>


</body>
</html>