package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Product.Silver;

public class SilverGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Silver();
    }
    
}
