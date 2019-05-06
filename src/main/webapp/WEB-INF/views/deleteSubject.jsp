<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Delete Subject</title>
</head>
<body>
  <form:form action="deleteSubject" modelAttribute="subjectObj">
    Subject Id: <form:input type="text" path="subjectId" placeholder="Subject Id" /><br><br>
    <button>Delete Subject</button>
    <input type="reset" value="Reset Subject fields">
  </form:form>
</body>
</html>