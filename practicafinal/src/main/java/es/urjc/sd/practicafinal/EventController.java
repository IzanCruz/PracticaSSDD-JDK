package es.urjc.sd.practicafinal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class EventController {
    
   /*  @Autowired
    private EventService eventService; 

    @GetMapping("/events1")
    public String test1(Model model, String type) {
       
            Event event = new Ticket(TicketType.VIP, "Manolo","manolo@gmail.com",633943611);
            eventService.save(event);
        
            Event event1 = new Ticket(TicketType.VIP, "Manolo","manolo@gmail.com",633943611);
            eventService.save(event1);
       
            Event event2 = new Ticket(TicketType.VIP, "Manolo","manolo@gmail.com",633943611);
            eventService.save(event2);
       
        model.addAttribute("name", "REMEMBER");
        model.addAttribute("date", "2020-12-12");
        model.addAttribute("tickets", ticketService.getByType(TicketType.valueOf(type)));
        eventService.findAllList();
        return "mostrarEntradas"; 
    }

    @PostMapping("/tickets/add")
	public String newBookProcess(@ModelAttribute("ticket") Ticket ticket) {
       
        ticketService.save(ticket);
        return "mostrarEntradas" ;
		
	}*/
} 
