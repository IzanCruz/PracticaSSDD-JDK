package es.urjc.sd.practicafinal;

/*import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class EventController {*/
    
    /*@Autowired
    private Client client;

    private ConcurrentMap<Long,Event> events = new ConcurrentHashMap<>();
    //for the usual user = client
    /*private void eventBought(Event event,Client client){
        if (event.getNumClients() < 200){
        event.addClient();
        client.buyTicket();
        clients.put(null, client);
        }
        else System.out.println("Aforo completo");
    }
    public EventController(){
        eventBought();

    }
    private AtomicLong nextId = new AtomicLong();

    private void addEvent(Event event){
        Long id = nextId.getAndIncrement();
        event.setId(id);
        events.put(id,event);
    }
    
    public EventController() {
		addEvent(new Event(2334L, "Fiesta de semáforos",""));
		addEvent(new Event(123L, "Fiesta de semáforos",""));
	}

    @RequestMapping("/")
    public String evento(Model model,HttpSession session){
        model.addAttribute("Eventos", events.values());
        model.addAttribute("Bienvenida",session.isNew());
        return "evento";
    }
    @RequestMapping("/event/new")
    public String newEvent(Model model, Event event){
        addEvent(event);
        client.setName(event.getName());
        client.incEvents();
        return "Evento_guardado";
    }


    @RequestMapping("/event/{id}")
    public String newEvent(Model model, @PathVariable Long id){
        Event event = events.get(id);
        model.addAttribute("event",event);
        return "see-event";
    }

    @RequestMapping("/event/{id}/delete")
    public String deleteEvent(Model model, @PathVariable Long id){
    Event event = events.remove(id);
    model.addAttribute("event", event);
    return "event-deleted";
    }
    */
/*} */
