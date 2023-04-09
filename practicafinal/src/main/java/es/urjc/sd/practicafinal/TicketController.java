package es.urjc.sd.practicafinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TicketController {
    
    @Autowired
    private TicketService ticketService; 

    @GetMapping("/tickets1")
    public String test1(Model model, @RequestParam(defaultValue = "VIP") String type) {
       
            Ticket ticket = new Ticket(TicketType.VIP, "Manolo","manolo@gmail.com",633943611);
            ticketService.save(ticket);
        
            Ticket ticket1 = new Ticket(TicketType.NORMAL, "Ruben","ruben@gmail.com",641543011);
            ticketService.save(ticket1);
       
            Ticket ticket2 = new Ticket(TicketType.PREMIUM, "Jose Luis","js@gmail.com",603743011);
            ticketService.save(ticket2);
       
        model.addAttribute("name", "REMEMBER");
        model.addAttribute("date", "2020-12-12");
        model.addAttribute("tickets", ticketService.getByType(TicketType.valueOf(type)));
        return "mostrarEntradas"; 
    }

    @PostMapping("/tickets/add")
	public String newBookProcess(Ticket ticket) {
        System.out.println(ticket);
        ticketService.save(ticket);
        return "mostrarEntradas" ;
		
	}


 
}

// @RestController
// public class TicketController {
    
//     @Autowired
//     private TicketService ticketService; 

//     @GetMapping("/tickets")
//     public List<Ticket> test(@RequestParam(defaultValue = "VIP") String type) {
//         for (int i = 0; i < 3; i++) {
//             Ticket ticket = new Ticket(TicketType.VIP, "Manolo");
//             ticketService.save(ticket);
//         }
//         for (int i = 0; i < 3; i++) {
//             Ticket ticket = new Ticket(TicketType.NORMAL, "Ruben");
//             ticketService.save(ticket);
//         }
//         for (int i = 0; i < 3; i++) {
//             Ticket ticket = new Ticket(TicketType.PREMIUM, "Jose Luis");
//             ticketService.save(ticket);
//         }
//         return ticketService.getByType(TicketType.valueOf(type));
//     }
// }

