package org.launchcode.codingevents.controllers;
//displays a list of static events

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("events")
public class EventController {
    //DisplayEvents.addArrayList();
    public static ArrayList<Events> events = new ArrayList<Events>();


    @GetMapping
    public String displayAllEvents(Model model) {

        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, String eventDescription, String address, String imagePath) {
        Events newEvent = new Events(eventName, eventDescription, address, imagePath);
        events.add(newEvent);
        return "redirect:";
    }

}
