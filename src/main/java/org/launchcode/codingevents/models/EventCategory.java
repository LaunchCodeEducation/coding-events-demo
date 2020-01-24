package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity{

    @NotBlank(message = "Name is required")
    @Size(min = 3,max = 50,message = "Name must be between 3 and 50 characters")
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }
    public EventCategory(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
