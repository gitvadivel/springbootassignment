<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Add Subject</title>
</head>
<body>
    Subject Id: ${subjectObj.subjectId} <br><br>
    Subject Title: ${subjectObj.subtitle} <br><br>
    Duration in Hours: ${subjectObj.durationInHours} <br><br>
    <a href="${pageContext.request.contextPath}/">Go back to main menu</a>
</body>
</html>