package es.urjc.sd.practicafinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {
    
    @Autowired
    private TicketRepository ticketRepository;

    

    public List<Ticket> getByType(TicketType type) {
        return ticketRepository.getByType(type);
    }
    
    public boolean save(Ticket ticket) {
        if (ticket.getClient().isEmpty()){
            return false;
        }
        else{
       ticketRepository.save(ticket);
        return true;}
    }
}
