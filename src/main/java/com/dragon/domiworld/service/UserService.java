package com.dragon.domiworld.service;

import java.util.List;

import com.dragon.domiworld.vo.UserVO;

public interface UserService {
	 UserVO createUsers(UserVO vo) throws Exception;

     void deleteUsers(Long id) throws Exception;

     List<UserVO> getAllUsers() throws Exception;
}
