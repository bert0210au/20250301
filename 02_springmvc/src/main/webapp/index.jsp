<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="login" method="get">
		帳號：<input type="text" name="jspusername" />
		<br/>
		密碼：<input type="text"name="jsppassword" />
		<br/>
		<button type="submit">送出</button>
	</form>
	
	<hr/>
	
	<form action="param/class" method="POST">
    暱稱: <input type="text" name="nickname"/> <br>
    手機: <input type="text" name="phone"/> <br>
    興趣：<br>
    <input type="checkbox" name="hobby" value="吃飯"/>吃飯
    <input type="checkbox" name="hobby" value="睡覺"/>睡覺
    <input type="checkbox" name="hobby" value="打東東"/>打東東
    <br>
    <input type="submit" />
	</form>
	
	<hr/>
	
	<form action="loginModel" method="get">
		帳號：<input type="text" name="jspusername" />
		<br/>
		密碼：<input type="text"name="jsppassword" />
		<br/>
		<button type="submit">送出</button>
	</form>
	
	<hr/>
	
	<form action="loginModelAndView" method="POST">
    暱稱: <input type="text" name="nickname"/> <br>
    手機: <input type="text" name="phone"/> <br>
    興趣：<br>
    <input type="checkbox" name="hobby" value="吃飯"/>吃飯
    <input type="checkbox" name="hobby" value="睡覺"/>睡覺
    <input type="checkbox" name="hobby" value="打東東"/>打東東
    <br>
    <input type="submit" />
	</form>
	
	<hr/>
	
<form action="loginModelAttribute" method="POST">
    暱稱: <input type="text" name="nickname"/> <br>
    手機: <input type="text" name="phone"/> <br>
    興趣：<br>
    <input type="checkbox" name="hobby" value="吃飯"/>吃飯
    <input type="checkbox" name="hobby" value="睡覺"/>睡覺
    <input type="checkbox" name="hobby" value="打東東"/>打東東
    <br>
    <input type="submit" />
	</form>
	

</body>
</html>