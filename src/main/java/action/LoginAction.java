package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("ִ��Action");
		return SUCCESS;
		
	}

}
