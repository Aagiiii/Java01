package com.example;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;

public class Ex03 extends Application {

    private int counter =0;

      @Override
    public void start(Stage stage) throws Exception{
       Label numberLabel = new Label("0");
       numberLabel.setStyle("-fx-font-size: 24px");
        Button plusButton =new Button("Add (+)");
        Button minusButton =new Button("Minus (-)");
        plusButton.setOnAction(e ->{
            counter++;
            numberLabel.setText(String.valueOf(counter));
        });

        minusButton.setOnAction(e ->{
            counter--;
            numberLabel.setText(String.valueOf(counter));
        });
         

       HBox buttons = new HBox(10,plusButton, minusButton);

        VBox layout = new VBox(20, numberLabel, buttons);
        stage.setScene(new Scene(layout,250,250));
        stage.setTitle("Exercise 03");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
