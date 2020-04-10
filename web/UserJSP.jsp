<%-- 
    Document   : UserJSP
    Created on : 10-Apr-2020, 19:40:32
    Author     : Rob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
		<table border="1">
					<thead>
						<tr>
							<th>Data:</th>
							<th></th>
						</tr>
					</thead>
					
					<tbody>
						
						<tr>
							<th>First Name:</th>
							<th><h:inputText value="${web.fName}"></h:inputText></th>
						</tr>
						
						<tr>
							<th>Last Name:</th>
							<th><h:inputText value="${web.lName}"></h:inputText></th>
						</tr>
						
						<tr>
							<th>Email:</th>
							<th><h:inputText value="${web.email}"></h:inputText></th>
						</tr>
						
						<tr>
							<th>Password:</th>
							<th><h:inputText value="${web.password}"></h:inputText></th>
						</tr>
						
						
						<tr>
							<th>Address:</th>
							<th><h:inputText value="${web.address}"></h:inputText></th>
						</tr>
					</tbody>
					
					<input type="submit" action="${web.save()}"/>
					
					
					
					
					
					
					
				</table>
	
    </body>
</html>
