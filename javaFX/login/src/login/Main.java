package login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Scene scene = new Scene(grid, 300, 275);

        Text scenetitle = new Text("Please log in:");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Label userName = new Label("User Name");
        TextField userTextField = new TextField();
        Label pw = new Label("password:");
        PasswordField pwBox = new PasswordField();


        grid.add(scenetitle, 0, 0, 2, 1);
        grid.add(userName, 0, 1);
        grid.add(userTextField,1, 1);
        grid.add(pw,0,2);
        grid.add(pwBox,1, 2);

        Button button = new Button("Sign in");
        HBox hbbtn = new HBox();
        hbbtn.setAlignment(Pos.BASELINE_RIGHT);
        hbbtn.getChildren().add(button);

        grid.add(hbbtn,1,4);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1,6);

        button.setOnAction(event -> {
            actionTarget.setFill(Color.FIREBRICK);
            actionTarget.setText("Sign in button pressed");
        });

        scene.getStylesheets().add(Main.class.getResource("Login.css").toExternalForm());
        primaryStage.setTitle("JavaFX login page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
