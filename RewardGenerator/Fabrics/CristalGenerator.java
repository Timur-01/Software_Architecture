package RewardGenerator.Fabrics;

import RewardGenerator.Iterfaces.IGameItem;
import RewardGenerator.Product.Cristal;

public class CristalGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Cristal();
    }
    
}
