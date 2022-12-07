package com.firstspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspring.entity.Person;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index() {
        return "welcome to my spring";
    }

    @GetMapping("/list_person")
    public List<Person> getPerson() {
        List<Person> personal = new ArrayList<>();

        personal.add(new Person("Kuya", 12, "Laut dan Darat"));
        personal.add(new Person("maung", 25, "Darat"));

        System.out.println(personal.get(0).name);
        ;
        return personal;
    }

}
