package action;

import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class basicAction {
    public String login(){
        System.out.println("去登录操作");
        HttpServletRequest request = ServletActionContext.getRequest();
        String stuName = request.getParameter("stuName");
        String password = request.getParameter("password");
        System.out.printf(stuName);
        return "success";
    }
    public String admin(){
        System.out.println("登录操作");
        HttpSession session = ServletActionContext.getRequest().getSession();
        if(session.getAttribute("studentEntity") == null)
        {
            return "error";
        }else {
            return "success";
        }
    }
}
