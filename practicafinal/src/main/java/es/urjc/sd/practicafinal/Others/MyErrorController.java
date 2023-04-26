package es.urjc.sd.practicafinal.Others;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {
        //do something like logging
        return "myErrorPage";
    }

    
    public String getErrorPath() {
        return "/error";
    }
}