package doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import model.User;
import util.DB;
import com.opensymphony.xwork2.ActionContext;

public class loginAction extends WebappSupport{
	

    private String username;
    private String user_id;
    private String fname;
    private String password;
    private List lstUsers;
    
    public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public List getLstUsers() {
		return lstUsers;
	}


	public void setLstUsers(List lstUsers) {
		this.lstUsers = lstUsers;
	}

	
    public String execute() {
 
    	lstUsers=new User().verifyDetails(username,password);
    	System.out.println("users : "+lstUsers);
    	if(lstUsers.isEmpty())
    	{
    		addActionError("Invalid Login Details");
    		return"error";
    	}
        /*if (this.username.equals("admin")
                && this.password.equals("admin123")) {
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }*/
    	else{
    		Map session = ActionContext.getContext().getSession();
    		session.put("uname", username);
    		//System.out.println("session is being set "+session.get("uname"));
    		return "success";
    	}
    }
    
    
    /*public String logout() throws Exception{
    	Map session = ActionContext.getContext().getSession();
		session.remove("logged-in");
		return "success";
    }*/
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }


}
