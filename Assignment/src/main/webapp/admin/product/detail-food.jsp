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
    <header class="w3-container" style="padding-top:22px">
        <h5><b style="color: purple"><i class="fa fa-plus-square" ></i> New Food Form</b></h5>
    </header>

    <div class="w3-padding w3-margin-bottom">
            <div class="w3-margin">
                <label>ID</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>Name</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>ID Category</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>Price</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>Description</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>Thumbnail</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>Start Date</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>Edit Date</label>
                <p></p>
            </div>
            <div class="w3-margin">
                <label>Status</label>
                <p></p>
            </div>
    </div>
    <hr>

    <!-- Footer -->
    <jsp:include page="/admin/include/footer.jsp"/>
    <!-- End page content -->
</div>
<jsp:include page="/admin/include/script.jsp"/>
</body>
</html>
