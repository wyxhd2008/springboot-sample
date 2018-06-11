package com.rick.sampe1.controller;

import com.rick.sampe1.mapper.SysUserMapper;
import com.rick.sampe1.pojo.IMoocJSONResult;
import com.rick.sampe1.pojo.Resource;
import com.rick.sampe1.pojo.SysUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.DocFlavor;

@RestController
public class HelloContoller {

	@Autowired
	private Resource resource;

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot~~";
	}


	@RequestMapping("/testSelect")
	public Object testSelect(){
		return sysUserMapper.selectAll();
	}

	
	@RequestMapping("/getResource")
	public IMoocJSONResult getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		System.out.println(bean.getName());
		return IMoocJSONResult.ok(bean);
	}
	
}
