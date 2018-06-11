package com.rick.sampe1.service;

import com.rick.sampe1.pojo.SysUser;
import com.rick.sampe1.utils.JqGridResult;

import java.util.List;

public interface UserService {

	public void saveUser(SysUser user) throws Exception;

	public void updateUser(SysUser user);

	public void deleteUser(String userId);

	public SysUser queryUserById(String userId);

	public List<SysUser> queryUserList(SysUser user);

	public JqGridResult queryUserListPagedJqgrid(SysUser sysUser,Integer page,Integer pageSize);

	public List<SysUser> queryUserListPaged(SysUser user, Integer page, Integer pageSize);

	public SysUser queryUserByIdCustom(String userId);
	
	public void saveUserTransactional(SysUser user);
}
