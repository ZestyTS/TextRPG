package textrpg.items;

public class SlimeExtract extends Item
{
    public SlimeExtract()
    {
        super.setItemType(3);
        super.setGoldWorth(3);
        super.setName("Slime Extract");
    }
    
    @Override
    public int[] use()
    {
        super.itemError();
        int[] i = {-1};
        return i;
    }
}
