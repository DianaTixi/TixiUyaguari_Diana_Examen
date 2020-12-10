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
            <li class="tab active"><a href="#">Sign Up</a></li>
        </ul>
		<div class="datos">
          <form id="formulario01" action="/TixiUyaguari_Diana_Examen/CrearPersonaController" method="post">
	
		     <input type="text" id="cedula" name="cedula" value="" placeholder="Ingrese la Cedula ..." />
		     <br><br>
		     
		     <input type="text" id="nombre" name="nombre" value="" placeholder="Ingrese el Nombre ..." />
		     <br><br>
		     
		     <input type="text" id="apellido" name="apellido" value="" placeholder="Ingrese el Apellido..." />
		     <br><br>
		     <input type="text" id="email" name="email" value="" placeholder="Ingrese el Email..." />
		     <br><br>
		     <input type="password" id="pass" name="pass" value="" placeholder="Ingrese su Contrasena..." />
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
			<div id="myDIV" style="border:1px solid black;" hidden="block">
  			<input type="text" id="numero2" name="numero2" value="" placeholder="Ingrese el Numero de Telefono..." />
                    <br><br>
                    <SELECT name="operadora2">
					<option value=_"Seleccionar Tipo  " selected >Seleccionar Tipo</option>
					<c:forEach var="o" items="${operadora}">
							<option>${o.ope_nombre}</option>
				        </c:forEach>
				    </SELECT>
				    <br><br>
				    <SELECT name="tipo2">
					<option>Seleccionar Tipo</option>
					<c:forEach var="t" items="${tipo}">
							<option>${t.tip_nombre}</option>
				        </c:forEach>
				    </SELECT><br><br>
			</div>
			<input type="submit" id="login" name="login" value="Crear" />
			<input type="reset" value="Cancelar" />             
	</form>
	<button onclick="myFunction()">Clickeame</button>
	<script type="text/javascript">
function myFunction() {
    var x = document.getElementById("myDIV");
    if (x.style.display === "block") {
        x.style.display = "block";
    } else {
        x.style.display = "block";
    }
}
</script>
</div>
</div>

   
   
 
	
</body>
</html>