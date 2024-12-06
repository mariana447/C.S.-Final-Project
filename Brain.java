import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class Brain //This class controls the flow of the game.
{
    private DataRepository dataRepository;
    private GUI gui;
    private Runnable B1E;
    private Runnable B2E;
    private Runnable B3E;
    private Runnable B4E;  
    private Stage primaryStage;  
    private Stage InventoryStage;  

    public Brain(DataRepository dataRepository, GUI gui, Stage primaryStage) 
    {
        this.dataRepository = dataRepository;
        this.gui = gui;
        this.primaryStage = primaryStage;
    }
    public void SetupStatBar()
    {
          gui.GetSC2LBL1().setText("Area: " + dataRepository.E1().Area());
          gui.GetSC2LBL2().setText("HP: " + dataRepository.getCharacter().getHP() + "/" + dataRepository.getCharacter().getMaxHP());
          gui.GetSC2LBL3().setText("Equipped Armament: " + dataRepository.getCharacter().getEquippedArm());
    }

         
    }
    public void setupStaticButtonActions() 
    {               
        // Start Button 
        (gui.GetSC1B()).setOnAction(event -> {
        this.primaryStage.setScene(gui.getScene2());
        }); 
        
        // Inventory Button 
        (gui.GetSC2IB()).setOnAction(event -> {
             InventoryStage = new Stage();
             
             Item pony = new Item("Pony Toy","armament","5",5);
             dataRepository.getInventory().addItem(pony);
             
             for (Item item : dataRepository.getInventory().getList()) {
                 (gui.GetSCIL2()).getChildren().add(gui.CreateItemHBox(item, (dataRepository.getCharacter())));
             }
             InventoryStage.setTitle("Inventory");
             InventoryStage.setScene(gui.getInventoryScene());
             InventoryStage.setWidth(400);
             InventoryStage.setHeight(500);
             InventoryStage.setResizable(false);
             InventoryStage.show();
        });   
    }  
    //Choice Button Setup
    public void setupCB1(Choice choice)
    {
        (gui.GetSC2CB1()).setText(choice.getText());
        (gui.GetSC2CB1()).setOnAction(e -> choice.getEffect().run());
    }
    public void setupCB2(Choice choice)
    {
        (gui.GetSC2CB2()).setText(choice.getText());
        (gui.GetSC2CB2()).setOnAction(e -> choice.getEffect().run());  
    }
    public void setupCB3(Choice choice)
    {
        (gui.GetSC2CB3()).setText(choice.getText());
        (gui.GetSC2CB3()).setOnAction(e -> choice.getEffect().run());    
    }
    public void setupCB4(Choice choice)
    {
        (gui.GetSC2CB4()).setText(choice.getText());
        (gui.GetSC2CB4()).setOnAction(e -> choice.getEffect().run());
    }
}//End of Brain class
