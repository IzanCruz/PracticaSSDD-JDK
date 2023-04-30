package es.urjc.sd.practicafinal.Ticket;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepository extends JpaRepository<Ticket, Long>{

        List<Ticket> findByEvent(String event);

        List<Ticket> findByType(String type);
}