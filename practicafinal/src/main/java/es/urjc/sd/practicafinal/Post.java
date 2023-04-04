package es.urjc.sd.practicafinal;

public class Post {
    private Long id;
    private String name;
    private String email;
    private int tlf;
    private String text;
    
    public Post() {
    }
    

    public Post(String name, String email, int tlf, String text) {
        this.name = name;
        this.email = email;
        this.tlf = tlf;
        this.text = text;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Post [id=" + id + ", name=" + name + ", email=" + email + ", tlf=" + tlf + ", text=" + text + "]";
    }
    
   
}
