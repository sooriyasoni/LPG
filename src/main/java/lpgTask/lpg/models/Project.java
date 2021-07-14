package lpgTask.lpg.models;

import java.time.LocalDate;
import java.util.Date;

public class Project {
    private int project_id;
    private String name;
    private String description;
    private Category category;
    private LocalDate creation_date;
    private LocalDate update_date;
    private LocalDate last_purchased_date;

    public Project() {
    }

    public Project(int project_id, String name, String description, Category category, LocalDate creation_date,
                   LocalDate update_date, LocalDate last_purchased_date) {
        this.project_id = project_id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.creation_date = creation_date;
        this.update_date = update_date;
        this.last_purchased_date = last_purchased_date;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }

    public LocalDate getLast_purchased_date() {
        return last_purchased_date;
    }

    public void setLast_purchased_date(LocalDate last_purchased_date) {
        this.last_purchased_date = last_purchased_date;
    }
}
