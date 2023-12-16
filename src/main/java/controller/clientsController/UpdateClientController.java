/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562

*/
package controller.clientsController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view. *;
import view.clients. *;
import model.clientesModel. *;

public class UpdateClientController implements ActionListener{
    private updateItemView updateItemView;
    private updateClientView updateClientView;
    private UpdateClientModel updateClientModel;
    
    public UpdateClientController(updateItemView updateItemView, updateClientView updateClientView, UpdateClientModel updateClientModel){
        this.updateItemView = updateItemView;
        this.updateClientView = updateClientView;
        this.updateClientModel = updateClientModel;
        
        updateItemView.updateClientButton.addActionListener(this);
        updateClientView.updateClientButton1.addActionListener(this);
        updateClientView.backButtonUpdateClient.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == updateItemView.updateClientButton){
            
            updateItemView.dispose();
            updateClientView.setVisible(true);
            updateClientView.setSize(updateItemView.getWidth(), updateItemView.getHeight());
            updateClientView.setLocationRelativeTo(null);
            
        }
        if(e.getSource() == updateClientView.backButtonUpdateClient){
            
            updateClientView.dispose();
            updateItemView.setVisible(true);
            updateItemView.setLocationRelativeTo(null);
        }
        if(e.getSource() == updateClientView.updateClientButton1){
           updateClientModel.setNameUpdate(updateClientView.clientNameField.getText());
           updateClientModel.setLastNameUpdate(updateClientView.lastNameClientField.getText());
           updateClientModel.setCelUpdate(updateClientView.celClientField.getText());
           updateClientModel.updateClient(updateClientView.idClientField.getText());
        }
    }
}


