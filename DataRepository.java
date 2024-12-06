import java.util.*;
public class DataRepository //This is the class that contains all hardcoded values.
{
      //In the Data field for DataRepository All of the needed Encounters, Choices, Items, NPC, Character, 
            
            //Inventory Data Fields
            private List<Item> IL;
            private Inventory Inventory;
            
            //Character Data Fields
            private Character character;
            private int HP;
            private int MaxHP;
            private Item EquippedArm;
            
            //
            private Choice C1;
            private Choice C2;
            private Choice C3;
            private Choice BC;
            private Item item;
            private Encounter encounter;
            
            public DataRepository()
            {
                  getInventory();
                  getCharacter();
                  E1();
            }
            public Inventory getInventory()//Establishes the Inventory for the game
            { 
                  IL = new ArrayList<>();
                  Inventory = new Inventory(IL); 
                  return Inventory;
            }
            public Character getCharacter()//Establishes the Character for the game
            {
                  EquippedArm = new Item("Unarmed","armament","0",0);
                  character = new Character(20, 20, EquippedArm, 0);
                  return character;
            }
            public Encounter E1()
            {
                             
                item = new Item("Pencil","Armament","2",2);
                C1 = new Choice("Attack", () -> System.out.print("You pull out your pencil to stab the beast."));
                C2 = new Choice("Retreat", () -> System.out.print("You run away sucessfully."));
                C3 = new Choice("Hide", ()->{System.out.print("You jump behind a log."); Inventory.addItem(item);});
                BC = new Choice("Bonus Choice", ()-> System.out.print("Here is your bonus choice."));
               
                Encounter encounter = new Encounter("You see a sillouhet that is pitch black.", C1, C2, C3, BC, "Office");
                
                return encounter;              
             }
             //public getE1(){return encounter;}
             

      
      

}//End of DataRepository class