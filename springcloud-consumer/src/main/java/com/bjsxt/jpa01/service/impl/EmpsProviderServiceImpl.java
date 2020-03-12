package com.bjsxt.jpa01.service.impl;

import com.bjsxt.jpa01.pojo.Emp;
import com.bjsxt.jpa01.service.EmpProviderService;
import com.bjsxt.jpa01.service.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-17-21:10
 **/
@Service
public class EmpsProviderServiceImpl implements EmpProviderService {
    @Autowired
    private FeignProvider feignProvider;

    @Override
    public List<Emp> selectAllEmps(Integer page,Integer rows) {
        return feignProvider.selectAllEmps(page, rows);
    }

    @Override
    public void deleteEmp(Integer id) {
     feignProvider.deleteEmp(id);
    }
}
