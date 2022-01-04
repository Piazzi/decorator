import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseTest {

    @Test
    void shouldReturnHouseValue(){
        House house = new SmallHouse(1000);
        assertEquals(1000.0f, house.getValue());
    }

    @Test
    void shouldReturnHouseWithTVValue(){
        House house = new TV(new SmallHouse(1000.0f));
        assertEquals(1100.0f, house.getValue());
    }

    @Test
    void shouldReturnHouseWithBathtubValue(){
        House house = new Bathtub(new SmallHouse(1000.0f));
        assertEquals(1150.0f, house.getValue());
    }

    @Test
    void shouldReturnHouseWithBathtubAndTVValue(){
        House house = new Bathtub(new TV(new SmallHouse(1000.0f)));
        assertEquals(1250.0f, house.getValue());
    }
}