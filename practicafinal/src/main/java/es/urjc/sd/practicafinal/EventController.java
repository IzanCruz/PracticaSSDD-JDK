package es.urjc.sd.practicafinal;


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

    @GetMapping("/events1")
    public String test1(Model model, String type) {
       
            Event event = new Event(EventType.TECNO, "TECNO","Event TECNO","16-05-23 23:30","Sala 2");
            eventService.save(event);
        
            
       
        model.addAttribute("name", "REMEMBER");
        model.addAttribute("date", "2020-12-12");
        model.addAttribute("events", eventService.getByType(EventType.valueOf(type)));
        eventService.findAllList();
        return "showEvents"; 
    }

    @PostMapping("/events/add")
    public String addTicket(@RequestParam("name") String name, @RequestParam("description") String description,
            @RequestParam("date") String date,  @RequestParam("room") String room, Model model) {

         Event event = new Event(name, description,date,room);
        eventService.save(event);

       
        model.addAttribute("name", name);
        model.addAttribute("description", description);
        model.addAttribute("date", date);
        model.addAttribute("room", room);        
        
>>>>>>> 10b2750b90349a3c8c405bcd52f8b0ed4aec1209
        return "eventConfirmation";
    }

    @GetMapping("/createEvent.html")
    public String createEvent(Model model) {
        return "createEvent";
    }

    
    @RequestMapping("/events/edit")
    @PutMapping("/events/edit")
    public String editEvent(@RequestParam("name") String name, @RequestParam("description") String description,
    @RequestParam("date") String date,  @RequestParam("room") String room, Model model) {
        Event event = new Event(name,description,date,room);
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

    
} 
