<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
  <head>
    <meta charset="UTF-8">
    <title>Material Login Form</title>
    
    
    <link rel="stylesheet" href="login/reset.css">

    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="login/style.css">

    
    
    
  </head>

  <body>

    
<!-- Mixins-->
<!-- Pen Title-->
<div class="pen-title">
  <h1>APPLICATION_ALERTE</h1>
</div>

<div class="container">
  <div class="card"></div>
  <div class="card">
    <h1 class="title">login</h1>
    
    <form action ="login" method = "post">
    
      <div class="input-container">
        <input type="text" id="Id_user" name="Id_user" required="required"/>
        <label for="Id_user">Id_user</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="password" id="Password" name="password" required="required"/>
        <label for="Password">Password</label>
        <div class="bar"></div>
      </div>
      <div class="button-container">
       <input type="submit" value="connect" name="btn">
      </div>
      
      <div class="footer"><a href="#">Forgot your password?</a></div>
    </form>
  </div>
 
    
     
  </div>



        <script src="login/js/index.js"></script>

    
    
    
  </body>
</html>
