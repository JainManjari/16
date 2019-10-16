<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="whitePanda.DbHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	String carNo = request.getParameter("carNum");
	DbHandler db = new DbHandler();
	Connection con = db.getCom();
	PreparedStatement stmt = con.prepareStatement("select * from booked where CarNumber=?");
	stmt.setString(1,carNo);
	ResultSet rset = stmt.executeQuery();
	if(rset.next()){
		PreparedStatement stmt2 = con.prepareStatement("update booked set isAvailable = ? where CarNumber = ? ");
		stmt2.setString(1,"No");
		stmt2.setString(2,carNo);
		
		
		stmt2.executeUpdate();
		out.println("Done");
	}
	
	
	
	
	
%>

</body>
</html>