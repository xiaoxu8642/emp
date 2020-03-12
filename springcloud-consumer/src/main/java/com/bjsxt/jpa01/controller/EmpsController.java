package com.bjsxt.jpa01.controller;

import com.bjsxt.jpa01.pojo.Emp;
import com.bjsxt.jpa01.service.EmpProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xu
 * @DATE 2019 -09-17-21:13
 **/
@Controller
public class EmpsController {
    @Autowired
    private EmpProviderService empProviderService;

    @RequestMapping("/emps")

    public String  selectAllEmps(@RequestParam(defaultValue = "0")Integer page,
                                  @RequestParam(defaultValue = "2")Integer rows,
                                  Model model){
        List<Emp> empList = empProviderService.selectAllEmps(page, rows);
        model.addAttribute("empList",empList);
        model.addAttribute("page",page);
        return  "/index.jsp";
    }
    @RequestMapping("/delete")
    public String deleteEmp(Integer id,Model model){
        empProviderService.deleteEmp(id);
        return "redirect:/emps";
    }
}
