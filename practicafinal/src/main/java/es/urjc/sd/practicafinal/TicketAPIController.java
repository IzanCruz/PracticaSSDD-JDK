package es.urjc.sd.practicafinal;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class TicketAPIController {

 @Autowired
     private TicketService ticketService; 

     @GetMapping("/api/tickets")
     public Collection<Ticket> test(@RequestParam(defaultValue = "VIP") String type) {
        
            Ticket ticket =  new Ticket(TicketType.VIP, "Manolo","manolo@gmail.com",633943611);
             ticketService.save(ticket);
          
            Ticket ticket1 = new Ticket(TicketType.NORMAL, "Ruben","ruben@gmail.com",641543011);
            ticketService.save(ticket1);
        
            Ticket ticket2 = new Ticket(TicketType.PREMIUM, "Jose Luis","js@gmail.com",603743011);
            ticketService.save(ticket2);
        
        return ticketService.findAllList();
     }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/ticketsM")
	public Ticket createReview(@RequestBody Ticket ticket) {

		ticketService.save(ticket);
        return ticket;

	    }
    }
 
