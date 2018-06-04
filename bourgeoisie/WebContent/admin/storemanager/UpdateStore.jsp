<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    	<style type="text/css">
	.square_btn{
    display: inline-block;
    padding: 0.5em 1em;
    text-decoration: none;
    background: #FA8072	;/*ボタン色*/
    color: #FFFFFF;
    border-bottom: solid 4px #FF4F50;
    border-radius: 3px;
}
.square_btn:active {/*ボタンを押したとき*/
    -ms-transform: translateY(4px);
    -webkit-transform: translateY(4px);
    transform: translateY(4px);/*下に動く*/
    border-bottom: none;/*線を消す*/
}
</style>

  <h1>店舗情報の編集</h1>

  <div
	style="padding: 10px; margin-bottom: 10px; border: 1px solid #333333; border-radius: 10px;">
	<form action="./UpdateCompleteServlet" method="post">
	<input type="hidden" name="storeid" value="${detail_store.storeid}" >
	  店舗名： <input type="text" name="storename" value="${detail_store.storename}" ><br/>
	  店舗情報： <input type="text" name="storeinfomation" value="${detail_store.storeinfomation}"><br/>
	  ジャンル： <input type="text" name="genreno" value="${detail_store.genreno}"><br/>
	  コスト： <input type="text" name="cost" value="${detail_store.cost}"><br/>
	  住所： <input type="text" name="address" value="${detail_store.address}"><br/>
	  電話番号： <input type="text" name="phoneno" value="${detail_store.phoneno}"><br/>
	  営業時間： <input type="text" name="open" value="${detail_store.open}"><br/>
	  店舗URL： <input type="text" name="url" value="${detail_store.url}" ><br/>
	  メールアドレス： <input type="text" name="mailaddress" value="${detail_store.mailaddress}" ><br/>
	  運営会社： <input type="text" name="operatingconpany" value="${detail_store.operatingcompany}" ><br/>
	  代表者： <input type="text" name="representative" value="${detail_store.representative}" ><br/>
	  店長： <input type="text" name="storemanager" value="${detail_store.storemanager}" ><br/>

	  <button type="submit">登録する</button>


	  <br/><br/><br/>
	</form>
	</div>