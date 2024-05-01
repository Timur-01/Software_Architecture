package Editor3D.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;



     public PoligonalModel(List<Texture> Textures) {
         this.Textures = Textures;
         this.Poligons = new ArrayList<>();
         this.Poligons.add(new Poligon());
    }
    }
