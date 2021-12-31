<%@ page import="com.example.assignment.entity.Food" %>
<%@ page import="java.util.ArrayList" %><%
  request.setCharacterEncoding("utf-8");
  ArrayList<Food> list = (ArrayList<Food>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
  <jsp:include page="/admin/include/header.jsp">
    <jsp:param name="title" value="Purple House"/>
  </jsp:include>
</head>
<body class="w3-light-grey">

<jsp:include page="/admin/include/left-menu.jsp"/>
<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px">

  <!-- Header -->
  <header id="portfolio">
    <div class="w3-container" style="padding-top:22px;">
      <h2><b style="color: purple">Main Menu</b></h2>
    </div>
  </header>
  <div class="w3-container" style="padding-top:30px; ">
    <table class="w3-table-all">
      <tr>
        <th>ID</th>
        <th>Thumbnail</th>
        <th>Name</th>
        <th>Price</th>
        <th>Start Date</th>
        <th>Edit Date</th>
        <th>Status</th>
        <th>Action</th>
      </tr>
      <%
        for (int i = 0; i < list.size(); i++){
      %>
      <tr>
        <th><%=list.get(i).getId()%></th>
        <th>
          <img src="<%=list.get(i).getThumbnail()%>" style="width: 100px; height: 70px" class="w3-border w3-padding" alt="Alps">
        </th>
        <th><%=list.get(i).getName()%></th>
        <th><%=list.get(i).getPrice()%></th>
        <th><%=list.get(i).getStartDate()%></th>
        <th><%=list.get(i).getEditDate()%></th>
        <th><%=list.get(i).getStatus()%></th>
        <th>
          <a href="/admin/product/edit?id=<%=list.get(i).getId()%>">Edit</a>&nbsp;
          <a class="btn-delete" onclick="deleteFood(<%= list.get(i).getId()%>)" href="#">Delete</a>
        </th>
      </tr>
      <%
        }
      %>
    </table>
  </div>
  <!-- Footer -->
  <jsp:include page="/admin/include/footer.jsp"/>

</div>
<jsp:include page="/admin/include/script.jsp"/>
<script>
  function deleteFood(id){
    if (confirm('Bạn muốn xóa sản phẩm này?')){
      var xhr = new XMLHttpRequest();
      xhr.onreadystatechange = function (){
        if (xhr.readyState == 4 && xhr.status == 200){
          alert('Xóa sản phẩm thành công');
          window.location.reload();
        }
      };
      xhr.open('DELETE', '/admin/product/delete?id=' + id);
      xhr.send();
    }
  }
</script>
</body>
</html>
