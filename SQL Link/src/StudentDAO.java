import java.sql.*;

public class StudentDAO {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/student?useSSL=false&allowPublicKeyRetrieval=true&severTimezone=UTC";
	private static String user = "JohnWick";
	private static String passwd = "a12345";
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void add(Student student) {
		try(Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.getResultSet()){
			String sql = String.format("INSERT INTO base(names,sid,addresses,sex)"
				+"VALUES('%s','%s','%s','%s')",student.getName(),student.getSid()
				,student.getAddresses(),student.getSex());
			stmt.executeUpdate(sql);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
