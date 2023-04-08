package es.urjc.sd.practicafinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketAPIController {

 @Autowired
     private TicketService ticketService; 

     @GetMapping("/api/tickets")
     public List<Ticket> test(@RequestParam(defaultValue = "VIP") String type) {
         for (int i = 0; i < 3; i++) {
             Ticket ticket =  new Ticket(TicketType.VIP, "Manolo","manolo@gmail.com",633943611);
         }
        for (int i = 0; i < 3; i++) {
            Ticket ticket = new Ticket(TicketType.NORMAL, "Ruben","ruben@gmail.com",641543011);
        }
        for (int i = 0; i < 3; i++) {
            Ticket ticket = new Ticket(TicketType.PREMIUM, "Jose Luis","js@gmail.com",603743011);
            ticketService.save(ticket);
        }
        return ticketService.getByType(TicketType.valueOf(type));
     }
    }
 
