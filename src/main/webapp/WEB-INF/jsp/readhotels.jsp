<html lang="en">
<head>
	<title></title>
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class="container-fluid">
		<span class="login100-form-title p-b-34">HOTEL DETAILS</span>
			 <table class="table">
                <thead >
                    <th scope="col" bgcolor="#000000" style="color:white;">ID</th>
					<th scope="col" bgcolor="#000000" style="color:white;">HOTEL NAME</th>
					<th scope="col" bgcolor="#000000" style="color:white;">LOCATION</th>
                    <th scope="col" bgcolor="#000000" style="color:white;">PHONE NO.</th>
                    <th scope="col" bgcolor="#000000" style="color:white;"></th>
                    <th scope="col" bgcolor="#000000" style="color:white;"></th>
			    </thead>

			<c:forEach var="hotels" items="${hotels}">
			    <tbody>
                  <tr>
                    <th scope="row">${hotels.id}</th>
            		<td>${hotels.name}</td>
            		<td>${hotels.location}</td>
                    <td>${hotels.phoneNumber}</td>
                    <td><a href="/update-hotels/${hotels.id}">Update</a></td>
                    <td><a href="/delete-hotels/${hotels.id}">Remove</a></td>
                  </tr>
                </tbody>
            </c:forEach>
           </table>
	</div>

   <div class="container col-sm-3" >
       <button class="login100-form-btn">
         <a href="/create-hotels">ADD NEW HOTEL</a>
        </button>
   </div>

	<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>


</body>

</html>

<style>
div {
  padding: 25px 25px 25px 25px;
}
</style>
