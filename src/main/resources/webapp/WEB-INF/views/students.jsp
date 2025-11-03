<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Students</title></head>
<body>
<h2>Student List</h2>

<ul>
    <c:forEach items="${students}" var="s">
        <li>${s.name}</li>
    </c:forEach>
</ul>

<form action="add" method="post">
    <input type="text" name="name" placeholder="Enter student name"/>
    <button type="submit">Add</button>
</form>
</body>
</html>