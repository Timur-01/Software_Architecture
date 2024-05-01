package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Product.Gem;

public class GemGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Gem();
    }
    
}
