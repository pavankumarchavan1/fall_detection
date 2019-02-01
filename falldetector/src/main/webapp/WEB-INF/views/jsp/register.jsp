<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    	<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
	<link href="${bootstrapCss}" rel="stylesheet" /></head>
<body>
    <h1></h1>
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/popper.min.js"> </script>
    <script src="js/bootstrap.min.js" ></script>
<div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
            <form method="post" class="form-signin" action="registerProcess" id=regForm modelAttribute="patient">           
              <div class="form-label-group">
                <input type="text" name="patientname" id="patientname" class="form-control" placeholder="User Name" required autofocus>
                <label for="inputName">Patient Name</label>
              </div>
              <div class="form-label-group">
                <input type="text" id="address" name="address" class="form-control" placeholder="Address" required>
                <label for="inputAddress">Address</label>
              </div>
              <div class="form-label-group">
                <input type="text" id="hospitalNO" name="hospitalNO" class="form-control" placeholder="Hospital Contact" required>
                <label for="inputHospital">Hospital Contact</label>
              </div>
              <div class="form-label-group">
                <input type="text" id="contact" name= "contact" class="form-control" placeholder="Emergency Contact" required>
                <label for="inputContact">Contact</label>
              </div>
							<button class="btn btn-lg btn-primary btn-block text-uppercase" id="register" 
              name="register" type="submit">Sign Up </button>
              <a href="/falldetector/login">Login Here</a>
            </form>
          </div> 
        </div>
      </div>
    </div>
  </div>
  
	<spring:url value="/resources/core/js/jquery-3.2.1.slim.min.js.js" var="coreJs" />
	<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs" />
	<spring:url value="/resources/core/js/popper.min.js" var="popperJs" />
	<spring:url value="/resources/core/js/jquery.min.js" var="jqueryJs" />
	<script src="${coreJs}"></script>
	<script src="${bootstrapJs}"></script>
	<script src="${popperJs}"></script>
	<script src="${jqueryJs}"></script>
  </body>

  
</html>

