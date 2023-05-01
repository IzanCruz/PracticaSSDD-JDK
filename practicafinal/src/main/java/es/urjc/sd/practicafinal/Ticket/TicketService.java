package es.urjc.sd.practicafinal.Ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getByType(String type) {
        return ticketRepository.findByType(type);
    }

    public List<Ticket> getByEvent(String event){
        return ticketRepository.findByEvent(event);
    }

    public boolean save(Ticket ticket) {
        if (ticket.getName() == null || ticket.getName().isEmpty()) {
            return false;
        } else {
            ticketRepository.save(ticket);
            return true;
        }
    }

    public List<Ticket> findAllList() {
        return ticketRepository.findAll();
    }
}
