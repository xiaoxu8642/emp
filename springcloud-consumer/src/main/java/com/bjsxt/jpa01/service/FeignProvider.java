package com.bjsxt.jpa01.service;

import com.bjsxt.jpa01.pojo.Emp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-17-21:04
 **/
@FeignClient(name = "emp-provider")
@Component
public interface FeignProvider {

    @RequestMapping("/emps/{page}/{rows}")
    public List<Emp>  selectAllEmps(@PathVariable(value = "page")Integer page,
                                    @PathVariable(value = "rows")Integer rows);
    @RequestMapping("/delete/{id}")
    public void deleteEmp(@PathVariable(value = "id")Integer id);
}
