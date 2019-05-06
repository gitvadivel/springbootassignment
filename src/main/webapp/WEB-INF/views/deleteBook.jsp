<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Delete Book</title>
</head>

<body>
  <form:form action="deleteBook" modelAttribute="bookObj">
    Book Id: <form:input type="text" path="bookId" placeholder="Book Id" /><br><br>
    <button>Delete Book</button>
    <input type="reset" value="Reset Book fields">
  </form:form>
</body>

</html>