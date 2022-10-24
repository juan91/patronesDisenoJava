package patronbuilder;

public abstract class ColdDrink implements Itemm {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}