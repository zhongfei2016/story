package com.feyn.story.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.feyn.story.dao.UserDao;
import com.feyn.story.entity.User;

import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;
	
	//@PathVariable(value = "ID")必须与route.conf中的参数名一致，均为ID
	public @ResponseBody String getUserById(@PathVariable(value = "ID") Integer id)
	{
		Map param = new HashMap();
		param.put("ID", id);
		User user = userDao.getUserById(param);
		return JSON.toJSONString(user, SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullStringAsEmpty);
	}
}
