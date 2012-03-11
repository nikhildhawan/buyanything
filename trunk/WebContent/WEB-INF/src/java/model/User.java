package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import com.login.vo.LoginVo;
import util.DB;
import util.MyLog;
import com.opensymphony.xwork2.ActionContext;

public class User {
	
	
	public List verifyDetails(String username,String password){
	List lstRegister = new ArrayList();
	System.out.println("password is " +password);
	ResultSet resultSet = null;
	String query = "select user_name,user_id, description from user where user_name='" + username+"'"; 
			//+ "' and Password='" + password + "'";
	System.out.println(""+query);
	
	Connection connection = DB.getConnection();
	resultSet = DB.readFromDB(query, connection);
	
	try {
		System.out.println(""+resultSet.getFetchSize());
		while (resultSet.next()) {
			System.out.println("i am here");
			String userName = resultSet.getString("user_name");
			String userid = resultSet.getString("user_id");
			String f_name = resultSet.getString("description");
			System.out.println(""+userName);
			//LoginVo loginVo = new LoginVo(userName,userid, f_name);
			System.out.println(""+f_name);
			
			Map session = ActionContext.getContext().getSession();
			session.put("first_name",f_name);
			session.put("uid",userid);
			System.out.println("user id"+userid);
			lstRegister.add(userName);
			return lstRegister;
			//lstRegister.add(loginVo);
		}
	} catch (SQLException e) {
        MyLog.myCatch("Register Dao", 43, e);
		e.printStackTrace();
	}finally{
	DB.close(resultSet);
	DB.close(connection);
	}
	return lstRegister;
}
}