<%@ page import="java.util.List"%>
<%@ page import="com.model.Comment"%>

<html>
<body>

<h1>All Comments</h1>

<%
    List<Comment> comments = (List<Comment>)request.getAttribute("comments");
    if (comments == null || comments.isEmpty()){
 %>

<p>No comments to display</p>

<%
    }
    else{
    for(Comment comment : comments){
%>
<p>Comment:<%= comment.getCommentContent() %></p>
<% }
    }
%>

</body>
</html>
