package com.springdatajpa.springboot.controller;
import com.springdatajpa.springboot.common.constants.Enums.Gender;
import com.springdatajpa.springboot.model.TestUser;
import com.springdatajpa.springboot.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/testUser")
public class TestUserController {
    @Autowired
    private TestUserService testUserService;

    @GetMapping
    public String index(Model model) {
        List<TestUser> testUserList = testUserService.getAllTestUser();
        model.addAttribute("genderList", Gender.values());
        model.addAttribute("testUserList", testUserList);
        return "testUser/index";

    }

    @GetMapping("new")
    public String newPlayer(Model model) {
        model.addAttribute("genderList", Gender.values());
        return "testUser/new";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable int id, Model model) { // ⑤
        TestUser testUser = testUserService.getTestUser(id);
        model.addAttribute("genderList", Gender.values());
        model.addAttribute("testUser", testUser);
        return "testUser/edit";
    }

    @PostMapping
    public String create(@ModelAttribute TestUser testUser) {
        testUserService.createTestUser(testUser);
        return "redirect:/testUser";
    }

    @PutMapping("{id}")
    public String update(@ModelAttribute TestUser testUser) {
        testUserService.updateTestUser(testUser);
        return "redirect:/testUser";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id) {
        testUserService.deleteTestUser(id);
        return "redirect:/testUser";
    }
}