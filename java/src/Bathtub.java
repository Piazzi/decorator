public class Bathtub extends HouseDecorator {


    public Bathtub(House house) {
        super(house);
    }

    public float getFurnitureValue(){
        return 150.0f;
    }

    public String getStructureName() {
        return "Fancy bathtub";
    }
}
