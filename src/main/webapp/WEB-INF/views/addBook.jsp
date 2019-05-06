<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Add Book</title>
</head>
<body>
  <form:form action="addBook" modelAttribute="bookObj">
    Subject Id: <form:input type="text" path="subject.subjectId" placeholder="Subject Id" /><br><br>
    Book Id: <form:input type="text" path="bookId" placeholder="Book Id" /><br><br>
    Title: <form:input type="text" path="title"  placeholder="Title" /><br><br>
    Price: <form:input type="text" path="price" placeholder="Price" /><br><br>
    Volume: <form:input type="text" path="volume" placeholder="Volume" /><br><br>
    Publish Date (MM/dd/yyyy): <form:input type="text" path="publishDate" placeholder="Publish Date" /><br><br>    
    <button>Save Book</button>
    <input type="reset" value="Reset Book fields">
  </form:form>
</body>
</html>