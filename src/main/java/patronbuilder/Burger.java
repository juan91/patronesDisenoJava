package patronbuilder;

public abstract class Burger implements Itemm {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}