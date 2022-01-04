public class TV extends HouseDecorator{

    public TV(House house) {
        super(house);
    }

    public float getFurnitureValue(){
        return 100.0f;
    }

    public String getStructureName() {
        return "32 TV";
    }
}
