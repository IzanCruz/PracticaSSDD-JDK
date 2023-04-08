package es.urjc.sd.practicafinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {
    
    @Autowired
    private TicketService ticketService; 

    @GetMapping("/tickets")
    public String test1(Model model, @RequestParam(defaultValue = "VIP") String type) {
        for (int i = 0; i < 3; i++) {
            Ticket ticket = new Ticket(TicketType.VIP, "Manolo","manolo@gmail.com",633943611);
            ticketService.save(ticket);
        }
        for (int i = 0; i < 3; i++) {
            Ticket ticket = new Ticket(TicketType.NORMAL, "Ruben","ruben@gmail.com",641543011);
            ticketService.save(ticket);
        }
        for (int i = 0; i < 3; i++) {
            Ticket ticket = new Ticket(TicketType.PREMIUM, "Jose Luis","js@gmail.com",603743011);
            ticketService.save(ticket);
        }
        model.addAttribute("name", "REMEMBER");
        model.addAttribute("date", "2020-12-12");
        model.addAttribute("tickets", ticketService.getByType(TicketType.valueOf(type)));
        return "mostrarEntradas"; 
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

