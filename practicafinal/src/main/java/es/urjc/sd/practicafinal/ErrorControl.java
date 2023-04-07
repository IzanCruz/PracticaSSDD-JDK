package es.urjc.sd.practicafinal;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorControl implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model) {
        // Personalizamos el mensaje de error
        String errorMessage = "Ha ocurrido un error inesperado. Por favor, inténtelo de nuevo más tarde.";
        model.addAttribute("errorMessage", errorMessage);
        
        // Devolvemos la vista de error personalizada
        return "static/error.html";
    }

    public String getErrorPath() {
        return "/error";
    }
}
