package com.example;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;

public class Ex01 extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Label text = new Label("Hello");
        Button button =new Button("Click me");

        button.setOnAction(e -> text.setText("Thank you"));

        VBox layout = new VBox(10,text,button);
        stage.setScene(new Scene(layout));
        stage.setTitle("Exercise 01");
        stage.show();
    }
  
    public static void main( String[] args )
    {
        launch(args);
        // System.out.println( "Hello World!" );
    }

}
