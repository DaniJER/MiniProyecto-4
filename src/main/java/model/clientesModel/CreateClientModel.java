/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.clientesModel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class CreateClientModel {
    
    private String name;
    private String lastName;
    private String brand;
    private String id;
    private String cel;
    
    ArrayList<ArrayList<String>> principalClientArray = new ArrayList<>();
    ArrayList<String> dataClientArray = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public void addUsersCollection(){
    
        dataClientArray.add(this.name);
        dataClientArray.add(this.lastName);
        dataClientArray.add(this.id);
        dataClientArray.add(this.cel);



        principalClientArray.add(dataClientArray);
        System.out.println("Array de datos: " + principalClientArray);
    
    }
    
    
}
