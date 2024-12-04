import java.util.List;
public class Encounter
{
      private String Descriptor;
      private List<Choice> Choices;
      private Choice BonusChoice;
      private String Area;
      
      public Encounter(String Descriptor, List<Choice> Choices, Choice BonusChoice, String Area)
      {
            this.Descriptor = Descriptor;
            this.Choices = Choices;
            this.BonusChoice = BonusChoice;
      }
      public String getDescriptor(){ return (this.Descriptor); }
      public List<Choice> getChoices(){ return (this.Choices);}
      public Choice getBonusChoice(){ return (this.BonusChoice);}
      
      public void displayEncounter()
      {
            System.out.println(Descriptor);
            for(int i=0 ; i<Choices.size(); i++){System.out.println((i+1)+": "+ Choices.get(i).getText());
      }
}
}
