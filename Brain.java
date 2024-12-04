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
            gui.GetSC2CB1();
            gui.GetSC2CB2();
            gui.GetSC2CB3();
            gui.GetSC2CB4();
            gui.GetSC2IB();
            gui.GetSC1B();
    }                  
}//End of Brain Class