package es.urjc.sd.practicafinal.Others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import es.urjc.sd.practicafinal.Event.EventService;

@Controller
public class HomeController {

    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("sessions", eventService.findAllList());
        return "home";
    }

    @GetMapping("/entradas")
    public String entradas(Model model) {
        model.addAttribute("sessions", eventService.findAllList());
        return "entradas";
    }

    @GetMapping("/login.html")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/home.html")
    public String back(Model model) {
        model.addAttribute("sessions", eventService.findAllList());
        return "home";
    }

    @GetMapping("/entradas.html")
    public String vistaentradas(Model model) {
        return "entradas";
    }

}
