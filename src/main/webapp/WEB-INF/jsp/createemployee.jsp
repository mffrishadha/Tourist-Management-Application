<!DOCTYPE html>
<html lang="en">
<head>
	<title>Tour Management</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
		  <div class="limiter" align="center">
                      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
                                   <form method="post" class="login100-form validate-form align-top" action="/create-employee">
                                   	<span class="login100-form-title p-b-34">EMPLOYEE REGISTRATION</span>

                     					<div class="wrap-input100 rs1-wrap-input100 validate-input m-b-20" data-validate="Type First name">
                     						<form:input path="firstname" class="input100" type="text" placeholder="First name"/>
                     						<span class="focus-input100"></span>
                     					</div>
                     					<div class="wrap-input100 rs2-wrap-input100 validate-input m-b-20" data-validate="Type Last name">
                     						<form:input path="lastname" class="input100" type="text" placeholder="Last name"/>
                     						<span class="focus-input100"></span>
                     					</div>
                     					<div class="wrap-input100  validate-input m-b-20" data-validate="Type username" >
                     						<form:input path="username" class="input100" type="text" placeholder="User name"/>
                     						<span class="focus-input100"></span>
                     					</div>
                     					<div class="wrap-input100 validate-input m-b-20" data-validate="Type password">
                     						<form:input path="password" class="input100" type="password"placeholder="Password"/>
                     						<span class="focus-input100"></span>
                     					</div>
                     					<div class="wrap-input100 validate-input m-b-20"data-validate="Type phone number" >
                     						<form:input path="phoneNo" class="input100" type="text"placeholder="Phone number"/>
                     						<span class="focus-input100"></span>
                     					</div>
                     					<div class="wrap-input100 validate-input m-b-20" data-validate="Type email">
                     						<form:input path="email" class="input100" type="text" placeholder="Email"/>
                     						<span class="focus-input100"></span>
                     					</div>
                     					<div class="wrap-input100 validate-input m-b-20">
                     						<form:input path="nic" class="input100" type="text" placeholder="NIC"/>
                     						<span class="focus-input100"></span>
                     					</div>
                                        <div class="wrap-input100 validate-input m-b-20">
                                          	<form:input path="passportNo" class="input100" type="text" placeholder="Passport number"/>
                                          	<span class="focus-input100"></span>
                                        </div>
                     						<div class="form-group wrap-input100 validate-input m-b-20" data-validate="Select user type">
                                                 <select class="form-control" name="userType">
                                                    <option value="" >-- Select User Type -- </option>
                                                    <option value="Customer">Customer</option>
                                                    <option value="Employee">Employee</option>
                                                 </select>
                                            </div>


                     					<div class="container-login100-form-btn">
                     						<button class="login100-form-btn"  type="submit">
                     							REGISTER
                     						</button>
                     					</div>

                     				</form>
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