package org.launchcode.codingevents.controllers;



import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

   // private static List<Event> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute Event newEvent) {
        EventData.add(newEvent);
        return "redirect:";
    }

    @GetMapping("delete")
    public String renderDeleteEventForm(Model model){

        model.addAttribute("tittle","Delete Event");
        model.addAttribute("events",EventData.getAll());
        return "events/delete";
    }
    @PostMapping("delete")
    public String processDeleteEventForm(@RequestParam(required = false) int[] eventIds){

        if (eventIds != null) {
            for(int id : eventIds){
                EventData.remove(id);
            }

        }
        return "redirect";
    }
}
