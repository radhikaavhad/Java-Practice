<%@ page import = "com.dao.BookDAO"%>
<%@ page import = "com.dao.BookDAOImpl"%>
<%@ page import = "com.model.Book"%>
<%@ page import = "java.util.*"%>

<html>

<body>
    <h1>View all Books</h1>

<%
    List<Book> books = (List<Book>)request.getAttribute("books");
    if (books == null){
 %>

<p>No books to display</p>

<%
    }
    else{
%>


<table border collapse>
<tr>
<th>Id</th>
<th>Book</th>
<th>Price</th>
</tr>

<%
for (Book book : books) {
%>

<tr>
<td><%=book.getId()%></td>
<td><%=book.getName()%></td>
<td><%=book.getPrice()%></td>

<%
}
}
%>


</table>


</body>

</html>