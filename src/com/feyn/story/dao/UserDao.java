package com.feyn.story.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.feyn.story.entity.User;

@Repository("userDao")
public interface UserDao {
	public User getUserById(Map param);
}
