<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


  <div class="red box">
  <h3>検索</h3>
  <p>検索項目を入力する</p>
	<form action="search">
	  <div class="row gap-bottom">
	    <div class="two fourths small-tablet pad-right no-pad-mobile">
	      <input name="keyword" value="${ keyword }" placeholder="キーワード">
	    </div>
	    <div class="one fourths small-tablet pad-right no-pad-mobile">
	    	<select name="genreno">
	      	<option value="0">すべて</option>
	<c:forEach var="genre" items="${genre_list}">

	<c:if test="${genreno == genre.genreno}" >
	<option value="${genre.genreno }" selected>${ genre.genre }</option>
	</c:if>
	<c:if test="${genreno != genre.genreno}" >
	<option value="${genre.genreno }">${ genre.genre }</option>
	</c:if>
	</c:forEach>
	      </select>
	     </div>
	    <div class="one fourth small-tablet">
	      <button class="block asphalt">検索</button>
	    </div>
	  </div>
  </form>
	</div>

<%--
<form action="search" method="get" >
検索:<input type="text" name="keyword" value="${ keyword }">

<select name="genreno">
	<option value="0">すべて</option>
	<!-- koko -->
	<c:forEach var="genre" items="${genre_list}">

	<c:if test="${genreno == genre.genreno}" >
	<option value="${genre.genreno }" selected>${ genre.genre }</option>
	</c:if>
	<c:if test="${genreno != genre.genreno}" >
	<option value="${genre.genreno }">${ genre.genre }</option>
	</c:if>
	</c:forEach>
<!--
	<option value="1">レストラン</option>
	<option value="2">Cafe</option>
	<option value="3">居酒屋</option>
	<option value="4">病院</option>
	<option value="5">書店</option>
	<option value="6">自転車</option>
	<option value="7">金属加工</option>
	<option value="8">木材</option>
	<option value="9">博物館</option>
	<option value="10">カメラ</option>
	<option value="11">ダイニングバー</option>
	<option value="12">イタリアン・フレンチ</option>
	<option value="13">中華</option>
	<option value="14">創作料理</option>
	<option value="15">お好み焼き・もんじゃ・鉄板焼き</option>
	<option value="16">和食</option>
	<option value="17">焼肉・韓国料理</option>
	<option value="18">カラオケ・パーティ</option>
	<option value="19">アジアン</option>
	<option value="20">各国料理</option>
	<option value="21">カフェ・スイーツ</option>
	<option value="22">バー・カクテル</option>
	<option value="23">洋食</option>
	<option value="24">その他グルメ</option>
 -->
	<!-- made -->
</select>

<input type="submit" value="検索">
</form>
 --%>