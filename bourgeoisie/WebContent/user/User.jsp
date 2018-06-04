<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- String fileUrl = (String)request.getAttribute("fileUrl"); --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>トップページ</title>
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
  <!-- Modernizr -->
  <script src="/bourgeoisie/system/package_css/js/libs/modernizr-2.6.2.min.js"></script>
  <!-- framework css -->
  <!--[if gt IE 9]><!-->
  <link type="text/css" rel="stylesheet" href="/bourgeoisie/system/package_css/css/groundwork.css">
  <!--<![endif]-->
  <!--[if lte IE 9]>
  <link type="text/css" rel="stylesheet" href="/bourgeoisie/system/package_css/css/groundwork-core.css">
  <link type="text/css" rel="stylesheet" href="/bourgeoisie/system/package_css/css/groundwork-type.css">
  <link type="text/css" rel="stylesheet" href="/bourgeoisie/system/package_css/css/groundwork-ui.css">
  <link type="text/css" rel="stylesheet" href="/bourgeoisie/system/package_css/css/groundwork-anim.css">
  <link type="text/css" rel="stylesheet" href="/bourgeoisie/system/package_css/css/groundwork-ie.css">
  <![endif]-->
</head>


<body>
	<a href="/bourgeoisie/system/package_css/index.html"><img src="/bourgeoisie/system/package_css/images/Tomcat-logo.svg.png" height="50px" width="80"></a>
	<h1>トップページ ${ user.userid }</h1>
	<nav class="red nav nocollapse" title="Vegetarian Menu">
	  <ul>
	  	<li><a href="top"><button>TOP</button></a></li>
	  	<li><a href="signup"><button>新規登録</button></a></li>
	    <li><a href="login"><button>ログイン</button></a></li>
	    <li><a><button>★メニュー★</button></a>
	      <ul>
	        <li><button>マイ評価履歴</button></li>
	        <li><button>登録情報の変更</button></li>
	        <li><button>退会処理</button></li>
	      </ul>
	    </li>
	  </ul>
</nav>

<br>

	<jsp:include page="/user/search_form.jsp" />

	<br>
	<div >
		<%--=fileUrl --%>
	
		<%-- <jsp:include page="${ fileUrl }" flush="true"/> --%>
		<jsp:include page="${ fileUrl }" />
	</div>

<br>
	<footer data-truncate="3"  class="red box">
	aaa
	</footer>

	<script type="text/javascript" src="/bourgeoisie/system/package_css/js/libs/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="/bourgeoisie/system/package_css/js/groundwork.all.js"></script>
</body>
</html>