package es.urjc.sd.practicafinal.Ticket;

public class Ticket {
    private long id;
    private TicketType type;
    private String email;
    private Long tlf;
    private String client; 

    public Ticket(TicketType type, String client,String email, long tlf) {
        this.type = type;
        this.client = client;
        this.email = email;
        this.tlf = tlf;
    }

    public TicketType getType() {
        return type;
    }

    public String getClient() {
        return client;
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
        return "Ticket [id=" + id + ", type=" + type + ", email=" + email + ", tlf=" + tlf + ", client=" + client + "]";
    }
    
    
}
