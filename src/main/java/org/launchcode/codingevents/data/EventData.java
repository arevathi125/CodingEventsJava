package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventData {

    // Need to place to put events
     private static Map<Integer, Event> events = new HashMap<>();

    // Get all events
    public static Collection<Event> getAll(){
         return events.values();
    }

    // Get a single event
     public static Event getById(int id){
         return events.get(id);
     }

    // Add an event
     public static void add(Event event){
        events.put(event.getId(), event);
     }

    // Delete an event
     public static void remove(int id){
         events.remove(id);
     }
}
