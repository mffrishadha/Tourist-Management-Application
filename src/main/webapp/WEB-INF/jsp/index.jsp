<!DOCTYPE html>
<html lang="en">
<head>
	<title>Tourist Management</title>
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
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
                      <div col-md-6  class="login100-more" style="background-image: url('images/bg-01.jpg');"></div>
                      <div col-md-6 class="d-flex p-2" style="display: block !important; padding-right: 65px !important;">
                        <form method="post" action="/login-user" style="padding-right:70px;">
                            <span class="login100-form-title p-b-34" align="center" style="padding-top:10px;">
                                Account Login
                            </span>
                            <div class="d-flex p-2">
                                <input id="first-name" class="input100" type="text" name="username" placeholder="User name">
                                <span class="focus-input100"></span>
                            </div>
                            <div class="d-flex p-2">
                                <input class="input100" type="password" name="password" placeholder="Password">
                                <span class="focus-input100"></span>
                            </div>

                            <div class="container-login100-form-btn">
                                <button class="login100-form-btn" type="submit">
                                    Login
                                </button>
                            </div>
                            <div class="w-full text-center p-t-27 p-b-239">
                            <span class="txt1"><!--Forgot--></span>
                            <a href="#" class="txt2"></a>
                            </div>

                        </form>

                         <form method="post" action="/signUp-user" style="padding-right:70px;">
                            <div class="w-full text-center">
                               <button type="submit" class="login100-form-btn" style="background-color:blue;">
                                  Sign Up
                               </button>
                            </div>
                         </form>


                        </div>
			      </div>
		    </div>
	   </div>
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