package DBUtil;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBUtil {
	//联结字符串                                              //数据库名test
	public static String db_url = "jdbc:mysql://localhost:3306/world_ill_?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	//数据库用户名
	public static String db_user = "root";
	//数据库密码名
	public static String db_pass = "123";
	
	public static Connection getConn () {
		
		//声明与数据库的连接并实例化为null
		Connection conn = null;
		
		try {
			//驱动程序名"
			Class.forName("com.mysql.cj.jdbc.Driver");//连接数据库
			//具体地连接到数据库——联接字符串（数据库名），联接用户名，联接密码名
			conn = DriverManager.getConnection(db_url, db_user, db_pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	


	/**
	 * 关闭连接
	 * @param state
	 * @param conn
	 */
	public static void close (Statement state, Connection conn) {
		if (state != null) {
			try {
				state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close (ResultSet rs, Statement state, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (state != null) {
			try {
				state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
