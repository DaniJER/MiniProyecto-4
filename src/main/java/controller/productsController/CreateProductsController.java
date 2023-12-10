/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.productsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.productsModel.CreateProductsModel;
import view.addItemView;
import view.products.addProductView;

/**
 *
 * @author El Rey
 */
public class CreateProductsController implements ActionListener{
    
    private addItemView addItemView;
    private addProductView addProductView;
    private CreateProductsModel createProductsModel;

    public CreateProductsController(addItemView addItemView, addProductView addProductView, CreateProductsModel createProductsModel) {
        
        this.addItemView = addItemView;
        this.addProductView = addProductView;
        this.createProductsModel = createProductsModel;
        
        addItemView.selectProductButton.addActionListener(this);
        addProductView.addProductButton1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        addItemView.dispose();
        addProductView.setVisible(true);
        addProductView.setLocationRelativeTo(null);
        
        if(e.getSource() == addProductView.addProductButton1){
        
            createProductsModel.createTextFile();
            
            createProductsModel.setProductName(addProductView.productNameField.getText());
            createProductsModel.setProductBrand(addProductView.productBrandField.getText());
            createProductsModel.setProductPrice(addProductView.productPriceField.getText());
            createProductsModel.setProductQuantity(addProductView.productQuantityField.getText());
            createProductsModel.setProductId(addProductView.productIdDField.getText());
            
            
            
            createProductsModel.addProductsCollection();
        }
    }
    
}
