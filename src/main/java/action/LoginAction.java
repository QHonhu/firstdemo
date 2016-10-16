package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐAction");
		return SUCCESS;
		
	}

}
