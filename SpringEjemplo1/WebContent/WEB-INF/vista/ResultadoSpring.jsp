<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/recursos/css/hojaEstilos.css">
<title>Resultado Formulario</title>
</head>
<body>

<h1>Hola ${param.nombreAlumno}. Bienvenido al curso de Spring </h1>
<p><br>
<h2> Segundo formulario </h2>

${mensajeCompleto }

<br>

<img alt="logo" src="${pageContext.request.contextPath}/recursos/img/img_01.png"/>
</body>
</html>