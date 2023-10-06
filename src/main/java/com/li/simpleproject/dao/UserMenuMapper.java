package com.li.simpleproject.dao;

import com.li.simpleproject.entity.UserMenu;

/**
* @author kuan
* @description 针对表【user_menu(用户菜单表)】的数据库操作Mapper
* @createDate 2023-10-06 11:21:49
* @Entity com.li.simpleproject.entity.UserMenu
*/
public interface UserMenuMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserMenu record);

    int insertSelective(UserMenu record);

    UserMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserMenu record);

    int updateByPrimaryKey(UserMenu record);

}
