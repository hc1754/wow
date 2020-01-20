<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <form action ="emailForm.do" method = "post">
	   	<input type="text" name = "mem_email" placeholder="이메일"><input type="submit" value="인증번호 전송">
	   	<input type="text" name = "mem_pass" placeholder="비밀번호" />
	   	<input type="submit" value="이메일 인증">
	  </form>
</body>
</html>