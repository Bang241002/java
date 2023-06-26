package com.example.demo1.entity;


import java.util.ResourceBundle;


public class Product {
    private int Id;
    private String Fullname;
    private String birthday;
    private String Address;
    private String Position;
    private String Department;

    public Product() {

    }

    public Product(String Id){
        ResourceBundle resultSet = null;
        this.setFullname(resultSet.getString("Fullname"));
        this.setBirthday(resultSet.getString("Birthday"));
        this.setAddress(resultSet.getString("Address"));
        this.setPosition(resultSet.getString("Position"));
        this.setDepartment(resultSet.getString("Department"));
    }

    public int getId() {
        return Id;
    }

    public String getFullname() {
        return Fullname;
    }
    public String getBirthday (){
        return birthday;
    }
    public String getAddress (){
        return Address;
    }
    public String getPosition (){
        return Position;
    }
    public String getDepartment (){
        return Department;
    }

    public void setId(int id) {
        this.Id = Id;
    }
    public void setFullname(String fullname) {
        this.Fullname = Fullname;
    }

    public int setBirthday(String Birthday) {
        this.birthday = Birthday;
        return 0;
    }

    public void setAddress(String address) {
        this.Address = Address;
    }

    public void setPosition(String position) {
        this.Position = Position;
    }

    public void setDepartment(String department) {
        this.Department = Department;
    }



    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ",FullName='" + getFullname() + '\'' +
                ",Birthday=" + getBirthday() + '\'' +
                ",Address=" + getAddress() + '\'' +
                ",getPosition=" + getPosition() +'\'' +
                ",getDepartment=" + getDepartment() +
                '}';
    }

    public void setProductId(int Id) {
        this.Id = Id;
    }
}
