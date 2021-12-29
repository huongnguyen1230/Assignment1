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
        <h5><b><i class="fa fa-plus-square"></i> Product Form</b></h5>
    </header>

    <div class="w3-padding w3-margin-bottom">
        <form action="/admin/product/create" method="post" class="w3-container w3-padding w3-card-4 w3-margin">
            <div class="w3-margin">
                <label>Name</label>
                <input class="w3-input" type="text" name="name">
            </div>
            <div class="w3-margin">
                <label>Price</label>
                <input class="w3-input" type="number" name="price">
            </div>
            <div class="w3-margin">
                <label>Description</label>
                <input class="w3-input" type="text" name="description">
            </div>
            <div class="w3-margin">
                <label>Thumbnail</label>
                <input class="w3-input" type="url" name="thumbnail">
            </div>
            <div class="w3-margin">
                <label>Status</label>
                <input class="w3-input" type="number" name="status">
            </div>
            <button class="w3-btn w3-blue w3-margin">Submit</button>
        </form>
    </div>
    <hr>

    <!-- Footer -->
    <jsp:include page="/admin/include/footer.jsp"/>
    <!-- End page content -->
</div>
<jsp:include page="/admin/include/script.jsp"/>
</body>
</html>
