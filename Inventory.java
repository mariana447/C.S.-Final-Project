import java.util.List;

public class Inventory 
{
    private List<Item> items;

    public Inventory(List<Item> items) 
    {  
        this.items = items;
    }
    public void addItem(Item item){items.add(item);}
    public List<Item> getList(){return (this.items);}
    
    @Override
     public String toString() 
     {
       StringBuilder sb = new StringBuilder("Inventory: ");  
       for (Item item : items) 
       {
           if((item.getType()) != ("Token")) //This if statement is the Inventory Display filter.
           {
           sb.append(item.toString()).append("\n");
           }
       }
       return sb.toString().trim();
     }

}//End of Inventory class
