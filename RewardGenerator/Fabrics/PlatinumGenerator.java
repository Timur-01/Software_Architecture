package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Product.Platinum;

public class PlatinumGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
    
}
