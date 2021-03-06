<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->

	<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
	<link href="${bootstrapCss}" rel="stylesheet" />

</head>
<body>
    <h1></h1>

  <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
            <form method="post" class="form-signin" action="loginProcess" id=loginForm modelAttribute="login">           
              <div class="form-label-group">
                <input type="text" name="patientname" id="patientname" class="form-control" placeholder="User Name" required autofocus>
                <label for="inputName">Patient Name</label>
              </div>
              <div class="form-label-group">
                <input type="password" id="inputPassword" name ="inputPassword" class="form-control" placeholder="ID" required>
                <label for="inputPassword">Enter Patient's ID </label>
              </div>
              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Keep me logged in</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" id="login" name="login" type="submit">Login</button>
              <a href="/falldetector/register">New User, Sign up Here</a>
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

