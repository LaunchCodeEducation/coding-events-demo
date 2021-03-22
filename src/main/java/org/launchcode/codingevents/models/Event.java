package org.launchcode.codingevents.models;

import javax.persistence.Entity;
<<<<<<< Updated upstream
<<<<<<< HEAD
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
=======
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
=======
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
>>>>>>> Stashed changes
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
<<<<<<< Updated upstream
import java.util.Objects;
>>>>>>> 34c1b4f
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> Stashed changes

/**
 * Created by Chris Bay
 */
@Entity
<<<<<<< Updated upstream
<<<<<<< HEAD
public class Event extends AbstractEntity {

=======
public class Event {

    @Id
    @GeneratedValue
    private int id;
>>>>>>> 34c1b4f
=======
public class Event extends AbstractEntity {

>>>>>>> Stashed changes

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

<<<<<<< Updated upstream
<<<<<<< HEAD
    @ManyToOne
    @NotNull(message = "Category is Required")
    private EventCategory eventCategory;

    public Event(String name, String description, String contactEmail, EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
    }

    public Event() {
    }
=======
    private EventType type;
=======
    @ManyToOne
    @NotNull(message = "Category is Required")
    private EventCategory eventCategory;
>>>>>>> Stashed changes

    public Event(String name, String description, String contactEmail, EventCategory eventCategory) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
    }

<<<<<<< Updated upstream
    public Event() {}
>>>>>>> 34c1b4f
=======
    public Event() {
    }
>>>>>>> Stashed changes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

<<<<<<< Updated upstream
<<<<<<< HEAD
    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }


=======
    public EventType getType() {
        return type;
=======
    public EventCategory getEventCategory() {
        return eventCategory;
>>>>>>> Stashed changes
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

<<<<<<< Updated upstream
    public int getId() {
        return id;
    }
>>>>>>> 34c1b4f
=======

>>>>>>> Stashed changes

    @Override
    public String toString() {
        return name;
    }
<<<<<<< Updated upstream
<<<<<<< HEAD
}


=======
=======
}
>>>>>>> Stashed changes


<<<<<<< Updated upstream
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
>>>>>>> 34c1b4f
=======
>>>>>>> Stashed changes
