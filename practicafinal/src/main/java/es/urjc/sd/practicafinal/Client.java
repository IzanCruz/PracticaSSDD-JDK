package es.urjc.sd.practicafinal;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Client {
    private String name;
    private int numTickets;
    private int numEvents;

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
    public void incEvents(){numEvents++;}
}
