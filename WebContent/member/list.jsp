<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function del(id, pwd) {
	var frm = document.frmResult;
	var returnValue = prompt("비밀번호를 입력하세요.", "");
	
	if(returnValue== pwd) {
		frm.userid.value = id;
		frm.userpwd.value = pwd;
		frm.action = 'delete.do';
		frm.submit();
	}else {
		alert("비밀번호가 틀렸습니다.");
		return;
	}
}

function mod(id, pwd) {
	var frm = document.frmResult;
	var returnValue = prompt("비밀번호를 입력하세요.", "");
	
	if(returnValue== pwd) {
		var changeValue = prompt("수정할 비밀번호를 입력하세요.", "");
		frm.userid.value = id;
		frm.userpwd.value = changeValue;
		frm.action = 'modify.do';
		frm.submit();
	}else {
		alert("비밀번호가 틀렸습니다.");
		return;
	}
}


</script>
</head>

<body>

<h2>회원검색 form</h2>

<form name='frm' method='post' action='list.do'>
   <label>아이디검색</label>
   <input type='text' name='userid'/><br/>
   <input type='submit' value='회원검색하기'/>
</form>

<c:forEach var='obj' items='${list}'  >
	<span>유저아이디 : ${obj.userid }</span>
	<input type="button" value='삭제' onclick="del('${obj.userid }','${obj.userpwd }')">
	<input type="button" value='수정' onclick="mod('${obj.userid }','${obj.userpwd }')">
 </c:forEach>

<form name='frmResult' method='post'>
	<input type="hidden" name='userid'>
	<input type="hidden" name='userpwd'>
	<br/>
</form>

</body>
</html>