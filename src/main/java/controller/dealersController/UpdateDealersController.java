/*
    UNIVERSIDAD DEL VALLE
    AUTORES:
    DANIEL JOSÉ ENRIQUEZ, COD: 2240920 - JUAN SEBASTIAN VIEDMAN, COD: 2242562

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dealersController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
import view.dealers. *;
/**
 *
 * @author El Rey
 */
public class UpdateDealersController implements ActionListener{
    private updateItemView updateItemView;
    private updateDealerView updateDealerView;
    
    public UpdateDealersController(updateItemView updateItemView, updateDealerView updateDealerView){
        this.updateItemView = updateItemView;
        this.updateDealerView = updateDealerView;
        
        updateItemView.updateDealerButton.addActionListener(this);
        //updateDealerView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == updateItemView.updateDealerButton){
            updateItemView.dispose();
            updateDealerView.setVisible(true);
            updateDealerView.setLocationRelativeTo(null);
        }
        /*if(e.getSource() == updateDealerView.backButton){
            updateDealerView.dispose();
            updateItemView.setVisible(true);
            updateItemView.setLocationRelativeTo(null);
        }*/
    }
}
