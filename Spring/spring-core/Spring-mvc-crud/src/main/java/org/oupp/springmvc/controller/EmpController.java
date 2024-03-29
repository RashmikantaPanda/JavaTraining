package org.oupp.springmvc.controller;

import org.oupp.springmvc.dao.EmpDao;
import org.oupp.springmvc.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    EmpDao empDao;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/empform")
    public String showform(Model m){
        m.addAttribute("command",new Emp());
        return "empform";
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("emp") Emp emp){
        empDao.save(emp);
        return "redirect:/viewemp";
    }

    @RequestMapping("/viewemp")
    public String viewEmp(Model m){
        List<Emp> list=empDao.getEmployees();
        m.addAttribute("list",list);
        return "viewemp";
    }

    @RequestMapping(value = "/editemp/{id}")
    public String edit(@PathVariable int id,Model m){
        Emp emp=empDao.getEmployeeById(id);
        m.addAttribute("command",emp);
        return "empeditform";
    }

    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("emp") Emp emp){
        empDao.update(emp);
        return "redirect:/viewemp";
    }

    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        empDao.delete(id);
        return "redirect:/viewemp";
    }
}
