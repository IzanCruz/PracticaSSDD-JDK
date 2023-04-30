package es.urjc.sd.practicafinal.Ticket;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
        List<Ticket> findByType(String type);

        List<Ticket> findByEvent(String event);
}