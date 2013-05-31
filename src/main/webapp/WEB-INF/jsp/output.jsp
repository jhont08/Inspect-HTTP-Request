<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inspect HTTP Requests</title>
    </head>

    <body>
        <h2>Showing Request Headers.</h2>
 
    <table border="1">
        <c:forEach var="person" items="${personList}">
            <table border="1">
                Request Method: ${person.method} <br />
                Request URL: ${person.url} <br />
                <tr>
                    <td>Accept</td><td>${person.accept}</td>
                </tr>
                <tr>
                    <td>Accept-Encoding:</td><td>${person.acceptEnc}</td>
                </tr>
                <tr>
                    <td>Accept-Language:</td><td>${person.acceptLan}</td>
                </tr>
                <tr>
                    <td>Connection:</td><td>${person.connection}</td>
                </tr>
                <tr>
                    <td>Cookie:</td><td>${person.cookie}</td>
                </tr>
                <tr>
                    <td>Host:</td><td>${person.host}</td>
                </tr>
                <tr>
                    <td>Referer:</td><td>${person.referer}</td>
                </tr>
                <tr>
                    <td>User-Agent:</td><td>${person.userAgent}</td>
                </tr>
                <tr>
                    <td>X-Requested-With:</td><td>${person.XRequestedWith}</td>
                </tr><br />
            </table><br />
        </c:forEach>
    </table>  
    </body>
</html>
