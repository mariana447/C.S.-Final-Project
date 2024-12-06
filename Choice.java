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
       public String getText(){return Text;}
       public Runnable getEffect(){return Effect;}
      
}//End of Choice class