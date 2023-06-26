package com.example.demo1.Dao;


import com.example.demo1.entity.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private  static  String URL = "jdbc:mysql://127.0.0.1:3306/employess?user=root";
    private  static  String USER = "root";
    private  static  String PASSWORD = "";
    private  static Connection CONNECTION =getCONNECTION();

    private  static  Connection getCONNECTION(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ProductDao() {
    }

    /**
     * Select List Student From DB
     * @return
     */
    public List<Product> findAll(){
        List<Product> list = new ArrayList<>();
        try {
            ResultSet resultSet = CONNECTION.createStatement().executeQuery("select * from product" );
            while (resultSet.next()){
                Product product = new Product();
                product.setId(resultSet.getInt("Id"));
                product.setFullname(resultSet.getString("Fullname"));
                product.setBirthday(resultSet.getString("Birthday"));
                product.setAddress(resultSet.getString("Address"));
                product.setPosition(resultSet.getString("Position"));
                product.setDepartment(resultSet.getString("Department"));
                list.add(product);
            }
            resultSet.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }

    /**
     * get product by id
     * @param Id
     * @return result
     */
    public Product findById(int Id){
        for (Product product:findAll()){
            if (product.getId() == Id){
                return product;
            }
        }
        return  null;
    }

    /**
     * Add Product
     * @param Id
     * @return status
     */
    public boolean add(Product Id){
        try{
            PreparedStatement preparedStatement = CONNECTION.prepareStatement("insert into product (Fullname,Birthday,Address,PositionDepartment) values(?,?,?,?,?,?);");
            preparedStatement.setInt(1, Id.getId());
            preparedStatement.setString(2, Id.getFullname());
            preparedStatement.setString(3, Id.getBirthday());
            preparedStatement.setString(4, Id.getAddress());
            preparedStatement.setString(5, Id.getPosition());
            preparedStatement.setString(6, Id.getDepartment());
            preparedStatement.execute();
            preparedStatement.close();
            return  true;
        }catch (Exception e){
            System.out.println(Id);
        }

        return false;
    }

    /**
     * Update Product
     * @param Id
     * @return status
     */
    public boolean update(Product Id){
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement("UPDATE product set Id=? , Id=? WHERE Id=? , Id=? ,");
            preparedStatement.setInt(1, Id.getId());
            preparedStatement.setString(2, Id.getFullname());
            preparedStatement.setString( 3, Id.getBirthday());
            preparedStatement.setString(4, Id.getAddress());
            preparedStatement.setString(5, Id.getPosition());
            preparedStatement.setString( 6, Id.getDepartment());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Delete product by id
     * @param Id
     * @return status
     */
    public boolean delete(int Id){
        try {
            PreparedStatement preparedStatement = CONNECTION.prepareStatement("DELETE FROM product WHERE productId=?");
            preparedStatement.setInt(1, Id);
            preparedStatement.execute();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        //select all
//        for(Product product : dao.findAll()){
//            System.out.println(product);
//        }

        //add
//        Product product = new Product();
//        product.setId("");
//        product.setFullname(20);
//        product.setBirthday(24);
//        product.Address();
//        product.Position(20);
//        product.Department(24);
//
//
//
//        if(dao.add(product)){
//            System.out.println("ADD Product Success");
//        }else {
//            System.out.println("ADD Fail");
//        }

        //find by id
//        System.out.println(dao.findById(1));

        //update
//        Product iphone6=dao.findById(4);
//        if( iphone6 != null){
//            iphone6.setQuantity(50);
//        }
//        if (dao.update(iphone6)){
//            System.out.println("Update Success");
//        }else {
//            System.out.println("Update Fail");
//        }

        //delete
//        if(dao.delete(5)){
//            System.out.println("Delete success");
//        }else {
//            System.out.println("Delete fail");
//        }
    }
}
