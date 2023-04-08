package es.urjc.sd.practicafinal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String showLoginForm() {
    return "login.html";
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
  public String showAdminPage() {
    return "admin.html";
  }

  @GetMapping("/user")
  public String showUserPage() {
    return "user.html";
  }

  @GetMapping("/error")
  public String showErrorPage() {
    return "error.html";
  }

}

