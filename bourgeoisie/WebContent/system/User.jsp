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
	<h1>トップページ</h1>
	<nav class="red nav nocollapse" title="Vegetarian Menu">
	  <ul>
	    <li><button>ログイン</button></li>
	    <li><button>★メニュー★</button>
	      <ul>
	        <li><button>マイ評価履歴</button></li>
	        <li><button>当落情報の変更</button></li>
	        <li><button>退会処理</button></li>
	      </ul>
	    </li>
	  </ul>
</nav>

<br>

	<div class="red box">
  <h3>検索</h3>
  <p>検索項目を入力する</p>
 	<form action="sss">
	  <div class="row gap-bottom">
	    <div class="two fourths small-tablet pad-right no-pad-mobile">
	      <input placeholder="キーワード">
	    </div>
	    <div class="one fourths small-tablet pad-right no-pad-mobile">
	    	<select>
	      	<option>すべて</option>
	      </select>
	     </div>
	    <div class="one fourth small-tablet">
	      <button class="block asphalt">検索</button>
	    </div>
	  </div>
  </form>
	</div>

	<br>

	<%--=fileUrl --%>

	<article class="red box">
		<%-- <jsp:include page="${ fileUrl }" flush="true"/> --%>
		<jsp:include page="${ fileUrl }" />
	</article>
<br>
	<footer class="squeare red box">
	ここはフッターです
	</footer>

	<script type="text/javascript" src="/bourgeoisie/system/package_css/js/libs/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="/bourgeoisie/system/package_css/js/groundwork.all.js"></script>
</body>
</html>