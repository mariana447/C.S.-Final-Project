import java.util.List;
public class Character
{
      private int HP, MaxHP, Damage;
      private Item EquippedArm;
      
      Item fist = new Item("Fist", "Armament", "1", 1); //This is the default preset for the Characters damage stat.
      
      public Character(int HP, int MaxHP, Item EquippedArm, int Damage) 
      {
          this.HP = HP;
          this.MaxHP = MaxHP;
          this.EquippedArm = EquippedArm;
          this.Damage = Damage;
          setDamage();      
      }
      //Here are the methods that deal with the Character stats
      public int getHP(){return (HP);}
      public void setHP(int HP){this.HP = Math.min(HP, MaxHP);}
      public int getMaxHP(){return (MaxHP);}
      public Item getEquippedArm(){return (EquippedArm);}
      
      //This is the method that makes it so that the Equipped item of the player is equal to the damage of the character(Combat Purposes).
      public void setDamage(){this.Damage = (this.EquippedArm).getDamage();}
      public int getDamage(){return this.Damage;}
      
      //Here are the methods that deal with the equipment System.
      public void equip(Item item)
      {
            if(item.isArmament())
            {
                  this.EquippedArm = item;
                  //NOTE TO SELF: May potentially have to add other option here for if an item is not equipable. 
            }
      }
      public void unequipedItem()
      {
            this.EquippedArm = fist;
      }
      //Here is the method for Character Damage taken
      public void takeDamage(int damage)
      {
            this.HP -= damage;
            if(this.HP <0) this.HP = 0; //NOTE TO SELF: Here is the value of health when it hits below zero if I want a death feature then I'd have to look back here.
      }
      //Here is a method for gaining HP 
      //NOTE TO SELF: If I want to add in health consumables I'd also have to adjust the inventory and item classes.  
      public void gainHP(int hp)
      {
            this.HP += hp;
      }

} //end of Character class