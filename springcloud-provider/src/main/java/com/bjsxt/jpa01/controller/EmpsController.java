package com.bjsxt.jpa01.controller;

import com.bjsxt.jpa01.pojo.Emp;
import com.bjsxt.jpa01.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-17-20:58
 **/
@Controller
public class EmpsController {
    @Autowired
    private EmpService empService;
    @RequestMapping("/emps/{page}/{rows}")
    @ResponseBody
    public List<Emp>  selectAllEmps(@PathVariable(value = "page")Integer page,
                                    @PathVariable(value = "rows")Integer rows){
        List<Emp> empList = empService.getEmps(page, rows);
        return  empList;
    }
    @RequestMapping("/delete/{id}")
    public String deleteEmp(@PathVariable(value = "id")Integer id,Model model){
        empService.deletById(id);
        return "/show.jsp";
    }
}
