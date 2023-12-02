/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.principalController.PrincipalController;
import view.*;
import view.clients. *;
import controller.clientsController. *;
/**
 *
 * @author El Rey
 */
public class MiniProyecto4 {

    public static void main(String[] args) {
        principalView principalView = new principalView();
        addItemView addItemView = new addItemView();
        searchItemView searchItemView = new searchItemView();
        updateItemView updateItemView = new updateItemView();
        deleteItemView deleteItemView = new deleteItemView();
        
        updateClientView updateClientView = new updateClientView();
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView, updateItemView, deleteItemView){};
        principalController.startPrincipalView();
        
        UpdateClientController updateClientController = new UpdateClientController(updateItemView, updateClientView);
    }
        
}
