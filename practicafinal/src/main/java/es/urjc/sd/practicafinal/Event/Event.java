package es.urjc.sd.practicafinal.Event;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "event")
public class Event {

    @Id
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DATE")
    private String date;
    @Column(name = "ROOM")
    private String room;
    
    
    public Event() {
    }


    public Event(Long id, String name, String date, String room) {
        this.id = id;
        this.name = name;
        this.date = date;
        
    }


    public Event(String name, String description, String date, String room){
        this.name = name;
        this.description = description;
        this.date = date;
        this.room = room;
        }


    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

     public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", description=" + description + ", date="
                + date + ", room=" + room + "]";
    }

    
    

   
    
}
