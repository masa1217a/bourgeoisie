<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ page import="com.bourgeoisie.model.admin.storemanager.StoreTopBean"%>

<style type="text/css">
table, td {
	border-style: solid;
	border-width: 1px;
	border-color: black;
	text-align: center;
}
</style>

<h1>店舗リスト</h1>

<ul>
	<a href="/bourgeoisie/AdminStoreDetailServlet?storeid=${storeid}" ><li>${ storename }</li></a>
</ul>
