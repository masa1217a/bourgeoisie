<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<h1>ランキング（評価順）</h1>
<%
	for (int i = 1; i <= 3; i++) {
%>
<div
	style="padding: 10px; margin-bottom: 10px; border: 1px solid #333333; border-radius: 10px;">
	<strong><%=i%>位</strong>
	<a href="${ storename }">店舗名${ storename }</a><br />
	店舗情報 ${ storeinfomation }<br />
	<img src="$/bourgeoisie/image/{ picture }" width="238" height="238">
</div>
<%
	}
%>