/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.productsModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author El Rey
 */
public class CreateProductsModel {
    
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
    
    
    
     //Metodo para crear un archivo y establecerlo en una ruta especificada
    //------------------------------------------------------------------------------------------------
    public void createTextFile(){
        
        try{
            
            productsFile = new File(fileRuteProducts);
            
            if(!productsFile.exists()){
                
                productsFile.createNewFile();
                System.out.println("archivo creado, la ruta es: " + productsFile.getAbsolutePath());
            }
        }
        
        catch(IOException e){
            
            System.err.println("Error al crear o escribir archivo " + e.getMessage());
            
        }
    
    }
    
    //Metodo para agregar los datos de los clientes a una coleccion y al archivo de texto
   public void addProductsCollection() {
        
        // Verificar si el ID ya existe en el archivo
        if (isIdUnique(this.productId)) {
            // Agregar datos a la colección
            ArrayList<String> dataProductsArray = new ArrayList<>();
            dataProductsArray.add(this.productName);
            dataProductsArray.add(this.productBrand);
            dataProductsArray.add(this.productPrice);
            dataProductsArray.add(this.productQuantity);
            dataProductsArray.add(this.productId);

            // Agregar datos a la colección principal
            ArrayList<ArrayList<String>> principalProductsArray = new ArrayList<>();
            principalProductsArray.add(dataProductsArray);
            System.out.println("Los siguientes datos fueron guardados " + principalProductsArray);

            // Escribir en el archivo solo si el ID es único
            try (FileWriter fileWriter = new FileWriter(fileRuteProducts, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                bufferedWriter.write(String.join(", ", dataProductsArray));
                bufferedWriter.newLine();  // Agregar una nueva línea para cada producto
                JOptionPane.showMessageDialog(null, "Datos del producto almacenados");

            } catch (IOException e) {
                throw new RuntimeException("Error al añadir texto al archivo: " + e.getMessage(), e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El ID ya existe, no se puede agregar el producto.");
        }
    }

    // Método para verificar si el ID ya existe en el archivo
   private boolean isIdUnique(String id) {
    try (Scanner scanner = new Scanner(new File(fileRuteProducts))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] productsData = line.split(", ");

            // Verificar que haya al menos 5 elementos en productsData
            if (productsData.length >= 5) {
                String existingIdProducts = productsData[4].trim(); // Obtener el ID del producto

                // Verificar que existingIdProducts y id no sean null antes de llamar a trim()
                if (existingIdProducts != null && id != null && existingIdProducts.equalsIgnoreCase(id.trim())) {
                    return false; // ID duplicado
                }
            }
        }
    } catch (FileNotFoundException e) {
        System.err.println("El archivo no existe, se creará uno nuevo.");
    }
    return true; // ID único
}

}
