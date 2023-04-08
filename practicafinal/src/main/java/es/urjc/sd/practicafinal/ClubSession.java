package es.urjc.sd.practicafinal;

public  class ClubSession {
    private int id;
    private String name;
    private String date;
    private String room;

    public ClubSession(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClubSession(int id, String name, String date,String room) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.room = room;
    }
    
}