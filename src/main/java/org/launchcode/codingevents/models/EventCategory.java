package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
=======
import javax.validation.constraints.Size;
>>>>>>> 34c1b4f
import java.util.Objects;

/**
 * Created by Chris Bay
 */
@Entity
<<<<<<< HEAD
public class EventCategory extends AbstractEntity {


    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @OneToMany(mappedBy = "eventCategory")
    private final List<Event> events = new ArrayList<>();

=======
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

>>>>>>> 34c1b4f
    public EventCategory(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public EventCategory() {
    }
=======
    public EventCategory() {}
>>>>>>> 34c1b4f

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
=======
    public int getId() {
        return id;
    }

>>>>>>> 34c1b4f
    @Override
    public String toString() {
        return name;
    }

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
