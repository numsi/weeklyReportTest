package com.test.weekly_report.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.weekly_report.entity.Layui;
import com.test.weekly_report.entity.Stu;
import com.test.weekly_report.entity.Team;
import com.test.weekly_report.entity.Tutor;
import com.test.weekly_report.service.StuService;
import com.test.weekly_report.service.TeamService;
import com.test.weekly_report.service.TutorService;
import com.test.weekly_report.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginControl {
    @Autowired
    StuService stuService;
    @Autowired
    TeamService teamService;
    @Autowired
    private TutorService tutorService;
    @RequestMapping("/login.do")
    @ResponseBody
    /**
     * 登陆功能
     */
    public Layui loginCheck(String username, String password, String userType){
//        HttpSession session=request.getSession();
        System.out.println("登录测试");

//        session.setAttribute("loginName","用户");
        if(userType.equals("student")){
            Stu s=stuService.getStuByID(username);

            if(s!=null && password.equals(s.getStudent_password())){
//                session.setAttribute("user",s);
                System.out.println("学生登录成功");
                HashMap<String,Object> hs=new HashMap<>();
                String token= TokenUtil.sign(s);
                hs.put("token",token);
                hs.put("user",s);
                return Layui.all(1,"学生登陆成功",1,hs);
            }
        }else if(userType.equals("tutor")){
            Tutor t=tutorService.selectOneByTutorID(username);
            if(t!=null && password.equals(t.getTutor_password())){
//                session.setAttribute("user",t);
                return Layui.all(2,"导师登陆成功",1,t);
            }
        }else {
            Team t=teamService.selectOne(username);
            if(t!=null && password.equals(t.getTeam_password())){
//                session.setAttribute("user",t);
                return Layui.all(1,"团队管理登陆成功",1,t);
            }
        }

        System.out.println(username);
        System.out.println(userType);
        System.out.println(password);

        return Layui.error("登陆失败,账号或密码错误");
    }

    @RequestMapping(value = "/getmessage",method = RequestMethod.GET)
    @ResponseBody
    public String test() throws JsonProcessingException {
//        HashMap<String,Object> hs=new HashMap<>();
//        hs.put("data","data");
//        ObjectMapper objectMapper=new ObjectMapper();
        return "你已经通过验证";
    }

    /**
     * 登出功能
     * @param request
     * @return
     */
    @RequestMapping("loginOut.do")
    public String loginOut(HttpServletRequest request){
        HttpSession session=request.getSession();
        session.removeAttribute("user");
        session.invalidate();
        return "index";
    }

    @RequestMapping("/login.todo")
    public Layui test(String username,String password,String userType){
        return Layui.data(3,username);

    }
}
