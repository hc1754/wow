<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<div class="container">
  <a href="/joinForm.do" class="btn btn-primary">회원가입</a>
</div>
<P>  The time on the server is ${serverTime}. </P>


	<form action ="joinForm.do" method = "post">
      <input type="text" name = "mem_email" placeholder="이메일"><br>
      <input type="text" name = "mem_pass" placeholder="비밀번호" /><br>
      <input type="text" name= "mem_authId" placeholder="인증번호 " /><br>
      <input type="text" name = "mem_hp" placeholder="전화번호" /><br>
      <input type="submit" value="회원가입">
 	 </form>























<%-- <!-- 이메일 보내기 폼 -->
	<form action ="e_mailForm.do" method = "post">
      <input type="text" name = "recipient_front" placeholder="이메일을 입력해주세요.	">
      <select name="recipient_back" type="text" >
                  <option value = "@naver.com">@naver.com</option>                
                  <option value = "@hanmail.net">@hanmail.net</option>
                  <option value = "@gmail.com">@gmail.com</option>
                  <option value = "@nate.com">@nate.com</option>
      </select>
      <button type = "submit" name = "submit" >이메일 중복확인</button>
      <button type = "submit" name = "submit" >인증번호 전송</button>
      <input type="text" style="border:0" name="title" />
      <input type="text" style="border:0" name = "text" />
  </form>


	<form action ="authIdCheck.do" method = "post">
		<input type="text" name="authId" placeholder="인증번호를 입력해주세요.">
  	 	<button type = "submit" name = "submit" >인증번호 확인</button>
	</form>

  	<form:form action="${pageContext.request.contextPath}/joinForm" commandName="member">
	        <input type="password" name="mem_pass" placeholder="비밀번호를 입력해주세요." maxlength="40" /><br>
	        <input type="password" name="mem_pass" placeholder="비밀번호 확인" maxlength="40" /><br>
	        <input type="text" name="mem_hp" placeholder="전화번호를 입력해주세요." maxlength="40" /><br>
	        <div>
				<a href="${pageContext.request.contextPath}/" class="btn btn-default">홈으로</a>
				<input type="button" id="id_submit_btn" class="btn btn-success" value="회원가입" />
			</div>
	</form:form> 
   --%>
</body>
</html>
