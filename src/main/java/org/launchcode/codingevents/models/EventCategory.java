package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
<<<<<<< Updated upstream
<<<<<<< HEAD
=======
>>>>>>> Stashed changes
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
<<<<<<< Updated upstream
=======
import javax.validation.constraints.Size;
>>>>>>> 34c1b4f
=======
>>>>>>> Stashed changes
import java.util.Objects;

/**
 * Created by Chris Bay
 */
@Entity
<<<<<<< Updated upstream
<<<<<<< HEAD
public class EventCategory extends AbstractEntity {


    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @OneToMany(mappedBy = "eventCategory")
    private final List<Event> events = new ArrayList<>();

=======
public class EventCategory {
=======
public class EventCategory extends AbstractEntity {
>>>>>>> Stashed changes


    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

<<<<<<< Updated upstream
>>>>>>> 34c1b4f
=======
    @OneToMany(mappedBy = "eventCategory")
    private final List<Event> events = new ArrayList<>();

>>>>>>> Stashed changes
    public EventCategory(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

<<<<<<< Updated upstream
<<<<<<< HEAD
    public EventCategory() {
    }
=======
    public EventCategory() {}
>>>>>>> 34c1b4f
=======
    public EventCategory() {
    }
>>>>>>> Stashed changes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< Updated upstream
<<<<<<< HEAD
=======
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
    public List<Event> getEvents() {
        return events;
    }
}

=======
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventCategory that = (EventCategory) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
>>>>>>> 34c1b4f
=======
    public List<Event> getEvents() {
        return events;
    }
}

>>>>>>> Stashed changes
