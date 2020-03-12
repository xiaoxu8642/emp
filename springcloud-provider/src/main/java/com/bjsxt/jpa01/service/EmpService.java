package com.bjsxt.jpa01.service;

import com.bjsxt.jpa01.pojo.Emp;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-17-20:44
 **/
public interface EmpService {
    //查询全部
    public List<Emp> getEmps(Integer page,Integer rows);
    //根据ID删除
    public void deletById(Integer id);
}
