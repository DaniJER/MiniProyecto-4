/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.productsModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author El Rey
 */
public class UpdateProductsModel {
    private String productName;
    private String productBrand;
    private String productPrice;
    private String productQuantity;
    private String productId;
    
    File productsFile;
    
    String fileRuteProducts = "src/main/java/textFiles/productsData";

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

    public File getProductsFile() {
        return productsFile;
    }

    public void setProductsFile(File productsFile) {
        this.productsFile = productsFile;
    }

    public String getFileRuteProducts() {
        return fileRuteProducts;
    }

    public void setFileRuteProducts(String fileRuteProducts) {
        this.fileRuteProducts = fileRuteProducts;
    }
    
    

    public boolean updateProducts(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileRuteProducts))) {

            String line;
            ArrayList<String> updatedProductsList = new ArrayList<>();
            boolean clientFound = false;

            while ((line = br.readLine()) != null) {
                String[] dataArray = line
                        .replaceAll("[\\[\\]]", "")
                        .split(", ");

                for (String data : dataArray) {
                    String[] keyValue = data.split(": ");

                    if (keyValue[1].trim().equals(id)) {
                        dataArray[0] = "Nombre: " + productName;
                        dataArray[1] = "Marca: " + productBrand;
                        dataArray[2] = "Precio: " + productPrice;
                        clientFound = true;
                    }
                }

                updatedProductsList.add(String.join(", ", dataArray));
            }

            if (clientFound) {
                // Escribe la lista actualizada en el archivo de texto
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileRuteProducts))) {
                    for (String updatedProduct : updatedProductsList) {
                        writer.write(updatedProduct);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return false; // Manejo de excepciones al escribir en el archivo
                }

                System.out.println("Producto actualizado:");
                for (String entry : updatedProductsList) {
                    System.out.println("Datos del producto: " + entry);
                }

                return true; // Indica que se encontró la cédula y se actualizó el cliente
            } else {
                System.out.println("Producto no encontrado.");
                return false; // Indica que no se encontró la cédula
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false; // Manejo de excepciones al leer el archivo
        }
    }
}
