package org.launchcode.codingevents.models;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Event {
    private String name;
    private String description;

    @NotBlank(message="Location can't be left blank!")
    private String location;

    @AssertTrue(message="All events must be registered for")
    private  boolean mustRegister;

    @Positive(message="Number of attendees must be one or more")
    private int numAttendees;


    private int id;
    private static int nextId=1;

    public Event(String name, String description, String location){
        this();
        this.name=name;
        this.description=description;
        this.location=location;

    }
    public Event(){
        this.id=nextId;
        nextId++;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public boolean isMustRegister() {
        return mustRegister;
    }

    public int getNumAttendees() {
        return numAttendees;
    }

    @Override
    public String toString(){
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
