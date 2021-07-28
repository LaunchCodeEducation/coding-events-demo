package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("eventCategories")
public class EventCategoryController {

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());
        return "eventCategories/index";
    }

    @GetMapping("create")
    public String renderCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());
        return "eventCategories/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm(@ModelAttribute @Valid EventCategory newEventCategory,
                                                 Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Category");
            return "eventCategories/create";
        }
        eventCategoryRepository.save(newEventCategory);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Event Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());
        return "eventCategories/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] categoryIds) {

        if (categoryIds != null) {
            for (int id : categoryIds) {
                int count = 0;
                for (Event event : eventRepository.findAll()) {
                    if (event.getCategory().getId() == id) {
                        count = 1;
                    }
                }
                if (count == 0){
                    eventCategoryRepository.deleteById(id);
                }
            }
        }
        return "redirect:";
    }
}
