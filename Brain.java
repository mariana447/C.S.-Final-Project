import javafx.scene.control.*;

public class Brain //This class controls the flow of the game.
{
      private DataRepository dataRepository;
      private GUI gui;
      
      public Brain(DataRepository dataRepository, GUI gui)
      {
            this.dataRepository = dataRepository;
            this.gui = gui;
            
      }
      public void setupButtonActions() 
      {
            //Button Getters
            Button SC2CB1 = gui.GetSC2CB1(); //This retrieves the first choice button
            Button SC2CB2 = gui.GetSC2CB2(); //This retrieves the second choice button
            Button SC2CB3 = gui.GetSC2CB3(); //This retrieves the third choice button
            Button SC2CB4 = gui.GetSC2CB4(); //This retrieves the bonus choice choice button
            Button SC2CIB = gui.GetSC2IB(); //This retrieves the Inventory Button 
            Button SC1B = gui.GetSC1B(); //This retrieves the Start Button
            
            //Placeholder Variables for EventHandler
            
            Runnable 
      }                  
}//End of Brain Class