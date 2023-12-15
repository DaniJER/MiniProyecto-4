/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.productsModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class ReadProductsModel {
    
    //Variables que se mostraran en pantalla
    
    private String productName;
    private String productBrand;
    private String productPrice;
    private String productQuantity;
    private String productId;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    
    public boolean readProduct(String id) {
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/textFiles/productsData"))) {
            String line;
            ArrayList<String> productList = new ArrayList<>();

            // Lee el archivo y almacena cada línea en el ArrayList
            while ((line = br.readLine()) != null) {
                productList.add(line);
            }

            // Busca la cédula en el ArrayList
            for (String productsData : productList) {
                String[] dataProductsArray = productsData
                        .replaceAll("[\\[\\]]", "") // Elimina corchetes "[" y "]"
                        .split(", "); // Suponiendo que los datos están separados por ", "

                for (String data : dataProductsArray) {
                    String[] keyValue = data.split(": ");
                    
                    if (keyValue[0].trim().equals("Id") && keyValue[1].trim().equals(id)) {
                        // Si se encuentra la cédula, muestra los datos
                        
                        this.productName = dataProductsArray[0];
                        this.productBrand = dataProductsArray[1];
                        this.productPrice = dataProductsArray[2];
                        this.productQuantity = dataProductsArray[3];
                        this.productId = dataProductsArray[4];
                              
                        return true; // Indica que se encontró la cédula
                    }
                }
            }

            JOptionPane.showMessageDialog(null,"Producto no encontrado.");
            return false; // Indica que no se encontró el id

        } catch (IOException e) {
            e.printStackTrace();
            return false; // Manejo de excepciones
        }
    }
}
