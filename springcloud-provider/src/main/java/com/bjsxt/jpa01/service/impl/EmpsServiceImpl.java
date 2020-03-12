package com.bjsxt.jpa01.service.impl;

import com.bjsxt.jpa01.dao.EmpDao;
import com.bjsxt.jpa01.pojo.Emp;
import com.bjsxt.jpa01.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-17-20:45
 **/
@Service
public class EmpsServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> getEmps(Integer page,Integer rows) {
        Pageable pageable= PageRequest.of(page,rows);
        Page<Emp> empPage = empDao.findAll(pageable);
        return empPage.getContent();
    }

    @Override
    public void deletById(Integer id){
        empDao.deleteById(id);
    }
}
