package es.urjc.sd.practicafinal.Event;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List; 
import java.util.stream.Collectors;


@Repository
public class EventRepository {
    private HashMap<Long, Event> events = new HashMap<>();
    private Long nextId = 0L;

    public List<Event> getByName(String name) {
        return events.values().stream().filter(t -> t.getName().equals(name)).collect(Collectors.toList());
    }

    public void save(Event event) {
        
        event.setId(nextId);
        events.put(nextId++, event);}

    public Collection<Event> findAll() {
        return events.values();
    }

    public Event deleteEvent(Event event) {
        return events.remove(event);
    }
        
    
}
