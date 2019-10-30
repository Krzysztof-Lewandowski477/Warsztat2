package src.pl.coderslab.entity;

public class Exercise {

    private Integer id;
    private String title;
    private String description;


    public Exercise() {
    }

    public Exercise(String title, String description) {
        this.description = description;
        this.title = title;

    }

    public Exercise(Integer id, String title, String description) {
        this.id = id;
        this.description = description;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
