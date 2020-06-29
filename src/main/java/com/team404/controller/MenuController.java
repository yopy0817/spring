package com.team404.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.team404.command.MenuVO;
import com.team404.menu.service.MenuService;

@RestController
public class MenuController {
	
	@Autowired(required = true)
	@Qualifier("menuService")
	private MenuService menuService;
		
	@GetMapping("/menuList")
	@ResponseBody
	public ArrayList<MenuVO> menuList() {
		
		ArrayList<MenuVO> menuList = menuService.getMenu();
		System.out.println(menuList.toString());
		
		return menuList;
	}
}
