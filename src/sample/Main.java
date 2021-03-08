package sample;

import javax.swing.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {
    private HBox obj_hBox,vBox;
    private Button btn1, btn2, btn3;
    private Button anch_btn1, anch_btn2;
    private BorderPane obj_borderpane;
    private GridPane obj_gridpane;
    private AnchorPane obj_anchorpane;
    static Scanner cin=new Scanner(System.in);

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        UI_FlowPane();
        UI_BorderPane();
        UI_GridPane();
        UI_AnchorPane();
        primaryStage.setTitle("Proyecto de clase TAP 2021");

        Integer input=Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion:\n\t1: Hbox." +
                "\n\t2: BorderPane.\n\t3: Gridpane\n\t4: Anchorpane"));
        switch (input){
            case 1:
                primaryStage.setScene(new Scene(obj_hBox, 300, 70));
                break;
            case 2:
                primaryStage.setScene(new Scene(obj_borderpane, 300, 70));
                break;
            case 3:
                primaryStage.setScene(new Scene(obj_gridpane, 300, 70));
                break;
            case 4:
                primaryStage.setScene(new Scene(obj_anchorpane, 300, 70));
                break;
            default:
                break;

        }
        primaryStage.show();
    }

    public void UI_FlowPane(){
        btn1 = new Button("Boton 1");
        btn2 = new Button("Boton 2");
        btn3 = new Button("Boton 3");

        obj_hBox = new HBox();
        obj_hBox.getChildren().addAll(btn1, btn2, btn3);
        obj_hBox.setSpacing(10);
        obj_hBox.setPadding(new Insets( 20, 20, 20,  20));

        /*vBox = new HBox();
        vBox.getChildren().addAll(btn1, btn2, btn3);
        vBox.setPadding(new Insets( 20, 20, 20,  20));

         */
    }

    private void UI_BorderPane(){
        obj_borderpane = new BorderPane();
        obj_borderpane.setPrefSize(500,400);
        obj_borderpane.setTop(new TextField("Texto Superior"));
        obj_borderpane.setBottom(new TextField("Esta es una etiqueda utilizando TextField"));
        obj_borderpane.setLeft(new TextField("Esta es una etiqueda a la Izquierda"));
        obj_borderpane.setRight(new TextField("Esta es una etiqueda a la Derecha"));
        obj_borderpane.setCenter(new TextField("Esta es una etiqueda en el centro"));
    }

    private void UI_GridPane(){
        obj_gridpane = new GridPane();
        obj_gridpane.add(new Button("Posicion 0, 0"), 0, 0);
        obj_gridpane.add(new Button("Posicion 1, 0"), 1, 0 );
        obj_gridpane.add(new Button("Posicion 0, 1"), 0, 1); obj_gridpane.add(new Button("Posicion 1, 1"), 1, 1);
        obj_gridpane.add(new Button("Posicion 0, 2"), 0, 2); obj_gridpane.add(new Button("Posicion 1, 2"), 1, 2);
    }

    private void UI_AnchorPane(){
        obj_anchorpane = new AnchorPane();
        anch_btn1 = new Button("Boton 1");
        anch_btn2 = new Button("Boton 2");

        AnchorPane.setTopAnchor(anch_btn1,15.0);
        AnchorPane.setRightAnchor(anch_btn1,15.0);
        AnchorPane.setBottomAnchor(anch_btn2,30.0);
        AnchorPane.setLeftAnchor(anch_btn2,100.0);

        obj_anchorpane.getChildren().addAll(anch_btn1,anch_btn2,new Button("Boton 3"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
