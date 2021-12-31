<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.assignment.entity.Phone" %>
<%
  request.setCharacterEncoding("utf-8");
  ArrayList<Phone> list = (ArrayList<Phone>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
  <jsp:include page="/admin/include/header.jsp">
    <jsp:param name="title" value="Phone"/>
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
      <h2><b style="color: purple">Main List Phone</b></h2>
    </div>
  </header>
  <div class="w3-container" style="padding-top:30px; ">
    <table class="w3-table-all">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Description</th>
        <th>Price</th>
      </tr>
      <%
        for (int i = 0; i < list.size(); i++){
      %>
      <tr>
        <th><%=list.get(i).getId()%></th>
        <th><%=list.get(i).getName()%></th>
        <th><%=list.get(i).getPrice()%></th>
        <th><%=list.get(i).getBrand()%></th>
        <th><%=list.get(i).getDescription()%></th>
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

</body>
</html>
