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
import view. *;
import view.products. *;
import model.productsModel. *;
/**
 *
 * @author El Rey
 */
public class DeleteProductsController implements ActionListener {
    
    private deleteItemView deleteItemView;
    private deleteProductView deleteProductView;
    private DeleteProductsModel deleteProductsModel;
    
    public DeleteProductsController(deleteItemView deleteItemView, deleteProductView deleteProductView, DeleteProductsModel deleteProductsModel){
        this.deleteItemView = deleteItemView;
        this.deleteProductView = deleteProductView;
        this.deleteProductsModel = deleteProductsModel;
        
        deleteItemView.deleteProductButton.addActionListener(this);
        deleteProductView.backButtonDeleteProduct.addActionListener(this);
        deleteProductView.deleteProductButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteItemView.deleteProductButton){
            deleteItemView.dispose();
            deleteProductView.setVisible(true);
            deleteProductView.setLocationRelativeTo(null);
        }
        if(e.getSource() == deleteProductView.backButtonDeleteProduct){
            deleteProductView.dispose();
            deleteItemView.setVisible(true);
            deleteItemView.setLocationRelativeTo(null);
        }
        if(e.getSource() == deleteProductView.deleteProductButton){
            deleteProductsModel.deleteProduct(deleteProductView.idProductField.getText());
        }
    }
}
