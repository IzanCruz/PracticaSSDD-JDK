package es.urjc.sd.practicafinal.Event;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

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
            @RequestParam("date") String date, @RequestParam("room") int room, Model model) {
        Event event = new Event(name, description, date, room);
        eventService.save(event);

        model.addAttribute("name", name);
        model.addAttribute("description", description);
        model.addAttribute("date", date);
        model.addAttribute("room", room);
        return "eventConfirmation";

    }

    @GetMapping("/editEvent.html")
    public String editEvent(Model model) {
        return "editEvent";
    }

    @RequestMapping("/events/delete")
    @DeleteMapping("/events/delete")
    public String deleteEvent(Event event, Model model) {
        eventService.deleteEvent(event);
        return "eventDeleted";
    }

}
