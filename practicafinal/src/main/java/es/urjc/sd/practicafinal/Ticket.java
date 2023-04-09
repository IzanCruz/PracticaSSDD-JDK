package es.urjc.sd.practicafinal;

public class Ticket {
    private Long id;
    private TicketType type;
    private String email;
    private int tlf;
    private String client; 

    public Ticket(TicketType type, String client,String email, int tlf) {
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

    public int getTlf() {
        return tlf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public void setClient(String client) {
        this.client = client;
    }
    
}
