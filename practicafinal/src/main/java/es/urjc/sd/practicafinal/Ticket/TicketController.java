package es.urjc.sd.practicafinal.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets1")
    public String showTickets(Model model) {

        model.addAttribute("event", "REMEMBER");
        model.addAttribute("date", "2020-12-12");
        model.addAttribute("tickets", ticketService.getByType("NORMAL"));

        return "showTickets";
    }

    @PostMapping("/tickets/add")
    public String addTicket(@RequestParam("name") String name, @RequestParam("email") String email,
            @RequestParam("phone") long phone,
            @RequestParam("type") String type, @RequestParam("num") int num, @RequestParam("event") String event,
            Model model) {

        // Guardar los datos del ticket en la base de datos o donde corresponda
        Ticket ticket = new Ticket(name, email, phone, event, num, type);
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
