package com.example.tema14.controller;

import com.example.tema14.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GuestBookController {

    @GetMapping("/guest")
    public String guest(){
        return "guest";
    }

    @PostMapping("/submitGuest")
    public String submitGuest(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String city,
            @RequestParam int age,
            Model model){

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("city", city);
        model.addAttribute("age", age);

        return "confirmation";
    }

    @GetMapping("/accomodation")
    public String accomodation(Model model){

        List<Room> rooms = List.of(
                new Room("Single",15,1,false),
                new Room("Double",25,2,true),
                new Room("Triple",30,3,true),
                new Room("Suite",50,4,true),
                new Room("Family",65,5,true)
        );

        model.addAttribute("rooms", rooms);

        return "accomodation";
    }

}