<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location|registration</title>
</head>
<body>
<h2>location registration</h2>
<form action="saveLoc" method="post">
id<input type="text"name="id"/>
name<input type="text"name="name"/>
code<input type="text"name="code"/>
type:
 urban <input type="radio" name="types" value="urban"/>
  rural <input type="radio" name="types" value="rural"/>
      <input type="submit"  value="save"/>
    
  
 





</form>
${saved} 

</body>
</html>