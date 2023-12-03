/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.clientsController.CreateClientController;
import controller.clientsController.DeleteClientController;
import controller.clientsController.ReadClientController;
import controller.clientsController.UpdateClientController;
import controller.dealersController.CreateDealersController;
import controller.dealersController.DeleteDealersController;
import controller.dealersController.ReadDealersController;
import controller.dealersController.UpdateDealersController;
import controller.principalController.PrincipalController;
import controller.productsController.CreateProductsController;
import controller.productsController.DeleteProductsController;
import controller.productsController.ReadProductsController;
import controller.productsController.UpdateProductsController;
import model.DealersModel.*;
import model.clientesModel.*;
import model.productsModel.*;
import view.*;
import view.clients.createClientView;
import view.clients.readClientView;
import view.dealers.createDealerView;
import view.dealers.readDealerView;
import view.products.addProductView;
import view.products.readProductView;
import controller.clientsController. *;
import controller.dealersController. *;
import controller.productsController. *;

import view.clients.*;
import view.dealers.*;
import view.products.*;



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

        createClientView createClientView = new createClientView();
        createDealerView createDealerView = new createDealerView();
        addProductView addProductView = new addProductView();
        readClientView readClientView = new readClientView();
        readDealerView readDealerView = new readDealerView();
        readProductView readProductView = new readProductView();
        
        
        
        updateClientView updateClientView = new updateClientView();
        updateDealerView updateDealerView = new updateDealerView();
        updateProductView updateProductView = new updateProductView();
        deleteClientView deleteClientView = new deleteClientView();
        deleteDealerView deleteDealerView = new deleteDealerView();
        deleteProductView deleteProductView = new deleteProductView();
        CreateClientModel createClientModel = new CreateClientModel();
        
        
        
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView, updateItemView, deleteItemView){};
        principalController.startPrincipalView();
        

        UpdateClientController updateClientController = new UpdateClientController(updateItemView, updateClientView);
        
        UpdateDealersController updateDealersController = new UpdateDealersController(updateItemView, updateDealerView);
        
        UpdateProductsController updateProductsController = new UpdateProductsController(updateItemView, updateProductView);
        
        DeleteClientController deleteClientController = new DeleteClientController(deleteItemView, deleteClientView);
        
        DeleteDealersController deleteDealersController = new DeleteDealersController(deleteItemView, deleteDealerView);
        
        DeleteProductsController deleteProductsController = new DeleteProductsController(deleteItemView, deleteProductView);

        CreateClientController createClientController = new CreateClientController(addItemView, createClientView, createClientModel){};
    
        CreateDealersController createDealersController = new CreateDealersController(addItemView,createDealerView){};
    
        CreateProductsController createProductsController = new CreateProductsController(addItemView,addProductView){};
    
        ReadClientController readClientController = new ReadClientController(searchItemView, readClientView){};
    
        ReadDealersController readDealerController = new ReadDealersController(searchItemView,readDealerView ){};
    
        ReadProductsController readProductController = new ReadProductsController(searchItemView, readProductView);
    
  
    }
        
}
