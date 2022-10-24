package patronfabricaabstracto;

public class ShapeFactoryy extends AbstractFactory {
    @Override
    public Shapee getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectanglee();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Squaree();
        }
        return null;
    }
}