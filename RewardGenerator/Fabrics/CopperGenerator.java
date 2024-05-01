package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Product.Copper;

public class CopperGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Copper();
    }
    
}
