/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week7_lab;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author amoonmainali
 */
public class buttonCount extends Application {

    private int count;
    private Text countText;
    
    @Override
    public void start(Stage stage) throws Exception {
        count = 0;
        countText = new Text("Pushes: 0");

        Button push = new Button("Push Me!");
        push.setOnAction(this::processButtonPress);
        FlowPane pane = new FlowPane(push, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: gray");

        Scene scene = new Scene(pane, 300, 100);


    }

    private void processButtonPress(ActionEvent t) {
        count++;
        countText.setText("Pushes: " + count);
    }
 }

    
  
