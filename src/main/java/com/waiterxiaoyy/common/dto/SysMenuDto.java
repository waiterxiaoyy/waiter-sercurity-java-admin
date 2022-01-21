package com.waiterxiaoyy.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * {
 * 					name: 'SysUser',
 * 					title: '用户管理',
 * 					icon: 'el-icon-s-custom',
 * 					path: '/sys/users',
 * 					component: 'sys/User',
 * 					children: []
 *
 *             icon: 'el-icon-lx-cascades',
 *             index: 'sys',
 *             path: '',
 *             name: 'sys',
 *             component: '',
 *             title: '用户管理',
 *             children: []
 */
@Data
public class SysMenuDto implements Serializable {

	private Long id;
	private String name;
	private String index;
	private String title;
	private String icon;
	private String path;
	private String component;
	private List<SysMenuDto> children = new ArrayList<>();

}
