package com.team404.command;

import java.sql.Date;

import lombok.Data;
/**
 * @author 박인욱 2020.06.29
 * 메뉴VO
 */
@Data
public class MenuVO {

	private int dep1_menu_no;
	private String dep1_name;
	private int parent_no;
	private int seq;
	private String dep2_name;
	private String menu_url;
	private Date regdate;
	
}
