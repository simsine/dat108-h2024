<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="simple.css">
  </head>
  <body>
	<h4>Bokliste</h4>
	<!--  Fyll inn lenker til nytt søk og alle bøker -->
	<a href="sokeside.html">Gjør et nytt søk</a>
	<a href="alleboker">Se alle bøker</a>
	<table><tr>
			<th align="left">Tittel</th>
			<th align="left">Forfatter</th>
			<th>År</th>
		</tr>
		<c:forEach var="bok" items="${bokListe}">
		<tr>
			<td align="left">${bok.tittel}</td>
			<td align="left">${bok.forfatter}</td>
			<td>$bok.utgivelsesaar}</td>
		</tr>
		</c:forEach>
	</table>
	
  </body>
</html>
