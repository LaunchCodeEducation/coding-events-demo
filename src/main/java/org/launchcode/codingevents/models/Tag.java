package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tag extends AbstractEntity{

    @NotBlank(message = "Tag name is required")
    @NotNull
    @Size(max = 25, message = "Tag name must be less than 25 characters")
    private String name;

    @ManyToMany(mappedBy = "tags")
    private final List<Event> events = new ArrayList<>();

    public Tag(String name) {
        this.name = name;
    }

    public Tag() {}

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return "#" + name + " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEvents() {
        return events;
    }
}
