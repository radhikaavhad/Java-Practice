<%@ page import = "com.dao.BookDAO"%>
<%@ page import = "com.dao.BookDAOImpl"%>
<%@ page import = "com.model.Book"%>
<%@ page import = "java.util.*"%>

<html>

<body>
    <h1>View all Books</h1>

<%-- Basic 4 tags of JSP --%>
<%-- funtions and classes are not allowed in jsp --%>
<%-- Transpilation - java converts .jsp into servlet ie .java class internally --%>


<%-- Declarative - declare instance level objects / variables  || instance level : inside class , outside function --%>
    <%-- <%! String  msg = "Instance Hi"; %> --%>


<%-- Scriptlet - Declare local level logic ie for loops , switch case , if else ,etc  || local - inside function --%>
    <%-- <% String  msg = "Local Hi"; %> --%>


<%-- Expression - Display variables on html page --%>
<%-- <%= msg %>  will dispplay local hi as it is the nearest msg --%>

<%-- <% String colorName = "red"; %>
<p style = "color : <%=colorName%>">Text</p> --%>


<%-- Directive - Import, MetaData --%>
    <%-- <%@ page import ="java.util.List" %> --%>


<%
    BookDAO dao = new BookDAOImpl();
    List<Book> books = dao.view();
    if (books == null){
 %>

<p>No books to display</p>

<%
    }
    else{
%>


<table border collapse = "collapse">
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