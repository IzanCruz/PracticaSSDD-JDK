package es.urjc.sd.practicafinal;

public class Event {
    private Long id;
    private String nombre;
    private String descripcion;
    private static int tope = 200;

    public Event(Long id,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Long getId() {
        return id;
    }

     public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static int getMAX() {
        return MAX;
    }

    @Override
    public String toString() {
        return "event [id=" + id + ", name=" + name + ", description=" + description + "]";
    }

   
    
}
