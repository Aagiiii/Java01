package com.example;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class Ex02 extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        TextField input = new TextField();
       
        Button button =new Button("Print");
         Label output = new Label("Text will be here ...");

        button.setOnAction(e -> output.setText(input.getText()));

        VBox layout = new VBox(10,input,button,output);
        stage.setScene(new Scene(layout,250,250));
        stage.setTitle("Exercise 02");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
