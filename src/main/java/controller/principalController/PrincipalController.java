/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.principalController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.*;


/**
 *
 * @author El Rey
 */
public class PrincipalController implements ActionListener {
    private principalView principalView;
    private addItemView addItemView;
    private searchItemView searchItemView;
    private updateItemView updateItemView;
    private deleteItemView deleteItemView;

    public PrincipalController(principalView principalView, addItemView addItemView, searchItemView searchItemView, updateItemView updateItemView, deleteItemView deleteItemView) {        
        this.principalView = principalView;
        this.addItemView = addItemView;
        this.searchItemView = searchItemView;
        this.updateItemView = updateItemView;
        this.deleteItemView = deleteItemView;
        
        principalView.addItemButton.addActionListener(this);
        principalView.searchItemButton.addActionListener(this);
        principalView.updateItemProduct.addActionListener(this);
        principalView.deleteItemProduct.addActionListener(this);

        //addItemView.backButton.addActionListener(this);
        
    }
    
    public void startPrincipalView(){
        
        principalView.setTitle("Modulo de mercado Univalle");
        principalView.setLocationRelativeTo(null);
        principalView.setVisible(true);
        addItemView.setTitle("Agregar Item");
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == principalView.addItemButton){
            
            principalView.dispose();
        
            addItemView.setVisible(true);
            addItemView.setLocationRelativeTo(null);
        }
        
        if(e.getSource() == principalView.searchItemButton){
            
            principalView.dispose();
            
            searchItemView.setVisible(true);
            searchItemView.setLocationRelativeTo(null);
        
        }
        if(e.getSource() == principalView.updateItemProduct){
            
            principalView.dispose();
            
            updateItemView.setVisible(true);
            updateItemView.setLocationRelativeTo(null);
        
        }
        if(e.getSource() == principalView.deleteItemProduct){
            
            principalView.dispose();
            
            deleteItemView.setVisible(true);
            deleteItemView.setLocationRelativeTo(null);
        
        }
        /*if(e.getSource() == addItemView.backButton){
            
            addItemView.dispose();
            principalView.setVisible(true);
            
        
        }*/
             
    }
}
