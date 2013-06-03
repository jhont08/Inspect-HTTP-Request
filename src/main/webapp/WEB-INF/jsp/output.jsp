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
        <c:forEach var="httprequest" items="${HTTPRequestList}">
            <table border="1">
                Request Method: ${httprequest.method} <br />
                Request URL: ${httprequest.url} <br />
                <tr>
                    <td>Accept</td><td>${httprequest.accept}</td>
                </tr>
                <tr>
                    <td>Accept-Encoding:</td><td>${httprequest.acceptEnc}</td>
                </tr>
                <tr>
                    <td>Accept-Language:</td><td>${httprequest.acceptLan}</td>
                </tr>
                <tr>
                    <td>Connection:</td><td>${httprequest.connection}</td>
                </tr>
                <tr>
                    <td>Cookie:</td><td>${httprequest.cookie}</td>
                </tr>
                <tr>
                    <td>Host:</td><td>${httprequest.host}</td>
                </tr>
                <tr>
                    <td>Referer:</td><td>${httprequest.referer}</td>
                </tr>
                <tr>
                    <td>User-Agent:</td><td>${httprequest.userAgent}</td>
                </tr>
                <tr>
                    <td>X-Requested-With:</td><td>${httprequest.XRequestedWith}</td>
                </tr><br />
            </table><br />
        </c:forEach>
    </table>  
    </body>
</html>
