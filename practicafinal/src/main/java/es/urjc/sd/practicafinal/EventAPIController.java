package es.urjc.sd.practicafinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class EventAPIController {

 @Autowired
     private EventService eventService; 

    
    @PostMapping("/api/events")
	public ResponseEntity<Event> createEvent(@PathVariable Long id, @RequestBody Event event) {

		event.setId(id);

		if(eventService.save(event)){
			return new ResponseEntity<>(event, HttpStatus.CREATED);
		}else{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
    }
 

