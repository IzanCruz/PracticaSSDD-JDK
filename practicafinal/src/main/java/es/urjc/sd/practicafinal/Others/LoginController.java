package es.urjc.sd.practicafinal.Others;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.urjc.sd.practicafinal.Event.EventService;

import org.springframework.ui.Model;


@Controller
public class LoginController {

  @Autowired
  private EventService eventService;

  @GetMapping("/login")
  public String showLoginForm() {
    return "login";
  }

  @RequestMapping("/login2")
    public String submitLoginForm(@RequestParam String username, @RequestParam String password) {
        if (username.equals("admin") && password.equals("1234")) {
            return "redirect:/admin";
        } else if (username.equals("usuario") && password.equals("1234")) {
            return "redirect:/user";
        } else {
            return "redirect:/error";
        }
    }
  

  @GetMapping("/admin")
  public String showAdminPage(Model model) {
    model.addAttribute("sessions", eventService.findAllList());
    return "admin";
  }

  @GetMapping("/user")
  public String showUserPage(Model model) {
    model.addAttribute("sessions", eventService.findAllList());
    return "user";
  }

  @GetMapping("/error")
  public String showErrorPage() {
    return "error";
  }

}

