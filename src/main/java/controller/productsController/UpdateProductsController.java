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
/**
 *
 * @author El Rey
 */
public class UpdateProductsController implements ActionListener {
    private updateItemView updateItemView;
    private updateProductView updateProductView;
    
    public UpdateProductsController(updateItemView updateItemView, updateProductView updateProductView){
        this.updateItemView = updateItemView;
        this.updateProductView = updateProductView;
        
        updateItemView.updateProductButton.addActionListener(this);
        //updateProductView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == updateItemView.updateProductButton){
            updateItemView.dispose();
            updateProductView.setVisible(true);
            updateProductView.setLocationRelativeTo(null);
        }
        /*if(e.getSource() == updateProductView.backButton){
            updateProductView.dispose();
            updateItemView.setVisible(true);
            updateItemView.setLocationRelativeTo(null);
        }*/
    }
}
