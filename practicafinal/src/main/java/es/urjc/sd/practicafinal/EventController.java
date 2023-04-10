package es.urjc.sd.practicafinal;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
       
            Event event = new Event(EventType.TECNO, "TECNO","Event TECNO");
            eventService.save(event);
        
            
       
        model.addAttribute("name", "REMEMBER");
        model.addAttribute("date", "2020-12-12");
        model.addAttribute("events", eventService.getByType(EventType.valueOf(type)));
        eventService.findAllList();
        return "mostrarEntradas"; 
    }

    @PostMapping("/events/add")
    public String addTicket(@RequestParam("name") String name, @RequestParam("description") String description,
            @RequestParam("num") int num, Model model) {

        // Guardar los datos del ticket en la base de datos o donde corresponda
        Event event = new Event(name, description);
        eventService.save(event);

        // Agregar los datos del ticket al modelo para mostrarlos en la vista
        model.addAttribute("name", name);
        model.addAttribute("description", description);
        

        // Cargar la vista ticketConfirmation
        return "eventConfirmation";
    }
} 
