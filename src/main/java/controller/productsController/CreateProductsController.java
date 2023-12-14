/*
    UNIVERSIDAD DEL VALLE
    AUTORES:
    DANIEL JOSÉ ENRIQUEZ, COD: 2240920 - JUAN SEBASTIAN VIEDMAN, COD: 2242562
    
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.productsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.productsModel.CreateProductsModel;
import view.addItemView;
import view.principalView;
import view.products.addProductView;

/**
 *
 * @author El Rey
 */
public class CreateProductsController implements ActionListener{
    
    private addItemView addItemView;
    private addProductView addProductView;
    private CreateProductsModel createProductsModel;
    private principalView principalView;

    public CreateProductsController(addItemView addItemView, addProductView addProductView, CreateProductsModel createProductsModel, principalView principalView) {
        
        this.addItemView = addItemView;
        this.addProductView = addProductView;
        this.createProductsModel = createProductsModel;
        this.principalView = principalView;
        
        addItemView.selectProductButton.addActionListener(this);
        addProductView.backButtonProducts.addActionListener(this);
        addProductView.backButtonProducts.addActionListener(this);
        addProductView.principalMenuButtonProducts.addActionListener(this);
        addProductView.addProductButton1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addItemView.selectProductButton){
            
            addItemView.dispose();
            addProductView.setVisible(true);
            addProductView.setSize(950,600);
            addProductView.setLocationRelativeTo(null);
            
        }
        if(e.getSource() == addProductView.addProductButton1){
        
            String name = addProductView.productNameField.getText();
            String brand = addProductView.productBrandField.getText();
            String price = addProductView.productPriceField.getText();
            String cantidad = addProductView.productQuantityField.getText();
            String id = addProductView.productIdDField.getText();
            
            //VALIDADOR PARA ASEGURARSE DE QUE SE LLENEN LOS CAMPOS DE AGREGAR CLIENTE
            if(name.isEmpty() || brand.isEmpty() || price.isEmpty() || cantidad.isEmpty() && id.isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Por favor llene los campos");
                
            }else{
                createProductsModel.createTextFile();
                createProductsModel.setProductName("Nombre del producto: " + addProductView.productNameField.getText());
                createProductsModel.setProductBrand("Marca del producto: " +addProductView.productBrandField.getText());
                createProductsModel.setProductPrice("Precio: " +addProductView.productPriceField.getText());
                createProductsModel.setProductQuantity("Cantidad: " +addProductView.productQuantityField.getText());
                createProductsModel.setProductId("Id: " +addProductView.productIdDField.getText());
                createProductsModel.addProductsCollection();
            }
        }
        if(e.getSource() == addProductView.backButtonProducts){
        
            addProductView.dispose();
            addItemView.setVisible(true);
        }
        if(e.getSource() == addProductView.principalMenuButtonProducts){
        
            addProductView.dispose();
            addItemView.dispose();
            principalView.setVisible(true);
        }
    }
    
}
