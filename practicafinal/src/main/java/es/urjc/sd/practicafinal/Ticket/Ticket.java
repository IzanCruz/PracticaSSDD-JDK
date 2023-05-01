package es.urjc.sd.practicafinal.Ticket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private Long phone;
    private String event;
    private String type;
    private int num;

    public Ticket() {

    }

    public Ticket(String name, String email, Long phone, String event, int num, String type) {
        super();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.event = event;
        this.num = num;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public Long getphone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setphone(Long phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", num=" + num
                + ", type=" + type + "]";
    }

}
