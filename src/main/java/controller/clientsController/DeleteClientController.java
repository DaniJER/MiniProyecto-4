/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.clients. *;
import view. *;

/**
 *
 * @author El Rey
 */
public class DeleteClientController implements ActionListener {
    private deleteItemView deleteItemView;
    private deleteClientView deleteClientView;
    
    public DeleteClientController(deleteItemView deleteItemView, deleteClientView deleteClientView){
        this.deleteItemView = deleteItemView;
        this.deleteClientView = deleteClientView;
        
        deleteItemView.deleteClientButton.addActionListener(this);
        deleteClientView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteClientView.backButton){
            deleteClientView.dispose();
            deleteItemView.setVisible(true);
            deleteItemView.setLocationRelativeTo(null);
        }
    }
}
