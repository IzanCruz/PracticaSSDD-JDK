package es.urjc.sd.practicafinal.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TicketController {

    private boolean control = true;

    @Autowired
    private TicketService ticketService; 

    @GetMapping("/tickets1")
    public String showTickets(Model model, @RequestParam(defaultValue = "VIP") String type) {
       if(control){
            Ticket ticket = new Ticket("Manolo","manolo@gmail.com",633943611, 1, TicketType.VIP, "REMEMBER");
            ticketService.save(ticket);
        
            Ticket ticket1 = new Ticket("Ruben","ruben@gmail.com",641543011, 1, TicketType.NORMAL, "POP");
            ticketService.save(ticket1);
       
            Ticket ticket2 = new Ticket("Jose Luis","js@gmail.com",603743011, 1, TicketType.PREMIUM, "TECNO");
            ticketService.save(ticket2);
            control = false;
       }
       
        model.addAttribute("name", "REMEMBER");
        model.addAttribute("date", "2020-12-12");
        model.addAttribute("tickets", ticketService.findAllList());
       
        
        return "showTickets"; 
    }

    @PostMapping("/tickets/add")
    public String addTicket(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") long phone,
            @RequestParam("type") TicketType type, @RequestParam("num") int num, @RequestParam("event") String event, Model model) {

        // Guardar los datos del ticket en la base de datos o donde corresponda
        Ticket ticket = new Ticket(name, email, phone, num, type, event);
        ticketService.save(ticket);

        // Agregar los datos del ticket al modelo para mostrarlos en la vista
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("phone", phone);
        model.addAttribute("num", num);
        model.addAttribute("type", type);
        model.addAttribute("event", event);

        // Cargar la vista ticketConfirmation
        return "ticketConfirmation";
    }


 
}



