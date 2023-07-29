package org.launchcode.codingevents.models;

import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;


    private String name;
    private String description;
    private int date;
    private String location;
    public Event(String name, String description, int date, String location) {
        this.name = name;
        this.description=description;
        this.date = date;
        this.location = location;
        this.id=nextId;
        nextId++;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    @Override
    public String toString() {
        return name;
    }

}
