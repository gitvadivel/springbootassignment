<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Add Subject</title>
</head>
<body>
  <form:form action="addSubject" modelAttribute="subjectObj">
    Subject Id: <form:input type="text" path="subjectId" placeholder="Subject Id" /><br><br>
    Subject Title: <form:input type="text" path="subtitle"  placeholder="Subject Title" /><br><br>
    Duration in Hours: <form:input type="text" path="durationInHours" placeholder="Duration in Hours" /><br><br>
    <button>Save Subject</button>
    <input type="reset" value="Reset Subject fields">
  </form:form>
</body>
</html>