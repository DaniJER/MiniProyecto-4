/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dealersController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.addItemView;
import view.dealers.createDealerView;

/**
 *
 * @author El Rey
 */
public class CreateDealersController implements ActionListener {
    
    private addItemView addItemView;
    private createDealerView createDealer;

    public CreateDealersController(addItemView addItemView, createDealerView createDealerView) {
        
        this.addItemView = addItemView;
        this.createDealer = createDealerView;
        
        addItemView.addDealerButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        addItemView.dispose();
        createDealer.setVisible(true);
        createDealer.setLocationRelativeTo(null);
    }
    
}
