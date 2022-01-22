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
              <h4>New here?</h4>
              <h6 class="font-weight-light">Signing up is easy. It only takes a few steps</h6>
              <form class="pt-3" method="POST" action="InscriptionController">
                <div class="form-group">
                  <input type="text" class="form-control form-control-lg" id="username" name="username"  placeholder="Username" required>
                </div>
                <div class="form-group">
                  <input type="email" class="form-control form-control-lg" id="email" name="email" placeholder="Email" required>
                </div>
               
                <div class="form-group">
                  <input type="password" class="form-control form-control-lg" id="password" name="password" placeholder="Password" required>
                </div>
                <div class="mb-4">
                  <div class="form-check">
                    <label class="form-check-label text-muted">
                      <input type="checkbox" class="form-check-input" required>
                      I agree to all Terms & Conditions
                    </label>
                  </div>
                </div>
                <div class="mt-3">
                    <button id="send" type="submit" class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" style="font-size: 15px">Submit</button>
                </div>
                <div class="text-center mt-4 font-weight-light">
                  Already have an account? <a href="Authentification.jsp" class="text-primary">Login</a>
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
