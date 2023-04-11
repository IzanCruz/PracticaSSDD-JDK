package es.urjc.sd.practicafinal;

public class Event {
    private Long id;
    private String name;
    private String description;
    private EventType type;
    private String date;
    private String room;
    
    

    public Event() {
    }


    public Event(Long id, String name, String date, String room) {
        this.id = id;
        this.name = name;
        this.date = date;
        
    }


    public Event(EventType type,String name,String description, String date, String room){
        this.type = type;
        this.name = name;
        this.description = description;
        this.date = date;
        this.room = room;
        }
        

    public Event(String name, String description,String date, String room) {
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

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
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
        return "Event [id=" + id + ", name=" + name + ", description=" + description + ", type=" + type + ", date="
                + date + ", room=" + room + "]";
    }

    
    

   
    
}
