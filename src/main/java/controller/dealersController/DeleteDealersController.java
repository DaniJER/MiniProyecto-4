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
import model.DealersModel. *;
/**
 *
 * @author El Rey
 */
public class DeleteDealersController implements ActionListener{
    private deleteItemView deleteItemView;
    private deleteDealerView deleteDealerView;
    private DeleteDealerModel deleteDealerModel;
    
    public DeleteDealersController(deleteItemView deleteItemView, deleteDealerView deleteDealerView, DeleteDealerModel deleteDealerModel){
        this.deleteItemView = deleteItemView;
        this.deleteDealerView = deleteDealerView;
        this.deleteDealerModel = deleteDealerModel;
        
        deleteItemView.deleteDealerButton.addActionListener(this);
        deleteDealerView.deleteClientButton.addActionListener(this);
        //deleteDealerView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteItemView.deleteDealerButton){
            deleteItemView.dispose();
            deleteDealerView.setVisible(true);
            deleteDealerView.setLocationRelativeTo(null);
        }
        if(e.getSource() == deleteDealerView.deleteClientButton){
            deleteDealerModel.deleteDealer(deleteDealerView.idClientField.getText());
        }
        /*if (e.getSource() == deleteDealerView.backButton){
            deleteDealerView.dispose();
            deleteItemView.setVisible(true);
            deleteItemView.setLocationRelativeTo(null);
        }*/
    }
}    
