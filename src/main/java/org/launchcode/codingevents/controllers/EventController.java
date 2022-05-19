package org.launchcode.codingevents.controllers;
//displays a list of static events

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
    private static List<String> events = new ArrayList<>();
    //making this static so it is viewable at class level
    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEvent(){
        return "events/create";
    }
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName){
        //we have our string that our user gave us and now we want to POST it
        events.add(eventName);
        return "redirect: "; //redirects them to root path, a
    }
}
