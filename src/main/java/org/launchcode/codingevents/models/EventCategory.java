package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
@Entity
public class EventCategory extends AbstractEntity{


    public EventCategory(@Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        super(name);
    }

    public EventCategory() {}


    @Override
    public String toString() {
        return super.toString();
    }


}
