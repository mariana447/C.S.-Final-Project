import java.util.*;
public class Encounter
{
      private String Descriptor;
      private Choice C1;
      private Choice C2;
      private Choice C3;
      private Choice BC;
      private String Area;
      
      public Encounter(String Descriptor, Choice C1, Choice C2, Choice C3, Choice BC, String Area)
      {
            this.Descriptor = Descriptor;
            this.C1 = C1;
            this.C2 = C2;
            this.C3 = C3;
            this.BC = BC;
            this.Area = Area;
      }
      
      public String getDescriptor(){ return (this.Descriptor); }
      public Choice getC1(){ return (this.C1);}
      public Choice getC2(){ return (this.C2);}
      public Choice getC3(){ return (this.C3);}
      public Choice getBC(){ return (this.BC);}
      public String Area(){ return (this.Area);}

}

