package com.chinasofti.servles;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.mapper.AjiaUserMapper;
import com.chinasofti.pojo.AjiaUser;
import com.chinasofti.pojo.AjiaUserExample;
import com.chinasofti.pojo.AjiaUserExample.Criteria;
@Controller
@RequestMapping("/web/user")
public class UserF {
	@Autowired
	private AjiaUserMapper mapper;
//	ע�Ṧ��
	@RequestMapping("/register")
        public ModelAndView register(AjiaUser ajiaUser){
		ModelAndView modelAndView = new ModelAndView();
        	mapper.insert(ajiaUser);
        	modelAndView.setViewName("../login.jsp");
			return modelAndView;
        }
	
//	��鹦��
	@RequestMapping("/checkemail")
	@ResponseBody
        public String checkemail(Model model,AjiaUser ajiaUser){
		AjiaUserExample ajiaUserExample = new AjiaUserExample();
		Criteria createCriteria = ajiaUserExample.createCriteria();
		createCriteria.andEmailEqualTo(ajiaUser.getEmail());
        List<AjiaUser> selectByExample = mapper.selectByExample(ajiaUserExample);
        if(selectByExample.isEmpty()){
			return "1";
		}
        return "0";
        }
	
	
	@RequestMapping("/checkphone")
	@ResponseBody
        public String checkphone(Model model,AjiaUser ajiaUser){
		AjiaUserExample ajiaUserExample = new AjiaUserExample();
		Criteria createCriteria = ajiaUserExample.createCriteria();
		createCriteria.andPhoneEqualTo(ajiaUser.getPhone());
        List<AjiaUser> selectByExample = mapper.selectByExample(ajiaUserExample);
        if(selectByExample.isEmpty()){
		return "1";
		}
        return "0";
        }
	
	@RequestMapping("/checkusername")
	@ResponseBody
        public String checkusername(Model model,AjiaUser ajiaUser){
		AjiaUserExample ajiaUserExample = new AjiaUserExample();
		Criteria createCriteria = ajiaUserExample.createCriteria();
		createCriteria.andUsernameEqualTo(ajiaUser.getUsername());
        List<AjiaUser> selectByExample = mapper.selectByExample(ajiaUserExample);
        if(selectByExample.isEmpty()){
		return "1";
		}
        return "0";
        }
	
	
	
	
//	��¼
//	ע�Ṧ��
	@RequestMapping("/login")
	@ResponseBody
        public String login(String username,String password,HttpSession session){
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		AjiaUserExample login = new AjiaUserExample();//��½����
		Criteria loginCriteria = login.createCriteria();
		loginCriteria.andUsernameEqualTo(username).andPasswordEqualTo(password);
		List<AjiaUser> list = mapper.selectByExample(login);
		if(list.isEmpty()){
			return "1";  //���ɹ�
			}else{
			session.setAttribute("username", username);
			session.setAttribute("userid", list.get(0).getId());
		    return "0";  //�ɹ�
			}
	        }
		
	
	@RequestMapping("/Usernamelogin")
	@ResponseBody
	 public String Usernamelogin(Model model,AjiaUser ajiaUser){
		AjiaUserExample ajiaUserExample = new AjiaUserExample();
		Criteria createCriteria = ajiaUserExample.createCriteria();
		createCriteria.andUsernameEqualTo(ajiaUser.getUsername());
        List<AjiaUser> selectByExample = mapper.selectByExample(ajiaUserExample);
        if(selectByExample.isEmpty()){
         System.out.println("fail:"+ajiaUser.getUsername());
		return "0";//û������û�
		}
        System.out.println("success:"+ajiaUser.getUsername());
        return "1";//������û�
        }
}
