<%@page import="whitePanda.Car"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Car System</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="myAdminFill2.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>

</style>
</head>

<body>
	<form action="carAdded.jsp" method="post">
	<br>
	<br>
	<br>
	
	<div class="myInput">
	Enter the Car Number : <br>
	<input type="text" name="carNumber"><br><br>
	Enter the Car Model : <br>
	<input type="text" name="carModel"><br><br>
	Enter the Car Capacity : <br>
	<input type="text" name="carCapacity"><br><br>
	Enter the Car Rent : <br>
	<input type="text" name="carRent"><br><br>
	<input type="submit" value="Car Added" class="but">
	</div>
	</form>
	
</body>
</html>