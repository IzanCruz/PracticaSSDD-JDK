package es.urjc.sd.practicafinal.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Client {
    private String name;
    private int numTickets;
   

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getNumTickets() {
        return numTickets;
    }
    public void buyTicket(){numTickets++;}
    
}
