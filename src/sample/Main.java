package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    private HBox hBox;
    private Button btn1, btn2, btn3;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        CrearUI();

        primaryStage.setTitle("Proyecto de clase TAP 2021");
        primaryStage.setScene(new Scene(hBox, 300, 70));
        primaryStage.show();
    }

    private void CrearUI(){
        btn1 = new Button("Boton 1");
        btn2 = new Button("Boton 2");
        btn3 = new Button("Boton 3");

        hBox = new HBox();
        hBox.getChildren().addAll(btn1,btn2,btn3);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets( 20, 20, 20,  20));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
