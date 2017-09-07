package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // add a leaf node Circle
        Circle cir = new Circle(200, 200, 100);
        // Add a leaf node Rectangle
        Rectangle rec = new Rectangle(200, 200, 140, 40);

        // Add colour to the circle
        cir.setFill(Color.RED);
        // Add color to the rectangle
        rec.setFill(Color.WHITE);

        StackPane root = new StackPane();

        // Attach the circle to root so it can be displayed
        root.getChildren().add(cir);
        root.getChildren().add(rec);

        primaryStage.setTitle("Scene Graph Example.");
        primaryStage.setScene(new Scene(root, 400, 375));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
