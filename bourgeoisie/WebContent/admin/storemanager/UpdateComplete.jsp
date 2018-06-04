<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style type="text/css">
.square_btn {
	display: inline-block;
	padding: 0.5em 1em;
	text-decoration: none;
	background: #FA8072; /*ボタン色*/
	color: #FFFFFF;
	border-bottom: solid 4px #FF4F50;
	border-radius: 3px;
}

.square_btn:active { /*ボタンを押したとき*/
	-ms-transform: translateY(4px);
	-webkit-transform: translateY(4px);
	transform: translateY(4px); /*下に動く*/
	border-bottom: none; /*線を消す*/
}
</style>

登録が完了しました。
<br>
<br>
<button type="submit">TOPへ戻る</button>