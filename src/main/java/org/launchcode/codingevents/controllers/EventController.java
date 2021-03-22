package org.launchcode.codingevents.controllers;

<<<<<<< Updated upstream
<<<<<<< HEAD
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> Stashed changes
=======
=======
import org.launchcode.codingevents.data.EventCategoryRepository;
>>>>>>> Stashed changes
import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 34c1b4f
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

<<<<<<< Updated upstream
<<<<<<< HEAD
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
import java.util.ArrayList;
import java.util.List;
=======
import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.Optional;
>>>>>>> Stashed changes
=======
import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.Optional;
>>>>>>> Stashed changes
=======
import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.util.Optional;
>>>>>>> Stashed changes
=======
import javax.validation.Valid;
>>>>>>> 34c1b4f
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

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

<<<<<<< Updated upstream
    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @GetMapping
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
<<<<<<< HEAD
        model.addAttribute("events", events);
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
    @GetMapping
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
        model.addAttribute("events", eventRepository.findAll());
>>>>>>> 34c1b4f
=======
>>>>>>> Stashed changes
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
<<<<<<< HEAD
<<<<<<< Updated upstream
=======
        model.addAttribute(new Event());
        model.addAttribute("categories", eventCategoryRepository.findAll() );
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
        model.addAttribute(new Event());
<<<<<<< Updated upstream
        model.addAttribute("types", EventType.values());
>>>>>>> 34c1b4f
=======
        model.addAttribute("categories", eventCategoryRepository.findAll() );
>>>>>>> Stashed changes
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
                                         Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Event");
            return "events/create";
        }

        eventRepository.save(newEvent);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", eventRepository.findAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                eventRepository.deleteById(id);
            }
        }

        return "redirect:";
    }

}
