package com.example.assignment.entity;
import java.util.Date;

public class Food {
    private int id;
    private String name;
    private int idCategory;
    private String description;
    private String thumbnail;
    private double price;
    private Date startDate;
    private Date editDate;
    private int status;

    public Food() {

    }

    public Food(int id, String name, int idCategory, String description, String thumbnail, double price, Date startDate, Date editDate, int status) {
        this.id = id;
        this.name = name;
        this.idCategory = idCategory;
        this.description = description;
        this.thumbnail = thumbnail;
        this.price = price;
        this.startDate = startDate;
        this.editDate = editDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
