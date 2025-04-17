package com.grepp.spring.app.controller.web;

import com.grepp.spring.app.model.thymeleaf.dto.AttrDto;
import com.grepp.spring.app.model.thymeleaf.dto.ExampleDto;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("thymeleaf")
@RequiredArgsConstructor
public class ThymeleafController {

    @GetMapping("example")
    public void example(Model model) {

        ExampleDto example = new ExampleDto("정기문", 23,
                                         "springboot", 100, false);

        Map<String, Integer> devScore = new LinkedHashMap<>();
        devScore.put("java", 100);
        devScore.put("db", 95);
        devScore.put("html", 90);
        devScore.put("js", 80);
        devScore.put("spring", 98);

        AttrDto attr = new AttrDto("red", "lightcoral");
        String xssAttack = "<script>alert('xss attack 당했습니다.') </script>";

        model.addAttribute("example", example);
        model.addAttribute("devScore", devScore);
        model.addAttribute("attr", attr);
        model.addAttribute("xss", xssAttack);

    }

}
