package es.urjc.sd.practicafinal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    public static class ClubSession {
        private int id;
        private String name;

        public ClubSession(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    @GetMapping("/")
    public String home(Model model) {
        ClubSession[] sessions = new ClubSession[] {
            new ClubSession(1, "REMEMBER"),
            new ClubSession(2, "TECHNO"),
            new ClubSession(3, "PREUNIVERSIPARTY"),
            new ClubSession(4, "REGGAETON"),
            new ClubSession(5, "MÚSICA ESPAÑOLA"),
            new ClubSession(6, "POP"),
        }; 
        model.addAttribute("sessions", sessions);
        return "home";
    }
    @GetMapping("/login.html")
    public String login(Model model) {
       
        return "login";
    }
    @GetMapping("/login2")
    public String view(Model model) {
       
        return "admin";
    }


}
