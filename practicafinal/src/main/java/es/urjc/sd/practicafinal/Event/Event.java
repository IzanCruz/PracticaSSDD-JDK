package es.urjc.sd.practicafinal.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {

    @Id
    private String name;
    private String description;
    private String date;
    private int room;


    public Event() {
    }

    public Event(String name, String description, String date, int room) {
        super();
        this.name = name;
        this.description = description;
        this.date = date;
        this.room = room;
    }

    public Event (Event event){
        super();
        this.name = event.getName();
        this.description = event.getDescription();
        this.date = event.getDate();
        this.room = event.getRoom();
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
        return "Event [name=" + name + ", description=" + description + ", date="
                + date + ", room=" + room + "]";
    }

}
