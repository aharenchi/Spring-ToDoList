package com.harenchi.ToDoList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ToDoListController {

    @RequestMapping(method = RequestMethod.POST)
    public String addTask(Model model, String task) {
        model.addAttribute("task", task);
        return "index";
    }
}