package com.waiterxiaoyy.service;

import com.waiterxiaoyy.common.dto.SysMenuDto;
import com.waiterxiaoyy.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WaiterXiaoYY
 * @since 2022-01-13
 */
public interface SysMenuService extends IService<SysMenu> {

    List<SysMenuDto> getCurrentUserNav();

    List<SysMenu> tree();
}
