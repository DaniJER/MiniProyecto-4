/*

    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

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
public class UpdateProductsController implements ActionListener {
    private updateItemView updateItemView;
    private updateProductView updateProductView;
    private UpdateProductsModel updateProductsModel;
    
    public UpdateProductsController(updateItemView updateItemView, updateProductView updateProductView, UpdateProductsModel updateProductsModel){
        this.updateItemView = updateItemView;
        this.updateProductView = updateProductView;
        this.updateProductsModel = updateProductsModel;
        
        updateItemView.updateProductButton.addActionListener(this);
        updateProductView.backButtonProduct.addActionListener(this);
        updateProductView.updateProductButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == updateItemView.updateProductButton){
            updateItemView.dispose();
            updateProductView.setVisible(true);
            updateProductView.setLocationRelativeTo(null);
        }
        if(e.getSource() == updateProductView.backButtonProduct){
            updateProductView.dispose();
            updateItemView.setVisible(true);
            updateItemView.setLocationRelativeTo(null);
        }
        if(e.getSource() == updateProductView.updateProductButton){
            updateProductsModel.setProductName(updateProductView.productNameField.getText());
            updateProductsModel.setProductBrand(updateProductView.productBrandField.getText());
            updateProductsModel.setProductPrice(updateProductView.productPriceField.getText());
            
            updateProductsModel.updateProducts(updateProductView.idProductField.getText());
        }
    }
}
