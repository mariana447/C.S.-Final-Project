public class NPC
{
      private String Name;
      private int Damage, HP, MaxHP;
      
      public NPC(String Name, int Damage, int HP, int MaxHP) 
      {
          this.Name = Name;
          this.Damage = Damage;
          this.HP = HP;
          this.MaxHP = MaxHP;
      }
      public String getName(){ return Name;}
      public int getDamage(){return Damage;}
      public int getHP(){return (HP);}
      public void setHP(int HP){this.HP = Math.min(HP, MaxHP);}
      public int getMaxHP(){return (MaxHP);}
      
      public void takeDamage(int Damage)
      {
            this.HP -= Damage;
      }
      
      
}//Here is the end of the NPC class