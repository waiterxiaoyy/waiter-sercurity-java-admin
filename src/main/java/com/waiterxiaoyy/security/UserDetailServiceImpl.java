package com.waiterxiaoyy.security;

import com.waiterxiaoyy.entity.SysUser;
import com.waiterxiaoyy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author WaiterXiaoYY
 * @Date 2022/1/19 1:12
 * @Version 1.0
 */

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    SysUserService sysUserService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SysUser sysUser = sysUserService.getByUsername(username);

        if(sysUser == null) {
            throw new UsernameNotFoundException("用户名或者密码不正确");

        }

        return new AccountUser(sysUser.getId(), sysUser.getUsername(), sysUser.getPassword(), getUserAuthority(sysUser.getId()));
    }


    /**
     * 获取用户权限信息（角色、菜单权限）
     * @param userId
     * @return
     */
     // 获取用户权限信息
    public List<GrantedAuthority> getUserAuthority(Long userId) {

        // 角色(ROLE_admin)、菜单操作权限
        String authority = sysUserService.getUserAuthorityInfo(userId); //ROLE_admin,sys:user:list
        return AuthorityUtils.commaSeparatedStringToAuthorityList(authority);
    }
}
