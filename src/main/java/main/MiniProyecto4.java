/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.io.*;
import controller.clientsController.*;
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
        ReadDealerModel readDealerModel = new ReadDealerModel();
        showClientsView showClientsView = new showClientsView();
        showDealersView showDealerView = new showDealersView();
        showClientsRemoved showClientsRemoved = new showClientsRemoved();
        CreateProductsModel createProductsModel = new CreateProductsModel();
        
        updateClientView updateClientView = new updateClientView();
        updateDealerView updateDealerView = new updateDealerView();
        updateProductView updateProductView = new updateProductView();
        deleteClientView deleteClientView = new deleteClientView();
        deleteDealerView deleteDealerView = new deleteDealerView();
        deleteProductView deleteProductView = new deleteProductView();
        CreateClientModel createClientModel = new CreateClientModel();
        ReadClientModel readClientModel = new ReadClientModel();
        CreateDealerModel createDealerModel = new CreateDealerModel();
        UpdateClientModel updateClientModel = new UpdateClientModel();
        updateInfoClientView updateInfoClientView = new updateInfoClientView();
        DeleteClientModel deleteClientModel = new DeleteClientModel();
        
        
        
        
        PrincipalController principalController = new PrincipalController(principalView,addItemView, searchItemView, updateItemView, deleteItemView){};
        principalController.startPrincipalView();
        

        UpdateClientController updateClientController = new UpdateClientController(updateItemView, updateClientView, updateClientModel, updateInfoClientView);
        
        UpdateDealersController updateDealersController = new UpdateDealersController(updateItemView, updateDealerView);
        
        UpdateProductsController updateProductsController = new UpdateProductsController(updateItemView, updateProductView);
        
        DeleteClientController deleteClientController = new DeleteClientController(deleteItemView, deleteClientView, deleteClientModel, showClientsRemoved, principalView );
        
        DeleteDealersController deleteDealersController = new DeleteDealersController(deleteItemView, deleteDealerView);
        
        DeleteProductsController deleteProductsController = new DeleteProductsController(deleteItemView, deleteProductView);

        CreateClientController createClientController = new CreateClientController(addItemView, createClientView, createClientModel){};
    
        CreateDealersController createDealersController = new CreateDealersController(addItemView,createDealerView, createDealerModel){};
    
        CreateProductsController createProductsController = new CreateProductsController(addItemView,addProductView, createProductsModel){};
    
        ReadClientController readClientController = new ReadClientController(searchItemView, readClientView, readClientModel, showClientsView, principalView){};
    
        ReadDealersController readDealerController = new ReadDealersController(searchItemView, readDealerView, showDealerView, readDealerModel, principalView){};
    
        ReadProductsController readProductController = new ReadProductsController(searchItemView, readProductView);
    
  
    }
        
}
