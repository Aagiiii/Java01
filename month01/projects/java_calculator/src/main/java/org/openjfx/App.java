package org.openjfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    private TextField num1Field;
    private TextField num2Field;
    private Label resultLabel;

    @Override
    public void start(Stage stage) {

        // var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java "
        // + javaVersion + ".");
        Text t = new Text();

        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: #336699;");
        // GridPane gbox = addGrid();
        // HBox newHbox = addHBox();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        t.setText("This is a calculator");
        num1Field = new TextField();
        num1Field.setPromptText("Enter firsr num:");
        GridPane.setConstraints(num1Field, 0, 0);

        num2Field = new TextField();
        num2Field.setPromptText("Enter second num:");
        GridPane.setConstraints(num2Field, 0, 1);
        resultLabel = new Label("Result: ");
        resultLabel.setStyle("-color: ");
        GridPane.setConstraints(resultLabel, 0, 2);

        Button buttonDiv = new Button("/");
        buttonDiv.setPrefSize(50, 20);
        buttonDiv.setOnAction(e -> performOperator('/'));
        GridPane.setConstraints(buttonDiv, 2, 1);
        // btnMod.setPrefSize(50,20);
        Button buttonPlus = new Button("+");
        buttonPlus.setPrefSize(50, 20);
        buttonPlus.setOnAction(e -> performOperator('+'));
        GridPane.setConstraints(buttonPlus, 1, 0);

        Button buttonMinus = new Button("-");
        buttonMinus.setPrefSize(50, 20);
        buttonMinus.setOnAction(e -> performOperator('-'));
        GridPane.setConstraints(buttonMinus, 2, 0);
        Button buttonMul = new Button("X");
        buttonMul.setPrefSize(50, 20);
        buttonMul.setOnAction(e -> performOperator('*'));
        GridPane.setConstraints(buttonMul, 1, 1);

        // gbox.getChildren().addAll(buttonDiv, buttonPlus, buttonMinus, buttonMul);
        grid.getChildren().addAll(num1Field, num2Field, resultLabel, buttonPlus, buttonMinus, buttonMul, buttonDiv);
        var scene = new Scene(new StackPane(grid), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    // private GridPane addGrid() {
    // // HBox hbox = new HBox();
    // GridPane gbox = new GridPane();
    // gbox.setPadding(new Insets(15, 12, 15, 12));
    // // gbox.setSpacing(10);
    // gbox.setStyle("-fx-background-color: #336699;");

    // // Button btnAc = new Button("AC");
    // // btnAc.setPrefSize(50,20);
    // // Button btnC = new Button("C");
    // // btnC.setPrefSize(50,20);
    // // Button btnMod = new Button("%");
    // Button buttonDiv = new Button("/");
    // buttonDiv.setPrefSize(50, 20);
    // buttonDiv.setOnAction(e->performOperator('/'));
    // GridPane.setConstraints(buttonDiv, 2, 1);
    // // btnMod.setPrefSize(50,20);
    // Button buttonPlus = new Button("+");
    // buttonPlus.setPrefSize(50, 20);
    // buttonPlus.setOnAction(e -> performOperator('+'));
    // GridPane.setConstraints(buttonPlus, 1, 0);

    // Button buttonMinus = new Button("-");
    // buttonMinus.setPrefSize(50, 20);
    // buttonMinus.setOnAction(e -> performOperator('-'));
    // GridPane.setConstraints(buttonMinus, 2, 0);
    // Button buttonMul = new Button("X");
    // buttonMul.setPrefSize(50, 20);
    // buttonMul.setOnAction(e->performOperator('*'));
    // GridPane.setConstraints(buttonMul, 1, 1);

    // gbox.getChildren().addAll(buttonDiv, buttonPlus, buttonMinus, buttonMul);

    // return gbox;
    // }

    public void performOperator(char operator) {
        String num1Text = num1Field.getText();
        String num2Text = num2Field.getText();

        if (isValidNumber(num1Text) && isValidNumber(num2Text)) {
            double num1 = Double.parseDouble(num1Text);
            double num2 = Double.parseDouble(num2Text);
            double result = 0.0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultLabel.setText("Result: Error 0");
                        return;
                    }

                    break;

                default:
                    break;
            }
            resultLabel.setText("result :" + result);
        } else {
            resultLabel.setText("result: Invalid number");
        }

    }

    private boolean isValidNumber(String text) {
        // TODO Auto-generated method stub
        return text.matches("-?\\d*\\.?\\d+");
    }

    public static void main(String[] args) {
        launch();
    }

}