package es.urjc.sd.practicafinal.Ticket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String client; 

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private Long tlf;

    @Column(name = "NUM")
    private int num;

    @Column(name = "TYPE")
    private TicketType type;

    @Column(name = "EVENT")
    private String event;

    public Ticket(String client, String email, long tlf, int num, TicketType type, String event) {
        this.type = type;
        this.client = client;
        this.email = email;
        this.num = num;
        this.tlf = tlf;
        this.event = event;
    }

    public TicketType getType() {
        return type;
    }

    public String getClient() {
        return client;
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

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", client=" + client + ", email=" + email + ", tlf=" + tlf + ", num=" + num + ", type=" + type + "]";
    }
    
    
}
