<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>SilentWays</title>
        <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">   
        
    </head>
    <body>
        <h1>Generated MCQ</h1>
        <form name="mcq" action="/qcmCheck" method="POST" modelAttribute="mcq">
        <div ><br>
            Question 1: What is F's major third ? <br/><br/>
            <input type="radio" name="g1" value="E"> E
            <input type="radio" name="g1" value="Ab"> Ab
            <input type="radio" name="g1" value="G"> G
            <br/><br/><br/>
            Question 2:  What is F's minor third ?<br/><br/>
            <input type="radio" name="g2" value="A"> A
            <input type="radio" name="g2" value="Gb"> Gb
            <input type="radio" name="g2" value="Eb"> Eb
            </div>
            <br/>
            <button type="button" id="add" class="btn btn-info" onclick="check()">Send</button>
        </form>
    </body>
</html>
