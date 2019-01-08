/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avt.swimfast.controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author marcos.verdini
 */
public class ViewMainController implements Initializable {
    
    @FXML private HBox pnlMain;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        Logger logger = Logger.getLogger("com.avt.Swimfast");
        
        try
        {       
            VBox training1 = FXMLLoader.load(getClass().getResource("/com/avt/swimfast/view/ViewTraining.fxml"));  
            //VBox training2 = FXMLLoader.load(getClass().getResource("/com/avt/swimfast/view/ViewTraining.fxml"));
            
            logger.info("result = " +  (pnlMain.getChildren().add(training1) ? "1" : "0") );
            //pnlMain.getChildren().add(training2);
            
        }
        catch(Exception e)
        {
            logger.warning("Erro");
            logger.warning(e.getMessage());
        }
        
        
        
        
        
    }    
    
}
