package org.launchcode.codingevents.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long")
    private String description;

    @NotBlank(message = "Event location is required")
    @Size(min = 3, max = 50, message = "Location name must be between 3 and 50 characters")
    private String location;

    @Positive(message = "Number of attendees must be one or more")
    private int numberOfAttendees;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    private Boolean registrationRequired;

    public Event(String name, String description, String location, int numberOfAttendees, String contactEmail, Boolean registrationRequired) {
        this();
        this.name = name;
        this.description = description;
        this.location = location;
        this.numberOfAttendees = numberOfAttendees;
        this.contactEmail = contactEmail;
        this.registrationRequired = registrationRequired;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
