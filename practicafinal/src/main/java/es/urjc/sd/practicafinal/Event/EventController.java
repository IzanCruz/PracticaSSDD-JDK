package es.urjc.sd.practicafinal.Event;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import es.urjc.sd.practicafinal.Ticket.Ticket;
import es.urjc.sd.practicafinal.Ticket.TicketService;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private TicketService ticketService;

    @PostMapping("/events/add")
    public String addTicket(@RequestParam("name") String name, @RequestParam("description") String description,
            @RequestParam("date") String date, @RequestParam("room") int room, Model model) {

        Event event = new Event(name, description, date, room);
        eventService.save(event);

        model.addAttribute("name", name);
        model.addAttribute("description", description);
        model.addAttribute("date", date);
        model.addAttribute("room", room);

        return "eventConfirmation";
    }

    @GetMapping("/createEvent.html")
    public String createEvent(Model model) {
        return "createEvent";
    }

    @RequestMapping("/events/edit")
    @PutMapping("/events/edit")
    public String editEvent(@RequestParam("name") String name, @RequestParam("description") String description,
            @RequestParam("date") String date, @RequestParam("room") int room,
            @RequestParam("event_name") String event_name,
            Model model) {
        Event event = new Event(name, description, date, room);
        eventService.save(event);

        if (ticketService.getByEvent(event_name).size() != 0) {
            List<Ticket> aux = ticketService.getByEvent(event_name);
            for (int i = 0; i < aux.size(); i++) {
                aux.get(i).setEvent(name);
                ticketService.save(aux.get(i));
            }
        }
        if (!(name.equals(event_name))){
        eventService.deleteEvent(eventService.getByName(event_name).get(0));}

        model.addAttribute("name", name);
        model.addAttribute("description", description);
        model.addAttribute("date", date);
        model.addAttribute("room", room);
        return "eventConfirmation";

    }

    @GetMapping("/preEditEvent.html")
    public String preEditEvent(Model model) {
        model.addAttribute("sessions", eventService.findAllList());
        return "preEditEvent";
    }

    @GetMapping("/editEvent")
    public String editEvent(@RequestParam String event, Model model) {
        model.addAttribute("sessions", eventService.getByName(event));
        model.addAttribute("tickets", ticketService.getByEvent(event));
        return "editEvent";
    }

    @GetMapping("/deleteEvent")
    public String deleteEventPage(Model model) {
        model.addAttribute("sessions", eventService.findAllList());
        return "deleteEvent";
    }

    @RequestMapping("/events/delete")
    @DeleteMapping("/events/delete")
    public String deleteEvent(@RequestParam Event event, Model model) {
        if (ticketService.getByEvent(event.getName()).size() != 0) {
            List<Ticket> aux = ticketService.getByEvent(event.getName());
            for (int i = 0; i < aux.size(); i++) {
                ticketService.delete(aux.get(i));
            }
        }
        eventService.deleteEvent(event);
        return "eventDeleted";
    }

}
