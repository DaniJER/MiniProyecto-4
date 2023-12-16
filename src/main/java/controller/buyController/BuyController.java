/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562
*/
package controller.buyController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
import view.buy. *;
import model.buyModel. *;
/**
 *
 * @author Juan
 */
public class BuyController implements ActionListener{
    private principalView principalView;
    private buyView buyView;
    private BuyModel buyModel;

    public BuyController(principalView principalView, buyView buyView, BuyModel buyModel) {
        
        this.principalView = principalView;
        this.buyView = buyView;
        this.buyModel = buyModel;
        
        principalView.buyProducts.addActionListener(this);
        buyView.buyProduct.addActionListener(this);
        buyView.backButtonBuy.addActionListener(this);
        buyView.principalMenuButtonVerify.addActionListener(this);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == principalView.buyProducts){
            principalView.dispose();
            
            buyView.setSize(950, 600);
            buyView.setVisible(true);
            buyView.setLocationRelativeTo(null);
        }
        if(e.getSource() == buyView.backButtonBuy){
            buyView.dispose();
            
            principalView.setVisible(true);
            principalView.setLocationRelativeTo(null);
        }
        if(e.getSource() == buyView.principalMenuButtonVerify){
            
            
            buyModel.buy(buyView.idDealer.getText());
            buyView.productAvaliableLabel.setText(buyModel.getProductName());
            buyView.quantityLabel.setText(buyModel.getQuantityStock());
        }
    }
}
