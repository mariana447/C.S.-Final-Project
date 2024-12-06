import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application 
{

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        GUI GUI = new GUI();
        DataRepository DataRepository = new DataRepository();
        Brain brain = new Brain(DataRepository, GUI, primaryStage);
        
        brain.setupStaticButtonActions();
        brain.setupCB1(DataRepository.E1().getC1());
        brain.setupCB2(DataRepository.E1().getC2());
        brain.setupCB3(DataRepository.E1().getC3());
        brain.setupCB4(DataRepository.E1().getBC());
        brain.SetupStatBar();
        
        GUI.getScene1();
        GUI.getScene2();
        GUI.getScene3();
        
        primaryStage.setScene((GUI.getScene1()));
        primaryStage.setTitle("GameTitle");
        primaryStage.show();
        
    }
}// end of App class