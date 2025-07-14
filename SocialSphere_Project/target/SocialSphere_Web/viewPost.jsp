<%@ page import="java.util.List"%>
<%@ page import="com.dto.UserPostJoin"%>

<html>
<body>

<h1>All Posts</h1>

<%
    List<UserPostJoin> posts = (List<UserPostJoin>)request.getAttribute("posts");
    if (posts == null || posts.isEmpty()){
 %>

<p>No posts to display</p>

<%
    }
    else{
    for(UserPostJoin post : posts){
%>

<p>User:<%= post.getUserName() %></p>
<p>Title:<%= post.getPostTitle() %></p>
<p>Content:<%= post.getPostContent() %></p>
<p>Time:<%= post.getPostTime() %></p>

<form action="ControllerServlet">
<input type="hidden" name="postId" value="<%= post.getPostId()%>">

<input type="text" placeholder="Enter Comment" name="commentContent" required/>
<input type="submit" value="Add Comment" name="operation"/>
</form>

<form action="ControllerServlet">
<input type="hidden" name="postId" value="<%= post.getPostId()%>">
<input type="submit" value="View Comments" name="operation"/>
</form>
<hr>

<% }
    }
%>

</body>
</html>
