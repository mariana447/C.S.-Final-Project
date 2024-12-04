public class EndPoints
{
      private int Value;
      private String EndNum;
      
      public EndPoints(String EndNum)
      {
            this.EndNum = EndNum;
      }
      //Here are the getter methods
      public String getEndNum(){return this.EndNum;}
      //Here are the method to distinguish the ending type
      public boolean isEnd1(){return EndNum.equals("End1");}
      public boolean isEnd2(){return EndNum.equals("End2");}
      public boolean isEnd3(){return EndNum.equals("End3");}
}//End of EndPoints Class