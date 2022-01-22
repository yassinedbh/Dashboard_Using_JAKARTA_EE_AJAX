<!DOCTYPE html>

<html lang="en">

<head>
   <%@include file="template/css.jsp" %>
</head>

<body>
 <div class="container-scroller">
    <div class="container-fluid page-body-wrapper full-page-wrapper">
      <div class="content-wrapper d-flex align-items-center auth px-0">
        <div class="row w-100 mx-0">
          <div class="col-lg-4 mx-auto">
            <div class="auth-form-light text-left py-5 px-4 px-sm-5">
              <div class="brand-logo">
                  <div class="col-5 mx-auto text-center">
                     
                         <img src="template/images/logoo.png"  alt="logo"> 
                  
                </div>
              </div>
              <h4>Hello! let's get started</h4>
              <h6 class="font-weight-light">Sign in to continue.</h6>
              <form class="pt-3" method="GET" action="AuthentificationController">
                <div class="form-group">
                    <input type="text" class="form-control form-control-lg" name="username" placeholder="Username" required>
                </div>
                <div class="form-group">
                    <input type="password" class="form-control form-control-lg" name="password" placeholder="Password" required>
                </div>
                  <div class="form-group">
                                        <h6 class="text-center" style="color: red">${error}</h6>
                                    </div>
                <div class="mt-3">
                  <button id="send" type="submit" class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" style="font-size: 15px">Submit</button>
                </div>
                <div class="my-2 d-flex justify-content-between align-items-center">
                  <div class="form-check">
                    <label class="form-check-label text-muted">
                      <input type="checkbox" class="form-check-input">
                      Keep me signed in
                    </label>
                  </div>
                  <a href="#" class="auth-link text-black">Forgot password?</a>
                </div>
                
                <div class="text-center mt-4 font-weight-light">
                  Don't have an account? <a href="Inscription.jsp" class="text-primary">Create</a>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
      <!-- content-wrapper ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
<%@include file="template/js.jsp" %>
  <!-- endinject -->
</body>

</html>
