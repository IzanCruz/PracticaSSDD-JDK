package es.urjc.sd.practicafinal;

public class Event {
    private Long id;
    private String name;
    private String description;
    private static int MAX = 200;
    private int numClients;

    public Event(Long id,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
        this.numClients = 0;

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

    public static int getMAX() {
        return MAX;
    }

    public int getNumClients() {
        return numClients;
    }

    public void addClient(){
        numClients++;
    }

    @Override
    public String toString() {
        return "event [id=" + id + ", name=" + name + ", description=" + description + "]";
    }

   
    
}
