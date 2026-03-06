package com.example;
// import javafx.appl;
import javafx.application.Application; // Line 3: Ensure imports follow
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
/**
 * Hello world!
 *
 */
public class App extends Application
{
    // This is the method Maven is looking for!
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, World - JavaFX!");
        Button button = new Button ("Click");

        VBox layout = new VBox(10,label ,button);
        Scene scene = new Scene(layout, 200, 400);
        stage.setTitle("Small Window");
        stage.setScene(scene);
        stage.show();
    }

    public static void main( String[] args )
    {
        launch(args);
        // System.out.println( "Hello World!" );
    }
}
