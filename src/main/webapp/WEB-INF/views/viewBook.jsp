<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Book Details</title>
</head>

<body>
    Book Id: ${bookObj.bookId} <br><br>
    Subject Title: ${bookObj.subject.subtitle} <br><br>
    Book Title: ${bookObj.title} <br><br>
    Price: ${bookObj.price} <br><br>
    Volume: ${bookObj.volume} <br><br>
    Publish Date: ${bookObj.publishDate} <br><br>
	<a href="${pageContext.request.contextPath}/">Go back to main menu</a>
</body>

</html>