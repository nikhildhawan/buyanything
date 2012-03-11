package doc;

import java.sql.*;
import java.util.Map;

import util.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BLL_Login extends ActionSupport
{
	private String message, username, password;

	private ResultSet rs;
	private Connection conn;
	private String sqlQuery;
	private Statement stmt;
	private Map session;

	@Override
	public String execute()
	{
		int uid, userRootDir;
		float usage;
		int percent;
		session = ActionContext.getContext().getSession();
		conn = DB.getConnection();
		if (conn == null)
		{
			System.out.println("Connection is null");
			return ERROR;
		}
		System.out.println("Username is:" + username + ":  and password is:" + password);
		if (username == null)
		{
			addActionError("Username can not be empty");
			return ERROR;
		}
		if (password == null)
		{
			addActionError("Password can not be empty");
			return ERROR;
		}
		sqlQuery = "select * from user where user_name='" + username + "' and password='" + password + "'";
		try
		{
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlQuery);
			System.out.println(sqlQuery);
			if (rs.next())
			{
				if (rs.getString("Password").compareTo(password) == 0) // checking case for password also prevents sql Injections
				{
					uid = rs.getInt("user_id");
					session.put("uid", uid);
					session.put("username", username);
					return SUCCESS;
				}
				else
				{
					
					addActionError("Invalid Login Details");
					return ERROR;
				}
			}
			else
			{
				addActionError("Invalid Login Details");
				return ERROR;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return ERROR;
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

}
