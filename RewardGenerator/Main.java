package RewardGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import RewardGenerator.Fabrics.CopperGenerator;
import RewardGenerator.Fabrics.CristalGenerator;
import RewardGenerator.Fabrics.GemGenerator;
import RewardGenerator.Fabrics.GoldGenerator;
import RewardGenerator.Fabrics.ItemGenerator;
import RewardGenerator.Fabrics.PlatinumGenerator;
import RewardGenerator.Fabrics.SilverGenerator;

public class Main {
   
    public static void main(String[] args) {
        GoldGenerator f1 = new GoldGenerator();
        GemGenerator f2 = new GemGenerator();
        SilverGenerator f3 = new SilverGenerator();
        CopperGenerator f4 = new CopperGenerator();
        CristalGenerator f5 = new CristalGenerator();
        PlatinumGenerator f6 = new PlatinumGenerator();


        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemGeneratorList.add(f3);
            itemGeneratorList.add(f5);
            itemGeneratorList.add(f4);
            itemGeneratorList.add(f6);
        }
        for (int i = 0; i < 3; i++) {
            itemGeneratorList.add(f1);
        }
        itemGeneratorList.add(f2);

        Random rnd = ThreadLocalRandom.current();
        for (int index = 0; index < 200; index++) {
            itemGeneratorList.get(rnd.nextInt(itemGeneratorList.size())).openReward();

        }


}}
