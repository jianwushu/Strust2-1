package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.StudentEntity;
import org.apache.struts2.ServletActionContext;
import service.LoginService;

import javax.servlet.http.HttpSession;
import java.util.Map;

public class LoginAction extends ActionSupport{
    private StudentEntity studentEntity;
    private LoginService loginService;

    public String execute() throws Exception{
        System.out.println(studentEntity.getStuName());
        StudentEntity studentEntity1 = loginService.find(studentEntity.getStuName(),studentEntity.getStuPassword());
        if(studentEntity1!=null){
            Map session = ActionContext.getContext().getSession();
            session.put("studentEntity",studentEntity1);
            return SUCCESS;
        }else{
            return ERROR;
        }

    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
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
