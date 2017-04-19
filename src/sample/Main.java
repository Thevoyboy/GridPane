package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
Button LoginButton;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Noobs its javafx");

        GridPane grid=new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(15);
        grid.setHgap(16);

        //Name label
        Label nameLabel=new Label("Username");
        GridPane.setConstraints(nameLabel,0,0);

        //Name input
        TextField nameInput=new TextField("harsha");
        GridPane.setConstraints(nameInput,1,0);

        //password label
        Label passwordLabel=new Label("Password");
        GridPane.setConstraints(passwordLabel,0,1);

        //Name input
        TextField passwordInput=new TextField();
        passwordInput.setPromptText("password");
        GridPane.setConstraints(passwordInput,1,1);

        Button loginButton=new Button("login");
        GridPane.setConstraints(loginButton,1,2);

        grid.getChildren().addAll(nameLabel,nameInput,passwordLabel,passwordInput,loginButton);


        Scene scene=new Scene(grid,300,300);
        window.setScene(scene);
        window.show();
    }

}
