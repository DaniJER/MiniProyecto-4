/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.principalController.PrincipalController;
import view.*;


/**
 *
 * @author El Rey
 */
public class MiniProyecto4 {

    public static void main(String[] args) {
        
        PrincipalView principalView = new PrincipalView();
        AddItemView addItemView = new AddItemView();
        SearchItemView searchItemView = new SearchItemView();
        UpdateItemView updateView = new UpdateItemView();
        DeleteItemView deleteView = new DeleteItemView();
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView, updateView, deleteView){};
        principalController.startPrincipalView();
        
        
    }
        
}
