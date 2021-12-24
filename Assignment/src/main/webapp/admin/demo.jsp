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
            <h4><b>Main Menu</b></h4>
        </div>
    </header>
    <div class="w3-container" style="padding-top:30px; ">
        <table class="w3-table-all">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th class="w3-center">Points</th>
            </tr>
            <tr>
                <td>Jill</td>
                <td>Smith</td>
                <td class="w3-center">50</td>
            </tr>
            <tr>
                <td>Eve</td>
                <td>Jackson</td>
                <td class="w3-center">94</td>
            </tr>
            <tr>
                <td>Adam</td>
                <td>Johnson</td>
                <td class="w3-center">67</td>
            </tr>
        </table>
    </div>
    <!-- Footer -->
    <jsp:include page="/admin/include/footer.jsp"/>


    <!-- End page content -->
</div>
<jsp:include page="/admin/include/script.jsp"/>
</body>
</html>

