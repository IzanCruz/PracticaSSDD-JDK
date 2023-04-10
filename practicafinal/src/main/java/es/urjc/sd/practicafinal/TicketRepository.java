package es.urjc.sd.practicafinal;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List; 
import java.util.stream.Collectors;


@Repository
public class TicketRepository {
    private HashMap<Long, Ticket> tickets = new HashMap<>();
    private Long nextId = 0L;

    public List<Ticket> getByType(TicketType type) {
        return tickets.values().stream().filter(t -> t.getType().equals(type)).collect(Collectors.toList());
    }

    public void save(Ticket ticket) {
        
        ticket.setId(nextId);
        tickets.put(nextId++, ticket);}

    public List<Ticket> findAll() {
        return null;
    }
        
    
}
