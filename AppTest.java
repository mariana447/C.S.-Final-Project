import java.util.ArrayList;
import java.util.List;
public class AppTest
{
      public static void main(String[] args)
      {
             List<Item> il = new ArrayList<>();
             List<Choice> cl = new ArrayList<>();             
             Inventory inventory = new Inventory(il);
             
             Item item = new Item("Pencil","Armament","2",2);
             Choice c1 = new Choice("Attack", () -> System.out.print("You pull out your pencil to stab the beast."));
             Choice c2 = new Choice("Retreat", () -> System.out.print("You run away sucessfully."));
             Choice c3 = new Choice("Hide", ()->{System.out.print("You jump behind a log."); il.add(item);});
             Choice Bc = new Choice("Bonus Choice", ()-> System.out.print("Here is your bonus choice."));
             
             cl.add(c1);
             cl.add(c2);
             cl.add(c3);
            
             Encounter encounter = new Encounter("You see a sillouhet that is pitch black.", cl, Bc);
             
             //encounter.displayEncounter();
             //c3.activateEffect();
             
             EndPoints Endpointa = new EndPoints("End1");
             EndPoints Endpointb = new EndPoints("End1");
             EndPoints Endpointc = new EndPoints("End1");
             EndPoints Endpointd = new EndPoints("End1");
             EndPoints Endpointe = new EndPoints("End2");
             EndPoints Endpointf = new EndPoints("End3");
             EndPoints Endpointg = new EndPoints("End2");
             EndPoints Endpointh = new EndPoints("End1");
             
             List<EndPoints> PointRepository = new ArrayList<EndPoints>();
                          
             EndingTally ET = new EndingTally(PointRepository);
             
             ET.addPoint(Endpointa);
             ET.addPoint(Endpointb);
             ET.addPoint(Endpointc);
             ET.addPoint(Endpointd);
             ET.addPoint(Endpointe);
             ET.addPoint(Endpointf);
             ET.addPoint(Endpointg);
             ET.addPoint(Endpointh);
             
             ET.calcEnding();
             ET.DisplayEnding();
             
             
             
      }
}
