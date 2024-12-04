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
        Brain brain = new Brain(DataRepository, GUI);
        
        GUI.getScene1();
        GUI.getScene2();
        GUI.getScene3();
        
        primaryStage.setTitle("GameTitle");
        primaryStage.setScene((GUI.getScene1()));
        primaryStage.show();
    }
}// end of App class