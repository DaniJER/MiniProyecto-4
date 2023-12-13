/*
    UNIVERSIDAD DEL VALLE
    AUTORES:
    DANIEL JOSÉ ENRIQUEZ, COD: 2240920 - JUAN SEBASTIAN VIEDMAN, COD: 2242562
*/

package controller.dealersController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
import view.dealers. *;
import model.DealersModel. *;

public class UpdateDealersController implements ActionListener{
    private updateItemView updateItemView;
    private updateDealerView updateDealerView;
    private UpdateDealerModel updateDealerModel;
    
    public UpdateDealersController(updateItemView updateItemView, updateDealerView updateDealerView, UpdateDealerModel updateDealerModel){
        this.updateItemView = updateItemView;
        this.updateDealerView = updateDealerView;
        this.updateDealerModel = updateDealerModel;
        
        updateItemView.updateDealerButton.addActionListener(this);
        updateDealerView.backButtonUpdateDealer.addActionListener(this);
        updateDealerView.updateDealerButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == updateItemView.updateDealerButton){
            updateItemView.dispose();
            updateDealerView.setVisible(true);
            updateDealerView.setLocationRelativeTo(null);
        }
        if(e.getSource() == updateDealerView.backButtonUpdateDealer){
            updateDealerView.dispose();
            updateItemView.setVisible(true);
            updateItemView.setLocationRelativeTo(null);
        }
        if(e.getSource() == updateDealerView.updateDealerButton){
            updateDealerModel.setNameDealer(updateDealerView.dealerNameField.getText());
            updateDealerModel.setLastNameDealer(updateDealerView.dealerLastNameField.getText());
            updateDealerModel.setCelDealer(updateDealerView.dealerCelField.getText());
            
            updateDealerModel.updateDealer(updateDealerView.idDealerField.getText());
            
            
               
        }
    }
}
