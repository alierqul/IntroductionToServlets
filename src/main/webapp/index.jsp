<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servletlere Bir Bakış</title>
<title>JSP sayfası</title>
</head>
<body>
	<h1>Servlet Veri Gönderme</h1>
	<form action="MyServletClass">
		<table>
			<tr>
				<td>Kullanıcı Adı :</td><td><input type="text" name="userName"></td>
				
			</tr>
			<tr>
				<td>Paralo        :</td><td><input type="text" name="password"></td>
				
			</tr>
			
			<tr>
				<td><input type="submit" value="Gönder"></td>
				
			</tr>
			
		</table>
	</form>
</body>
</html>