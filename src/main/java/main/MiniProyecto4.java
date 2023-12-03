/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.principalController.PrincipalController;
import view.*;
import view.clients. *;
import view.dealers. *;
import view.products. *;
import controller.clientsController. *;
import controller.dealersController. *;
import controller.productsController. *;
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
        
        updateDealerView updateDealerView = new updateDealerView();
        
        updateProduct updateProductView = new updateProduct();
        
        deleteClientView deleteClientView = new deleteClientView();
        
        deleteDealerView deleteDealerView = new deleteDealerView();
        
        deleteProductView deleteProductView = new deleteProductView();
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView, updateItemView, deleteItemView){};
        principalController.startPrincipalView();
        
        UpdateClientController updateClientController = new UpdateClientController(updateItemView, updateClientView);
        
        UpdateDealersController updateDealersController = new UpdateDealersController(updateItemView, updateDealerView);
        
        UpdateProductsController updateProductsController = new UpdateProductsController(updateItemView, updateProductView);
        
        DeleteClientController deleteClientController = new DeleteClientController(deleteItemView, deleteClientView);
        
        DeleteDealersController deleteDealersController = new DeleteDealersController(deleteItemView, deleteDealerView);
        
        DeleteProductsController deleteProductsController = new DeleteProductsController(deleteItemView, deleteProductView);
    }
        
}
