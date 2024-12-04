import java.util.List;
public class Choice
{
      private String Text;
      private Runnable Effect;
      
      public Choice(String Text, Runnable Effect)
      {
            this.Text = Text;
            this.Effect = Effect;
      }
      public void activateEffect() 
      {
        if (Effect != null) {Effect.run();}
      }
      public String getText(){return Text;}
      
}//End of Choice class