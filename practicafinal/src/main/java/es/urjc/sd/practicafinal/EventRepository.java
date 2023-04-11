package es.urjc.sd.practicafinal;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List; 
import java.util.stream.Collectors;


@Repository
public class EventRepository {
    private HashMap<Long, Event> events = new HashMap<>();
    private Long nextId = 0L;

    public List<Event> getByType(EventType type) {
        return events.values().stream().filter(t -> t.getType().equals(type)).collect(Collectors.toList());
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
