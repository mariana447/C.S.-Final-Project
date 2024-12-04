import java.util.List;
import java.util.ArrayList;

public class EndingTally //This is the class where the ending is calculated.
{
    private List<EndPoints> PointRepository;
    private int E1;
    private int E2;
    private int E3;
    // D = Description
    private String E1D;
    private String E2D;
    private String E3D;

    public EndingTally(List<EndPoints> PointRepository)
    {
    this.PointRepository = PointRepository;
    }

    public void addPoint(EndPoints Endpoint){PointRepository.add(Endpoint);}
    public List<EndPoints> getList() {return this.PointRepository;}
    
    //Here is the start of the Inner Class Ending
    
    public class Ending 
    {
       private String title;
       private String description;
   
       public Ending(String title, String description) 
       {
               this.title = title;
               this.description = description;
       }
   
       public String getTitle() {return title;}
       public String getDescription() {return description;}
       public void setTitle(String title){this.title = title;}
       public void setDescription(String description) {this.description = description;}
   
       @Override
       public String toString() {return "Title: " + title + "\nDescription: " + description;}
    
    }//End of Inner Class Ending
    
    Ending Ending1 = new Ending("Title of Ending1", "Ending1 Description");
    Ending Ending2 = new Ending("Title of Ending2", "Ending2 Description");
    Ending Ending3 = new Ending("Title of Ending3", "Ending3 Description");
    Ending Ending = new Ending("","");


    public Ending calcEnding()// Method to calculate the ending tally based on EndPoint data
    {
        this.E1 = 0;
        this.E2 = 0;
        this.E3 = 0;
            
        for (EndPoints EndPoint : PointRepository) 
        {
            if (EndPoint.isEnd1()) {this.E1 += 1;}
            if (EndPoint.isEnd2()) {this.E2 += 1;}     
            if (EndPoint.isEnd3()) {this.E3 += 1;}
        }

       if (E1 > E2 && E1 > E3) 
       {
           Ending.title = Ending1.getTitle();
           Ending.description = Ending1.getDescription();
       }
       if (E2 > E1 && E2 > E3) 
       {
           Ending.title = Ending2.getTitle();
           Ending.description = Ending2.getDescription();
       }
       if (E3 > E2 && E3 > E1) 
       {
           Ending.title = Ending3.getTitle();
           Ending.description = Ending3.getDescription();
       }
       return Ending;      
    }
    public void DisplayEnding(){System.out.print(Ending);}
}//End of Ending Tally Class
