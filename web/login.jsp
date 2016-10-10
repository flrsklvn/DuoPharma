<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Login Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
	
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
	<link href="css/bgimage.css" rel ="stylesheet" >
	<link href="css/style" rel ="stylesheet" >


	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/scripts.js"></script>
</head>

<body>

 <div class="container">

      <form class="form-signin" role="form" action="${pageContext.request.contextPath}/loginServlet" method="POST">
	  <div align = "center">
        <h2 class="sample">DuoPharma Inc.</h2>
		</div>
		<div align = "center">
	
		</div>
      <br>  <div align = "center"><input name="salesRepID" type="text" class="form-control" placeholder="User ID" style="width: 300px;" value="" /></div><br />
 	
       
        <div align = "center">
		<button class="btn btn-lg btn-primary btn-block" type="submit" style="width:300px;" value="Login" />
		Sign in  </button>
						
		</div>
    
      </form>
       

    </div>
</body>
</html>
