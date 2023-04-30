package es.urjc.sd.practicafinal.Event;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
        
        return eventService.findAllList();
     }

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/api/addEvents")
	public Event createEvent(@RequestBody Event event) {
		eventService.save(event);
		return event;

	}

	@PutMapping("/api/editEvents")
	public Event editEvent(@RequestBody Event event) {
		return event;
	}

	@DeleteMapping("/api/deleteEvents")
	public Event deleteEvent(@RequestBody Event event) {
		eventService.deleteEvent(event);
		return event;
	}
}


