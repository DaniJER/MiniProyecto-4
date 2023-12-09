/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.clientsController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.clients. *;
import view. *;
import model.clientesModel. *;
/**
 *
 * @author El Rey
 */
public class DeleteClientController implements ActionListener {
    private deleteItemView deleteItemView;
    private deleteClientView deleteClientView;
    private DeleteClientModel deleteClientModel;
    
    public DeleteClientController(deleteItemView deleteItemView, deleteClientView deleteClientView, DeleteClientModel deleteClientModel){
        this.deleteItemView = deleteItemView;
        this.deleteClientView = deleteClientView;
        this.deleteClientModel = deleteClientModel;
        
        deleteItemView.deleteClientButton.addActionListener(this);
        deleteClientView.deleteClientButton.addActionListener(this);
       // deleteClientView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == deleteItemView.deleteClientButton){
            deleteItemView.dispose();
            deleteClientView.setVisible(true);
            deleteClientView.setLocationRelativeTo(null);
        }
        if(e.getSource() == deleteClientView.deleteClientButton){
            String id = deleteClientView.idClientField.getText();
            Boolean verification = deleteClientModel.isCedulaUnique(id);
            if(verification){
                
            }
        }
        /*if(e.getSource() == deleteClientView.backButton){
            deleteClientView.dispose();
            deleteItemView.setVisible(true);
            deleteItemView.setLocationRelativeTo(null);
        }*/
    }
}
