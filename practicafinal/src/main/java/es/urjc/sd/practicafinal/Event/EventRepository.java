package es.urjc.sd.practicafinal.Event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List; 


@Repository
public interface EventRepository extends JpaRepository <Event, String> {
    List<Event> findByName(String name);

    List<Event> findByRoom(int room);
}
