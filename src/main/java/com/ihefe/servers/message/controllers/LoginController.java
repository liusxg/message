package com.ihefe.servers.message.controllers;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.ihefe.servers.message.entrys.User;
import com.ihefe.servers.message.websocket.Handler;

@Controller
public class LoginController {

	@Resource
	Handler handler;

	Map<Long, User> users = new HashMap<Long, User>();

	// 模拟一些数据
	@ModelAttribute
	public void setReqAndRes() {
		User u1 = new User();
		u1.setId(1L);
		u1.setName("张三");
		users.put(u1.getId(), u1);

		User u2 = new User();
		u2.setId(2L);
		u2.setName("李四");
		users.put(u2.getId(), u2);

	}
	// 提交界面
	@RequestMapping(value = "index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	// 用户登录
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView doLogin(@RequestBody User user, HttpServletRequest request) {
		System.out.println("request："+request.toString());
		System.out.println("id："+user.getId());
		System.out.println("name："+user.getName());
		request.getSession().setAttribute("uid", user.getId());
		request.getSession().setAttribute("name", user.getName());
		return new ModelAndView("redirect:msg/talk");
	}

}