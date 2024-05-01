package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Product.Gold;

public class GoldGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
       return new Gold();
    }
    
}
