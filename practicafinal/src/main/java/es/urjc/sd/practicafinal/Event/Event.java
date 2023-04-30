package es.urjc.sd.practicafinal.Event;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "event")
public class Event {

    @Column(name = "ID")
    private long id;

    @Id
    @Column(name = "NAME")
    private String name;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "DATE")
    private String date;
    
    @Column(name = "ROOM")
    private int room;
    
    
    public Event() {
    }


    public Event(Long id, String name, String date, int room) {
        this.id = id;
        this.name = name;
        this.date = date;
        
    }


    public Event(String name, String description, String date, int room){
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", description=" + description + ", date="
                + date + ", room=" + room + "]";
    }

    
    

   
    
}
