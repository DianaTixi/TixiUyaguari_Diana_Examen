<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

    <link href="css/registrase.css" rel="stylesheet" type="text/css" />
    <link href="css/busqueda.css" rel="stylesheet" type="text/css" />
<title>Gestión de personas en la Web</title>
</head>
<body>
	<div class="form">
        <ul class="tab-group">
            <li class="tab "><a href="/TixiUyaguari_Diana_Examen/login.html">Log In</a></li>
            <li class="tab active"><a href="#">Crear Telefono</a></li>
        </ul>
		<div class="datos">
          <form id="formulario01" action="/TixiUyaguari_Diana_Examen/CrearTelefonoController" method="post">
	
		     <input type="text" id="cedula" name="cedula" value="" placeholder="Ingrese la Cedula ..." />
		     <br><br>
		     
		     <input type="text" id="numero" name="numero" value="" placeholder="Ingrese el Numero de Telefono..." />
		     <br><br>
		     <SELECT name="operadora">
			 <option value=_"Seleccionar Tipo  " selected >Seleccionar Tipo</option>
			 <c:forEach var="o" items="${operadora}">
					<option>${o.ope_nombre}</option>
		        </c:forEach>
		     </SELECT>
		     <br><br>
		     <SELECT name="tipo">
			 <option>Seleccionar Tipo</option>
			 <c:forEach var="t" items="${tipo}">
					<option>${t.tip_nombre}</option>
		        </c:forEach>
		     </SELECT><br><br>
		     <br>
			<input type="submit" id="login" name="login" value="Crear" />
			<input type="reset" value="Cancelar" />             
	</form>
	
</script>
</div>
</div>

   
   
 
	
</body>
</html>