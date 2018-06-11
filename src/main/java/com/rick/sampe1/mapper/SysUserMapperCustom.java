package com.rick.sampe1.mapper;

import com.rick.sampe1.pojo.SysUser;

import java.util.List;

public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}