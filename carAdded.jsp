<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="whitePanda.DbHandler"%>
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
<%
	String vehno = request.getParameter("carNumber");
	String vehModel = request.getParameter("carModel");
	String vehCapacity = request.getParameter("carCapacity");
	String vehRent = request.getParameter("carRent");
	System. out.print(vehCapacity + " " + vehRent);
	int x1 = Integer.parseInt(vehCapacity);
	int x2 = Integer.parseInt(vehRent);
	
	Car c = new Car(vehno,vehModel,x1,x2);
	DbHandler db = new DbHandler();
	Connection con = db.getCom();
	PreparedStatement stmt = con.prepareStatement("insert into myCars values(?,?,?,?)");
	stmt.setString(1, vehno);
	stmt.setString(2, vehModel);
	stmt.setInt(3, x1);
	stmt.setInt(4, x2);
	
	PreparedStatement stmt2 = con.prepareStatement("insert into booked values(?,?,?,?,?)");
	stmt2.setString(1, vehno);
	stmt2.setString(2, vehModel);
	stmt2.setInt(3, x1);
	stmt2.setInt(4, x2);
	stmt2.setString(5,"Yes");
	stmt.executeUpdate();
	stmt2.executeUpdate();
	
	
	
	
%>
<p> Added

<body>

</body>
</html>