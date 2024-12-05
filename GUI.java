import javafx.application.Application;
import java.util.*;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class GUI //This class creates all of the GUI for the game.
{
    // Data Fields organized by Scene Order
    // Scene 1 Data Fields (SC1) L=Layout | LBL=Label | B=Button
    private Scene SC1;
    private VBox SC1L;
    private Label SC1LBL1, SC1LBL2;
    private Button SC1B;

    // Scene 2 Data Fields (SC2) L=Layout | IB=Inventory Button | CB=Choice Button | LBL=Label | I=Image | S=Stage
    private Scene SC2;
    private BorderPane SC2L1;
    private StackPane SC2L2;
    private HBox SC2L3, SC2L7;
    private VBox SC2L4, SC2L8;
    private ScrollPane SC2L6;
    private Button SC2CB1, SC2CB2, SC2CB3, SC2CB4, SC2IB;
    private Label SC2LBL1, SC2LBL2, SC2LBL3, SC2LBL4;
    private ImageView SC2I2;

    // Scene 3 Data Fields (SC3) L=Layout | LBL=Label
    private Scene SC3;
    private VBox SC3L1;
    private ScrollPane SC3L2;
    private Label SC3LBL1, SC3LBL2;

    // Objects for Customization
    private Font Lucida;
    private Font TitleLucida;
    private Font Lucida2;
    private ImageView Backpack;
    private ImageView Background;
    
    public GUI() 
    {
        Lucida = Font.font("Lucida Console", 14);
        Lucida2 = Font.font("Lucida Console", 18);
        TitleLucida = Font.font("Lucida Console", 50);

        Backpack = new ImageView("file:images/Backpack.png");
        Backpack.setFitWidth(175); 
        Backpack.setFitHeight(192);

        Background = new ImageView("file:images/Office.png");
        Background.setFitWidth(800);
        Background.setFitHeight(350);

        setupScene1();
        setupScene2();
        setupScene3();
    }

    private void setupScene1() 
    {
        SC1L = new VBox();
        SC1L.setSpacing(50);
        SC1L.setAlignment(Pos.CENTER);
        SC1L.setPadding(new Insets(20));

        SC1LBL1 = new Label("Title of Game");
        SC1LBL1.setFont(TitleLucida);
        SC1LBL2 = new Label("The choices you make will affect the outcome of the game.\n                      Choose wisely.");
        SC1LBL2.setAlignment(Pos.CENTER);
        SC1LBL2.setFont(Lucida2);
        SC1B = new Button("Start");
        SC1B.setFont(Lucida2);
        SC1B.setMinSize(50,20);

        SC1L.getChildren().addAll(SC1LBL1, SC1LBL2, SC1B);
        SC1 = new Scene(SC1L, 900, 700);
    }

    private void setupScene2() 
    {
        // Top BorderPane
        SC2L3 = new HBox();
        SC2L3.setPadding(new Insets(30));
        //SC2L3.setAlignment();
        SC2L3.setSpacing(200);
        SC2LBL1 = new Label("  Area:");
        SC2LBL1.setFont(Lucida2);
        SC2LBL2 = new Label("HP: ");
        SC2LBL2.setFont(Lucida2);
        SC2LBL3 = new Label("Arm: ");
        SC2LBL3.setFont(Lucida2);
        SC2L3.getChildren().addAll(SC2LBL1, SC2LBL2, SC2LBL3);

        // Center BorderPane
        SC2L2 = new StackPane();
        SC2L2.setAlignment(Pos.CENTER);
        SC2I2 = Background;
        SC2L6 = new ScrollPane();
        SC2L6.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        SC2L6.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        SC2L6.setMaxSize(400, 300); 
        SC2LBL4 = new Label("Descriptor");
        SC2LBL4.setAlignment(Pos.CENTER);
        SC2L6.setContent(SC2LBL4);
        SC2L2.getChildren().addAll(SC2I2, SC2L6); 
        SC2L2.setAlignment(SC2I2, Pos.CENTER);
        SC2L2.setAlignment(SC2L6, Pos.CENTER);

        // Bottom BorderPane
        SC2L7 = new HBox(20);         
        SC2L7.setAlignment(Pos.CENTER);
        SC2L7.setPadding(new Insets(20));

        SC2L4 = new VBox(10);
        SC2CB1 = new Button("C1");
        SC2CB1.setMinSize(600, 52);
        SC2CB1.setFont(Lucida);
        SC2CB2 = new Button("C2");
        SC2CB2.setMinSize(600, 52);
        SC2CB2.setFont(Lucida);        
        SC2CB3 = new Button("C3");
        SC2CB3.setMinSize(600, 52);
        SC2CB3.setFont(Lucida);
        SC2CB4 = new Button("BC");
        SC2CB4.setMinSize(600, 52);
        SC2CB4.setFont(Lucida);
        SC2L4.getChildren().addAll(SC2CB1, SC2CB2, SC2CB3, SC2CB4);       
        SC2L8 = new VBox();
        SC2L8.setSpacing(10);
        SC2IB = new Button("Inventory");
        SC2IB.setFont(Lucida);
        SC2IB.setMinSize(180, 40);
        SC2I2 = Backpack;
        SC2L8.getChildren().addAll(SC2IB, SC2I2);
        

        SC2L7.getChildren().addAll(SC2L4, SC2L8);

        // Creating and Assembling the BorderPane
        SC2L1 = new BorderPane();
        SC2L1.setTop(SC2L3);
        SC2L1.setCenter(SC2L2);
        SC2L1.setBottom(SC2L7);
        SC2 = new Scene(SC2L1, 900, 720);
    }

    private void setupScene3() 
    {
        SC3L1 = new VBox();
        SC3L1.setAlignment(Pos.CENTER);
        SC3L1.setPadding(new Insets(30));
        SC3L1.setSpacing(30);
        SC3LBL1 = new Label("Ending Title");
        SC3LBL1.setFont(TitleLucida);
        SC3L2 = new ScrollPane();
        SC3L2.setMinSize(500,500);
        SC3L2.setMaxSize(700,500); 
        SC3L2.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        SC3L2.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        SC3L2.setFitToWidth(true); 
        SC3LBL2 = new Label("PlaceHolder");       
        SC3LBL2.setFont(Lucida2);
        SC3LBL2.setPadding(new Insets(20));
        SC3LBL2.setWrapText(true);
        SC3L2.setContent(SC3LBL2);

        SC3L1.getChildren().addAll(SC3LBL1, SC3L2);
        SC3 = new Scene(SC3L1, 900, 700);
    }
    public Button GetSC2CB1(){return SC2CB1;}
    public Button GetSC2CB2(){return SC2CB2;}
    public Button GetSC2CB3(){return SC2CB3;}
    public Button GetSC2CB4(){return SC2CB4;}
    public Button GetSC2IB(){return SC1B;}
    public Button GetSC1B(){return SC2IB;}

    public Scene getScene1() {return SC1;}
    public Scene getScene2() {return SC2;}
    public Scene getScene3() {return SC3;}
    }

