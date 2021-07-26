package com.dragon.domiworld.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dragon.domiworld.service.UserService;
import com.dragon.domiworld.vo.UserVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value = "main")
public class MainController {
	
	/**
	 * 
	 * JPA - H2 데이터 main view
	 * 
	 * */
	
	@Autowired
	private UserService mainService;
	
	@GetMapping(value = "/index.do")
    public ModelAndView main(ModelMap map) throws Exception {
		log.info("MAIN CONTROLLER INDEX START");
        ModelAndView modelAndView = new ModelAndView();
      
        List<UserVO> userList = new ArrayList<UserVO>();
        
        userList = mainService.getAllUsers();
        log.info("USER_LIST : {}",userList);
        
        map.put("userList", userList);
        modelAndView.setViewName("views/main");
        
        return modelAndView;
    }
	
	@GetMapping(value = "/list.do")
    public Map<String, Object> list(ModelMap map) throws Exception {
		log.info("MAIN CONTROLLER LIST START");
      
        List<UserVO> userList = new ArrayList<UserVO>();
        
        userList = mainService.getAllUsers();
        log.info("USER_LIST : {}",userList);
        
        map.put("userList", userList);
        
        return map;
    }
}
