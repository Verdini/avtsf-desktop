/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avt.swimfast.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author marcos.verdini
 */
public class ViewTrainingController implements Initializable {

    @FXML private Label lblTitle;
    @FXML private MediaView mediaView;
    @FXML private Button btnPlay;
    @FXML private Button btnStop;
    @FXML private Button btnMinus;
    @FXML private Button btnPlus;
    @FXML private Button btnForward;
    @FXML private Button btnReverse;
    @FXML private Slider sldTimer;
    @FXML private AreaChart chartSensor;
    
    private MediaPlayer mediaPlayer;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        sldTimer.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                    Number oldValue, Number newValue) {

                System.out.println("Slider Value Changed (newValue: " + newValue.intValue() + ")\n");
            }
        });
        
        //File file=new File("teste2.mp4");
        //Media media = new Media(file.toURI().toString());
        //mediaPlayer = new MediaPlayer(media);
        //mediaPlayer.setAutoPlay(true);
    }    
    
    @FXML protected void btnPlay_Clicked(ActionEvent event) {
        System.out.println("Play");
    }
    
    @FXML protected void btnStop_Clicked(ActionEvent event) {
        System.out.println("Stop");
    }
    
    @FXML protected void btnPlus_Clicked(ActionEvent event) {
        System.out.println("Plus");
    }
    
    @FXML protected void btnMinus_Clicked(ActionEvent event) {
        System.out.println("Minus");
    }
    @FXML protected void btnForward_Clicked(ActionEvent event) {
        System.out.println("Forward");
    }
    
    @FXML protected void btnReverse_Clicked(ActionEvent event) {
        System.out.println("Reverse");
    }
    
}
