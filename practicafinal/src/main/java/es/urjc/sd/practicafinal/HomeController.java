package es.urjc.sd.practicafinal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
   

    private Event[] getSessions() {
       Event[] sessions = new Event[] {
            new Event((long)1, "REMEMBER","13/05 23:00h","Sala 1"),
            new Event((long)2, "TECHNO","14/05 23:30" ,"Sala 2"),
            new Event((long)3, "PREUNIVERSIPARTY","05/05 23:00" ,"Sala 1"),
            new Event((long)4, "REGGAETON","06/05 23:30" ,"Sala 2"),
            new Event((long)5, "MÚSICA ESPAÑOLA","13/05 23:00" ,"Sala 2"),
            new Event((long)6, "POP","13/05 23:30" ,"Sala 2"),
        };
        return sessions;
    }
    
    @GetMapping("/")
    public String home(Model model) {
       Event[] sessions = getSessions();
        model.addAttribute("sessions", sessions);
        return "home";
    }

    @GetMapping("/entradas")
    public String entradas(Model model) {
        Event[] sessions = getSessions();
        model.addAttribute("sessions", sessions);
        return "entradas";
    }


    @GetMapping("/login.html")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/home.html")
    public String back(Model model) {
        return "home";
    }

    @GetMapping("/entradas.html") 
    public String vistaentradas(Model model){
        return "entradas";
    }
    
    
 


}
