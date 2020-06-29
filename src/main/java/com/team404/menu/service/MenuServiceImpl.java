package com.team404.menu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team404.command.MenuVO;
import com.team404.menu.mapper.MenuMapper;

@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuMapper menuMapper;
	
	@Override
	public ArrayList<MenuVO> getMenu() {
		return menuMapper.getMenu();
	}

}
