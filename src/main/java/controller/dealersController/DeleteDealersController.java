/*
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
public class DeleteDealersController implements ActionListener{
    private deleteItemView deleteItemView;
    private deleteDealerView deleteDealerView;
    
    public DeleteDealersController(deleteItemView deleteItemView, deleteDealerView deleteDealerView){
        this.deleteItemView = deleteItemView;
        this.deleteDealerView = deleteDealerView;
        
        deleteItemView.deleteDealerButton.addActionListener(this);
        //deleteDealerView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteItemView.deleteDealerButton){
            deleteItemView.dispose();
            deleteDealerView.setVisible(true);
            deleteDealerView.setLocationRelativeTo(null);
        }
        /*if (e.getSource() == deleteDealerView.backButton){
            deleteDealerView.dispose();
            deleteItemView.setVisible(true);
            deleteItemView.setLocationRelativeTo(null);
        }*/
    }
}    
