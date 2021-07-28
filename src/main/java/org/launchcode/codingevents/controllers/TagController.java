package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventRepository;
import org.launchcode.codingevents.data.TagRepository;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("tags")
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public String displayAllTags(Model model) {
        model.addAttribute("title", "All Tags");
        model.addAttribute("tags", tagRepository.findAll());
        return "tags/index";
    }

    @GetMapping("create")
    public String displayCreateTagForm(Model model) {
        model.addAttribute("title", "Create Tag");
        model.addAttribute(new Tag());
        return "tags/create";
    }

    @PostMapping("create")
    public String processCreateTagForm(@ModelAttribute @Valid Tag newTag, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create Tag");
            return "tags/create";
        }
        tagRepository.save(newTag);
        return "redirect:";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Tags");
        model.addAttribute("tags", tagRepository.findAll());
        return "tags/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] tagIds) {
        if (tagIds != null) {
            for (Event event : eventRepository.findAll()) {
                for (int id : tagIds) {
                    event.removeTag(id);
                }
            }
            for (int id : tagIds) {
                tagRepository.deleteById(id);
            }
        }
        return "redirect:";
    }
}
