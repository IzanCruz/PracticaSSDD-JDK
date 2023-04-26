package es.urjc.sd.practicafinal.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EventService {
    
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getByType(String name) {
        return eventRepository.getByName(name);
    }
    
    public  boolean save(Event event) {
        if (event.getName() == null || event.getName().isEmpty()) {
            return false;
        } else {
            eventRepository.save(event);
            return true;
        }
    }

    public Collection<Event> findAllList() {
       return eventRepository.findAll();
    }

    public Event deleteEvent(Event event) {
        return eventRepository.deleteEvent(event);
    }
}
