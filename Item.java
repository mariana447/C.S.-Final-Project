public class Item
{
      private String Name, Type, DLable;
      private int Damage;
      
      public Item(String Name, String Type, String DLable, int Damage)
      {
            this.Name = Name;
            this.Type = Type;
            this.DLable = DLable;
            this.Damage = Damage;
      }

      //Below are the getter methods
      public String getName(){return Name;}
      public String getType(){return Type;}
      public String getDLable(){return DLable;}
      public int getDamage(){return Damage;}
      //Below are the methods used to distinguish the type of item.
      public boolean isArmament(){return Type.equals("armament");}
      public boolean isToken(){return Type.equals("token");}
      public boolean isQuestItem(){return Type.equals("Quest Item");}
      
     @Override
      public String toString()
      {
            return Name;
      }
      
}//End of Item class