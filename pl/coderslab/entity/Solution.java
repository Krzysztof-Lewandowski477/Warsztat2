package pl.coderslab.entity;



import java.sql.Date;


public class Solution {
    private Integer id;
    private Date created;
    private Date updated;
    private String description;
    private Integer exerciseId;
    private Integer usersId;

    public Solution() {
    }

    public Solution(Date created, Date updated, String description) {
        this.created = created;
        this.updated = updated;
        this.description = description;
    }

    public Solution(Integer id, Date created, Date updated, String description, Integer exerciseId, Integer usersId) {
        this.id = id;
        this.created = created;
        this.updated = updated;
        this.description = description;
        this.exerciseId = exerciseId;
        this.usersId = usersId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Integer exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }
}
