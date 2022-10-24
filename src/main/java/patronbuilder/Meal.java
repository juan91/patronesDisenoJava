package patronbuilder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Itemm> itemms = new ArrayList<Itemm>();

    public void addItem(Itemm itemm){
        itemms.add(itemm);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Itemm itemm : itemms) {
            cost += itemm.price();
        }
        return cost;
    }

    public void showItems(){
        for (Itemm itemm : itemms) {
            System.out.print("Item : "+ itemm.name());
            System.out.print(", Packing : "+ itemm.packing().pack());
            System.out.println(", Price : "+ itemm.price());
        }
    }
}
