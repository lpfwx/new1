package com.hyxy.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hyxy.dao.UserMapper;
import com.hyxy.entity.Msql;
import com.hyxy.entity.User;
import com.hyxy.service.UserService;
import com.hyxy.util.upload2;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	public Msql msql;
	@Resource
	public UserService userService;
	
	/*
	 * @RequestMapping(value = "select",method=RequestMethod.GET) public String
	 * selectg() throws UnsupportedEncodingException {
	 * System.out.println(msql.getJdbcName()); System.out.println(new
	 * String(name.getBytes("iso-8859-1"),"utf-8")); System.out.println("进来了get请求");
	 * return "welcome"; }
	 * 
	 * @RequestMapping(value = "select",method=RequestMethod.POST) public String
	 * selectp() { System.out.println("进来了post请求"); return "welcome"; }
	 */
	/*@ResponseBody
	@RequestMapping("select")
	public String select(String username) {
		List<String> list = new ArrayList<String>();
		list.add(username);
		return username;
	}*/
	@RequestMapping("select")
	public String select(Map<String, Object> map) {
		List<User> list = userService.selectAll();
		System.out.println(list.size());
		map.put("user", list);
		return "welcome";
	}
	@RequestMapping("insert")
	public String insert(User user) {
		userService.insert(user);
		return "";
	}
	/*public String select(User user,@RequestParam(value="img",required=false)MultipartFile[] img,Map<String, Object>map,HttpServletRequest request) {
		upload2 upload2 = new upload2();
		List<String> list = upload2.uploadfile(request, img);
		map.put("user", user);
		map.put("img", list);
		return "welcome";
	}
	@ResponseBody
	@RequestMapping("select1")
	public List<String> select1(User user,@RequestParam(value="img",required=false)MultipartFile[] img,Map<String, Object>map,HttpServletRequest request) {
		upload2 upload2 = new upload2();
		List<String> list = upload2.uploadfile(request, img);
		return list;
	}*/
	/*
	 * @RequestMapping("select") public String namelogin(User user,Map<String,
	 * Object> map) { map.put("user", user); return
	 * "forward:/WEB-INF/views/welcome.jsp"; }
	 */
	/*public String namelogin( Model model, ModelMap modelMap) {
		model.addAttribute("password", 123456);
		modelMap.put("age", 18);
		return "welcome";
		}*/
	/*public ModelAndView namelogin(User user) {
		//返回指定的页面和数据
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userInfo", user);
		modelAndView.setViewName("/welcome");
		return modelAndView;
		}*/
//	public String select(@RequestParam Map<String, Object>map) {
//		System.out.println(map.get("username"));
//		System.out.println(map.get("age"));
//		return "welcome";
//	}
	/*public String select(User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getAge());
		return "welcome";
	}*/
	/*public String select(String username,String password,String []fruit) {
		System.out.println(username);
		System.out.println(password);
		for (String string : fruit) {
			System.out.println(string);
			}
		return "welcome";
	}*/
	/*
	 * public String select(String username,String password,String fruit) {
	 * System.out.println(username); System.out.println(password); 
	 * String[] ho = fruit.split(",");
       for (String string : ho) {
       System.out.println(string);
       }
	 * return "welcome"; 
	 * }
	 */
	/*
	 * public String select(@RequestParam("username") String name,String password) {
	 * System.out.println(name); System.out.println(password); return "welcome"; }
	 */
}
