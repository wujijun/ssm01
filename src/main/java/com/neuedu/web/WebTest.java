package com.neuedu.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.pojo.User;
import com.neuedu.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import sun.net.httpserver.HttpServerImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WebTest {
    @Resource
    private IUserService service;
    @RequestMapping("/list.do")
    public String list(ModelMap map, HttpServletRequest req,User user){
        int pageNum= req.getParameter("pageNum")==null? 1:Integer.parseInt(req.getParameter("pageNum"));
        int pageSize = 3;
        PageHelper.startPage(pageNum,pageSize);
        List<User> list =null;
        if (StringUtils.isBlank(user.getName())){
            user.setName(null);
            System.out.println(user);
            list = service.getLists(user);
        }else {
            list = service.getLists(user);
            String name ="&name="+user.getName();
            System.out.println(name);
            map.addAttribute("name",name);
        }
        PageInfo<User> page = new PageInfo<>(list);
        map.addAttribute("lists",list);
        map.addAttribute("pages",page);
        return "list";
    }

  /*  @RequestMapping("/index.do")
    public String index(ModelMap map){
        List<User> list = service.getLists();
        map.addAttribute("lists",list);
        return "index";
    }*/
    @RequestMapping("/add.do")
    public String add(){
        return "add";
    }
    @RequestMapping("/doAdd.do")
    public String doAdd(User user){
        System.out.println(user);
        service.insertOne(user);
        return "redirect:list.do";
    }
    @RequestMapping("/delete.do")
    public String delete(int id){
        System.out.println(id);
        service.delete(id);
        return "redirect:list.do";
    }
    @RequestMapping("/update.do")
    public String update(int id,ModelMap map){
        System.out.println(id);
       User user= service.getOne(id);
       map.addAttribute("User",user);
        return "update";
    }
    @RequestMapping("/doUpdate.do")
    public String doUpdate(User user){
        System.out.println(user);
        service.update(user);
        return "redirect:list.do";
    }

    @RequestMapping("/a.do")
    public String login(String name){
        System.out.println(name);
        return "a";
    }
    @RequestMapping("/doLogin.do")
    public String doLogin(String name){
        System.out.println(name);
        return "redirect:list.do";
    }
}
