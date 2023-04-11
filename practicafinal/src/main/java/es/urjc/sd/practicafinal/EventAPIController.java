package es.urjc.sd.practicafinal;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class EventAPIController {

 @Autowired
     private EventService eventService; 

	 @GetMapping("/api/events")
	 
		public Collection<Event> test() {
        
            Event event = new Event("EVENTO1","NO PLANEADO","16-03-23","Sala 1");
            eventService.save(event);
          
            Event event1 = new Event("EVENTO2","NO PLANEADO","16-03-23","Sala 1");
            eventService.save(event1);
        
            Event event2 = new Event("EVENTO3","NO PLANEADO","16-03-23","Sala 1");
            eventService.save(event2);
        
        return eventService.findAllList();
     }
	 

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/addEvents")
	public Event createEvent(@RequestBody Event event) {
		eventService.save(event);
		return event;
	
		
		}
	@PutMapping("/api/editEvents")
	public Event editEvent(@RequestBody Event event){
		return event;
	}
	
	@DeleteMapping("/api/deleteEvents")
	public Event deleteEvent(@RequestBody Event event){
		eventService.deleteEvent(event);
		return event;
		}
    }
 

