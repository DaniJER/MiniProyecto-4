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

    private PrincipalView principalView;
    private AddItemView addItemView;
    private SearchItemView searchItemView;
    private UpdateItemView updateView;
    private DeleteItemView deleteView;

    public PrincipalController(PrincipalView principalView, AddItemView addItemView, SearchItemView searchItemView, UpdateItemView updateView, DeleteItemView deleteView) {
        
        this.principalView = principalView;
        this.addItemView = addItemView;
        this.searchItemView = searchItemView;
        this.updateView = updateView;
        this.deleteView = deleteView;
        
        principalView.addItemButton.addActionListener(this);
        principalView.searchItemButton.addActionListener(this);
        principalView.updateItemProduct.addActionListener(this);
        principalView.deleteItemProduct.addActionListener(this);
        
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
            
            updateView.setVisible(true);
            updateView.setLocationRelativeTo(null);
        }
        if(e.getSource() == principalView.deleteItemProduct){
            principalView.dispose();
            
            deleteView.setVisible(true);
            deleteView.setLocationRelativeTo(null);
        }
             
    }
}
