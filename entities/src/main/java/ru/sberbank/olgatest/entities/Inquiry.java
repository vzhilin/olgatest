package ru.sberbank.olgatest.entities;

import java.util.Date;

public class Inquiry {
    private Long id;

    private Date createDate;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Inquiry{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", description='" + description + '\'' +
                '}';
    }
}
