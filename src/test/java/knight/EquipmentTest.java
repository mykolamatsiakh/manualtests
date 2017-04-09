package knight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;



/**
 * Created by mykola on 21.03.17.
 */
public class EquipmentTest {

    private Equipment equipment = new Equipment();

    @Test
    public  void testShowAvailableItems() throws Exception  {

        String expectedOutput = "price: 12\n" +
                "weight: 45\n" +
                "purpose: protect\n" +
                "strength: 45\n" +
                "\n" +
                "price: 20\n" +
                "weight: 55\n" +
                "purpose: kill\n" +
                "length: 1\n" +
                "\n" +
                "price: 50\n" +
                "weight: 40\n" +
                "purpose: 40\n" +
                "radius: 1\n";
        assertEquals(expectedOutput, this.equipment.showAvailableItems());


    }
    @Test
    public void testSearchInRange() throws Exception {

        String expectedOutput = "price: 12\n" +
                "weight: 45\n" +
                "purpose: protect\n" +
                "strength: 45\n" +
                "\n" +
                "price: 20\n" +
                "weight: 55\n" +
                "purpose: kill\n" +
                "length: 1\n"+ "\n";
        assertEquals(expectedOutput, this.equipment.SearchInRange(30));
    }

    @Test
    public void testSortEquipmentByWeight() {

        this.equipment.SortEquipmentByWeight();

        String expectedOutput =  "price: 50\n" +
                "weight: 40\n" +
                "purpose: 40\n" +
                "radius: 1"+
                "\nprice: 12\n" +
                "weight: 45\n" +
                "purpose: protect\n" +
                "strength: 45\n" +
                "\n" +

                "price: 20\n" +
                "weight: 55\n" +
                "purpose: kill\n" +
                "length: 1\n"+"\n";
        assertEquals(expectedOutput, this.equipment.showAvailableItems());
    }

    @Test
    public   void testCalculateTotalPrice() {
        this.equipment.CalculateTotalPrice();
        assertEquals(82, this.equipment.getTotalPrice());

    }

    @BeforeEach
    private void wearing() {
        this.equipment.clearAvailableToys();
        Mail mail = new Mail(12, 45, "protect", 45);
        Sabre sabre = new Sabre(20, 55, "kill", 1);
        Helmet helmet = new Helmet(50, 40, "protect", 1);
        this.equipment.pushItem(mail);
        this.equipment.pushItem(sabre);
        this.equipment.pushItem(helmet);




    }

}
