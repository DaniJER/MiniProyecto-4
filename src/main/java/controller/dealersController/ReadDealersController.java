/*
    UNIVERSIDAD DEL VALLE
    FUNDAMENTOS DE PROGRAMACIÓN ORIENTADA A EVENTOS
    AUTORES: DANIEL JOSÉ ENRIQUEZ - COD: 2240920 Y JUAN SEBASTIAN VIEDMAN - COD: 2242562    

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.dealersController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.DealersModel.ReadDealerModel;
import view.dealers.readDealerView;
import view.dealers.showDealersView;
import view.principalView;
import view.searchItemView;

/**
 *
 * @author El Rey
 */
public class ReadDealersController implements ActionListener {

    private searchItemView searchItemView;
    private readDealerView readDealerView;
    private showDealersView showDealersView;
    private ReadDealerModel readDealerModel;
    private principalView principalView;

    public ReadDealersController(searchItemView searchItemView, readDealerView readDealerView, showDealersView showDealersView, ReadDealerModel readDealerModel, principalView principalView) {
        
        this.searchItemView = searchItemView;
        this.readDealerView = readDealerView;
        this.showDealersView = showDealersView;
        this.readDealerModel = readDealerModel;
        this.principalView = principalView;
        
        searchItemView.selectDealerItem.addActionListener(this);
        readDealerView.searchDealerButton.addActionListener(this);
        showDealersView.principalMenuDealersButton.addActionListener(this);
        showDealersView.dealersBackButton.addActionListener(this);
        readDealerView.BackButtonDealers.addActionListener(this);
        readDealerView.menuPrincipalDealersButton.addActionListener(this);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        searchItemView.dispose();
        readDealerView.setVisible(true);
        readDealerView.setSize(950, 600);
        readDealerView.setLocationRelativeTo(null);
        
         if(e.getSource() == readDealerView.searchDealerButton){
            
            String id = readDealerView.idDealer.getText();
            
            if(id.isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Por favor ingrese una cedula");   
                
            }else{
                
                readDealerModel.setDealerId(readDealerView.idDealer.getText());
                if(readDealerModel.readDealer(readDealerView.idDealer.getText()) == false){
                    
                    readDealerView.setVisible(true);
                }else{
           
                    readDealerView.dispose();
                    showDealersView.setVisible(true); 
                    showDealersView.setLocationRelativeTo(null);

                    showDealersView.nameDealer.setText("Nombre: " + readDealerModel.getDealerName());
                    showDealersView.lastNameDealer.setText("Apellido: " +readDealerModel.getDealerLastName());
                    showDealersView.idDealer.setText("Identificacion: " +readDealerModel.getDealerId());
                    showDealersView.productDealer.setText("Producto: " +readDealerModel.getDealerProductName());

                    showDealersView.celDealer.setText("Celular: " +readDealerModel.getDealerCel());
                }
            }
        }   if(e.getSource() == showDealersView.dealersBackButton){
            
                showDealersView.dispose();
                readDealerView.setVisible(true);
            }
            if(e.getSource() == showDealersView.principalMenuDealersButton){
            
                showDealersView.dispose();
                readDealerView.dispose();
                principalView.setVisible(true);
            }
            if(e.getSource() == readDealerView.BackButtonDealers){
            
                readDealerView.dispose();
                searchItemView.setVisible(true);
            }
            if(e.getSource() == readDealerView.menuPrincipalDealersButton){
            
                readDealerView.dispose();
                showDealersView.dispose();
                principalView.setVisible(true);
            }
    }
    
}
