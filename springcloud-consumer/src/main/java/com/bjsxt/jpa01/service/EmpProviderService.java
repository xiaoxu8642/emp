package com.bjsxt.jpa01.service;

import com.bjsxt.jpa01.pojo.Emp;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-17-21:10
 **/
public interface EmpProviderService {

    public List<Emp> selectAllEmps(Integer page,Integer rows);


    public void deleteEmp(Integer id);
}
