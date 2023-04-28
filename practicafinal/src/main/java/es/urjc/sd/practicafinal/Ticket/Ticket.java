package es.urjc.sd.practicafinal.Ticket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name; 

    private String email;

    private Long tlf;

    private TicketType type;

    private int num;

    private String event;

    public Ticket(String name, String email, long tlf, int num, TicketType type, String event) {
        this.type = type;
        this.name = name;
        this.email = email;
        this.num = num;
        this.tlf = tlf;
        this.event = event;
    }

    public TicketType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEvent(){
        return event;
    }

    public void setEvent(String event){
        this.event = event;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public Long getTlf() {
        return tlf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTlf(Long tlf) {
        this.tlf = tlf;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", name=" + name + ", email=" + email + ", tlf=" + tlf + ", num=" + num + ", type=" + type + "]";
    }
    
    
}
