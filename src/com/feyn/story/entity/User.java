package com.feyn.story.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	
	private Integer id;
	
	private String name;
		
	public Integer getId() {
		return id;
	}
	
	@JSONField(name="ID")
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
