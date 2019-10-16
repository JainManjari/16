package whitePanda;
import java.sql.Connection;

import oracle.jdbc.pool.OracleDataSource;
import java.sql.SQLException;
public class DbHandler {
	public Connection getCom(){
		Connection con = null;
		try {
			OracleDataSource ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			con=ods.getConnection("system","sagar");
			System.out.println("Connection doen");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}



