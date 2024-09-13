package com.ssg.springtodoservice.controller;

import com.ssg.springtodoservice.dto.TodoDTO;
import com.ssg.springtodoservice.service.TodoService;
import jdk.jpackage.internal.Log;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/todo")
@Log4j2
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @RequestMapping("/list")
    public void list(Model model) { //Model타입 : 스프링 컨텍스트에서 제공하는 공간
        log.info("todo list...");
        model.addAttribute("dtoList",todoService.getAll());
    }

    @GetMapping("/register")
    public void registerGET() {
        log.info("GET todo register...");
    }

    @PostMapping("/register")
    public String registerPOST(@Valid TodoDTO todoDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        log.info("POST todo register...");
        log.info("todoDTO : " + todoDTO);

        if(bindingResult.hasErrors()){
            log.info("has error...");
            redirectAttributes.addFlashAttribute("error",bindingResult.getAllErrors());
            return "redirect:/todo/register";
        }

        return "redirect:/todo/list";
    }
}
