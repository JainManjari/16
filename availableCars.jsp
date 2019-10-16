<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="whitePanda.DbHandler"%>
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

table{
	border-collapse: collapse;
    margin: 50px;
   
}
table, td, th {
    border: 1px solid black;
    padding:20px;
    text-align:left;
}
th {
    background-color: #4CAF50;
    color: white;
}


</style>
</head>
	

<%
	DbHandler db= new DbHandler();
	Connection con = db.getCom();
	PreparedStatement stmt = con.prepareStatement("select * from booked");
	ResultSet rset = stmt.executeQuery();
	%>
	<table>
			<tr>
				<th>Car Number</th>
				<th>Car Model</th>
				<th>Car Capacity</th>
				<th>Car Space</th>
			</tr>
			<%
	while(rset.next()){
		if(rset.getString("isAvailable").equals("Yes")){
			%>
			<tr>
				<td> <%=rset.getString("CarNumber") %> </td>
				<td> <%=rset.getString("CarModel")  %> </td>
				<td> <%=rset.getString("CarCapacity") %> </td>
				<td> <%=rset.getString("CapRent") %> </td>
			</tr>
			<%	
		}
	}


%>
</table>












<form action="bookedCar.jsp" method="get">
	Enter Car Number you want to book : <input type="text" name = "carNum">
	<input type = "submit" value="Book">

</from>










<body>

</body>
</html>