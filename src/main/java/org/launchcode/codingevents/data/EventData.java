package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    //responsible for storing event objects
    //data structure to put events like list or map
    private static final Map<Integer, Event> events = new HashMap<>();
    //should be able to get all events
    public static Collection<Event> getAll(){
        return events.values();
    }
    //get single event
    public static Event getById(int id){
    return events.get(id);
    //will return object with that specific key
    }
    //add or remove event
    public static void add(Event event){
        events.put(event.getId(), event );
    }
    public static void removeEvent(int id){
        events.remove(id);
    }
}
