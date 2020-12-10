<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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

<button onclick="myFunction()">Clickeame</button>

<div id="myDIV" style="border:1px solid black;" hidden="block">
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
</div>

</body>
</html>