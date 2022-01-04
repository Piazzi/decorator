public class SmallHouse implements House{

    public float value;

    public SmallHouse(){}

    public SmallHouse(float value){
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public String getStructureName() {
        return "Small house with nothing inside";
    }
}
