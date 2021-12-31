package com.practical.practical.model;

import com.practical.practical.entity.Phone;
import com.practical.practical.util.ConnectionHelper;

import java.sql.*;
import java.util.ArrayList;

public class PhoneModel {
    public static void main(String[] args) {
        PhoneModel phoneModel = new PhoneModel();
        phoneModel.save(new Phone(1, "J7 Prime", "Samsung", 4000000, ))
    }

    public ArrayList<Phone> findAll(){
        ArrayList<Phone> result = new ArrayList<>();
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select*from phones ");
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String brand = resultSet.getString("brand");
                    double price = resultSet.getDouble("price");
                    String description = resultSet.getString("description");

                    Phone phone = new Phone(id, name, brand, price,description);
                    result.add(phone);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public Phone findById(int id){
        return null;
    }

    public boolean save(Phone phone){
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into phones('name','brand','price','description') values (?,?,?,?)");
                preparedStatement.setString(1, phone.getName());
                preparedStatement.setString(2, phone.getBrand());
                preparedStatement.setDouble(3, phone.getPrice());
                preparedStatement.setString(4, phone.getDescription());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  false;
    }
}
