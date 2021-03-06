//Alumno: Andres Herrera Oettinghaus
//Numero de control: 19030566

package sample;
import javax.swing.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    private HBox obj_hBox;
    private VBox obj_vBox, vBox_menu;
    private Button btn1, btn2, btn3;
    private Button anch_btn1, anch_btn2;
    private BorderPane obj_borderpane;
    private GridPane obj_gridpane;
    private AnchorPane obj_anchorpane;

    private MenuBar mnbPrincipal;
    private Menu menCompetencial, menCompetencial2, menCerrar;
    private MenuItem mitCalcu, mitSalir;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Proyecto de clase TAP 2021");
        UI_FlowPane();
        UI_BorderPane();
        UI_GridPane();
        UI_AnchorPane();
        CrearMenu();

        Integer input=Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion:\n\t1: Hbox." +
                "\n\t2: BorderPane.\n\t3: Gridpane\n\t4: Anchorpane\n\t5. Menus Vbox"));
        switch (input){
            case 1:
                primaryStage.setScene(new Scene(obj_hBox, 1800, 600));
                break;
            case 2:
                primaryStage.setScene(new Scene(obj_borderpane, 600, 700));
                break;
            case 3:
                primaryStage.setScene(new Scene(obj_gridpane, 600, 700));
                break;
            case 4:
                primaryStage.setScene(new Scene(obj_anchorpane, 600, 700));
                break;
            case 5:
                primaryStage.setScene(new Scene(vBox_menu, 1800, 600));
                break;
            default:
                break;
        }
        primaryStage.show();
    }
    private void CrearMenu(){
        vBox_menu =new VBox();
        mnbPrincipal = new MenuBar();
        menCompetencial = new Menu("Competencia 1");
        menCompetencial2 = new Menu("Competencia 2");
        menCerrar = new Menu("Cerrar 1");

        mitCalcu = new MenuItem("Calculadora");
        menCompetencial.getItems().add(mitCalcu);

        mitSalir = new MenuItem("Salir");
        mitSalir.setOnAction(actionEvent -> {System.exit(0);});
        menCerrar.getItems().add(mitSalir);

        mnbPrincipal.getMenus().addAll(menCompetencial,menCompetencial2,menCerrar);
        vBox_menu.getChildren().add(mnbPrincipal);

    }
    public void UI_FlowPane(){
        btn1 = new Button("Boton 1");
        btn1.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        btn1.setPrefSize(1000,400);
        btn2 = new Button("Boton 2");
        btn2.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
        btn2.setPrefSize(1200,400);
        btn3 = new Button("Boton 3");
        btn3.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        btn3.setPrefSize(1600,400);

        obj_hBox = new HBox();
        obj_hBox.getChildren().addAll(btn1, btn2, btn3);
        obj_hBox.setSpacing(10);
        obj_hBox.setPadding(new Insets( 20, 20, 20,  20));

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
