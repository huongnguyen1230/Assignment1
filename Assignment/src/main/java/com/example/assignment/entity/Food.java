package com.example.assignment.entity;
import com.example.assignment.annotation.Column;
import com.example.assignment.annotation.Entity;
import com.example.assignment.annotation.Id;
import com.example.assignment.util.SQLDataTypes;
import javafx.scene.control.Tab;

import java.util.Date;
@Entity(tableName = "foods")
public class Food {
    @Id(autoIncrement = true)
    @Column(columnName = "id", columnType = SQLDataTypes.INTEGER)
    private int id;
    @Column(columnName = "name", columnType = SQLDataTypes.VARCHAR50)
    private String name;
    @Column(columnName = "idCat", columnType = SQLDataTypes.INTEGER)
    private int idCategory;
    @Column(columnName = "description", columnType = SQLDataTypes.TEXT)
    private String description;
    @Column(columnName = "thumbnail", columnType = SQLDataTypes.TEXT)
    private String thumbnail;
    @Column(columnName = "price", columnType = SQLDataTypes.DOUBLE)
    private double price;
    @Column(columnName = "startDate", columnType = SQLDataTypes.DATETIME)
    private Date startDate;
    @Column(columnName = "editDate", columnType = SQLDataTypes.DATETIME)
    private Date editDate;
    @Column(columnName = "status", columnType = SQLDataTypes.INTEGER)
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

    public Food(String name, int idCategory, String description, String thumbnail, Double price, Date startDate, Date editDate, int status) {
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

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
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

    public boolean isValid() {
        return false;
    }
    public void getErrors(){

    }
}
