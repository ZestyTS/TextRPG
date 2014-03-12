package textrpg.items;

public class Item 
{
    private int itemType; //the type of item it is
    //1 = consumable item(pots, elixers, food, and such that modifies stats or states)
    //2 = key items/quest items/materials
    //should work on this.....
    
    private int goldWorth;
    
    public int getItemType(){return itemType;}
    public void setItemType(int t){itemType = t;}
    
    public int getGoldWorth(){return goldWorth;}
    public void setGoldWorth(int g){goldWorth = g;}
}