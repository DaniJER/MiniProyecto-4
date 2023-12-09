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
    private updateInfoClientView updateInfoClientView;
    
    public UpdateClientController(updateItemView updateItemView, updateClientView updateClientView, UpdateClientModel updateClientModel, updateInfoClientView updateInfoClientView){
        this.updateItemView = updateItemView;
        this.updateClientView = updateClientView;
        this.updateClientModel = updateClientModel;
        this.updateInfoClientView = updateInfoClientView;
        
        updateItemView.updateClientButton.addActionListener(this);
        updateClientView.updateClientButton1.addActionListener(this);
        //updateClientView.backButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == updateItemView.updateClientButton){
            updateItemView.dispose();
            updateClientView.setVisible(true);
            updateClientView.setLocationRelativeTo(null);
        }
        if(e.getSource() == updateClientView.updateClientButton1){
            
           updateInfoClientView.setVisible(true);
           updateClientModel.updateClient(updateClientView.idClientField.getText());
           
        }
        if(e.getSource() == updateInfoClientView.updateClientButton){
            
            updateClientModel.setNameUpdate(updateInfoClientView.clientNameField.getText());
            updateClientModel.setLastNameUpdate(updateInfoClientView.lastNameClientField.getText());
            updateClientModel.setCelUpdate(updateInfoClientView.celClientField.getText());
            
        }
    }
}


