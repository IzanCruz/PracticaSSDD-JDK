package es.urjc.sd.practicafinal.Ticket;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
public class TicketAPIController {

    @Autowired
    private TicketService ticketService;


    @GetMapping("/api/tickets")
    public Collection<Ticket> test() {


        return ticketService.findAllList();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/ticketsM")
    public Ticket createReview(@RequestBody Ticket ticket) {

        ticketService.save(ticket);
        return ticket;

    }
}
