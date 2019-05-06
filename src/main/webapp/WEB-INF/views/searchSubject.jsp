<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Add Subject</title>
</head>
<body>
  <form:form action="searchSubject" modelAttribute="subjectObj">
    Subject Id: <form:input type="text" path="subjectId" placeholder="Subject Id" /><br><br>
    <button>Search Subject</button>
    <input type="reset" value="Reset Subject fields">
  </form:form>
</body>
</html>