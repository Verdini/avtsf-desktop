/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avt.swimfast;

import com.avt.swimfast.controller.ViewMainController;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author marcos.verdini
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        // Inicializa o Logger
        Logger logger = Logger.getLogger("com.avt.Swimfast");
        try {
            FileHandler handler = new FileHandler("Events.log", 1024*1024, 1, true);
            logger.addHandler(handler);
            handler.setFormatter(new SimpleFormatter());
        } catch (Exception e) {
            logger.warning("Failed to initialize logger handler.");
        }
        logger.info("");
        logger.info("Initializing system.");
               
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/avt/swimfast/view/ViewMain.fxml"));
        loader.load();
     
        stage.getIcons().add(new Image("/com/avt/swimfast/asset/swimIcon_64x64.png"));
        stage.setTitle("AVT Swimfast - Sistema de análise de natação.");
        Scene scene = new Scene(loader.getRoot());
        
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
