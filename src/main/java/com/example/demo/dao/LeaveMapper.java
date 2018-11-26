package com.example.demo.dao;

import com.example.demo.entity.LeaveInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeaveMapper {

	int getCount();
	
	void insert(LeaveInfo entity);
	
	void delete(String id);
	
	LeaveInfo getById(String id);
	
	List<LeaveInfo> getList();
	
	void update(LeaveInfo entity);
}
