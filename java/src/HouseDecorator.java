public abstract class HouseDecorator implements House {

    private House house;
    public String structure;

    public HouseDecorator(House house) {
        this.house = house;
    }

    public float getValue(){
        return this.house.getValue() + this.getFurnitureValue();
    }

    public abstract float getFurnitureValue();

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
}
