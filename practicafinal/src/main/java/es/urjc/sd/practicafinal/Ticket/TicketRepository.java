package es.urjc.sd.practicafinal.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public interface TicketRepository extends JpaRepository <Ticket, Long>{

        List<Ticket> findByType(String type);

        List<Ticket> findByEvent(String event);
}
