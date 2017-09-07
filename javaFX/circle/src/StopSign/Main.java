package StopSign;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane root = new StackPane();

        // Add a leaf node
        Circle cir = new Circle(200, 200, 100);
        Rectangle rec = new Rectangle(200, 200, 150, 40);

        cir.setFill(Color.RED);
        rec.setFill(Color.WHITE);


        root.getChildren().add(cir);
        root.getChildren().add(rec);


        primaryStage.setTitle("Scene Graph Example");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
