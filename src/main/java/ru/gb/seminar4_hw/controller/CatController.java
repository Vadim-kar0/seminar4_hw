package ru.gb.seminar4_hw.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.seminar4_hw.model.Cat;
import ru.gb.seminar4_hw.repository.CatRepository;

@Controller
@AllArgsConstructor
public class CatController {
    CatRepository catRepository;


    @GetMapping("cats")
    public String getCats(Model model){
        model.addAttribute("cats", catRepository.getCats());
        return "cats";
    }

    @PostMapping("/cats")
    public String addCat(Cat cat, Model model){
        catRepository.addCat(cat);
        model.addAttribute("cats", catRepository.getCats());
        return "cats";
    }
}
