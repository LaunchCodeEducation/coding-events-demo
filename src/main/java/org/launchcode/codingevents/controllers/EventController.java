package org.launchcode.codingevents.controllers;

<<<<<<< Updated upstream
=======
import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> Stashed changes
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

<<<<<<< Updated upstream
import java.util.ArrayList;
import java.util.List;
=======
import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.Optional;
>>>>>>> Stashed changes

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @GetMapping
<<<<<<< Updated upstream
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
=======
    public String displayAllEvents(@RequestParam(required = false) Integer categoryId, Model model) {

        if(categoryId ==null){
            model.addAttribute("title", "All Events");
            model.addAttribute("events", eventRepository.findAll());
        } else {
           Optional<EventCategory> result =  eventCategoryRepository.findById(categoryId);
           if(result.isEmpty()){
               model.addAttribute("title","Invalid Category ID: " + categoryId);
           } else {
               EventCategory category = result.get();
               model.addAttribute("title","Events in Category: " + category.getName());
               model.addAttribute("events",category.getEvents());
           }
        }

>>>>>>> Stashed changes
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
<<<<<<< Updated upstream
=======
        model.addAttribute(new Event());
        model.addAttribute("categories", eventCategoryRepository.findAll() );
>>>>>>> Stashed changes
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";
    }

}
