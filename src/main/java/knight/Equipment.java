package knight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created 27.02.2017
 * Class represents knight's equipment
 */
public class Equipment {
    private int itemsNumber = 0;
    private int totalPrice = 0;
    private String material = null;
    private List<KnightEquipment> availableItems = new ArrayList<KnightEquipment>();

    public Equipment() {

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    int getTotalPrice() {
        return totalPrice;
    }


    void clearAvailableToys() {
        this.availableItems.clear();
    }

    /**
     * see all fields with their values
     *
     * @return
     */
    @Override
    public String toString() {
        return "Equipment{" +
                "itemsNumber=" + this.itemsNumber +
                ", totalPrice=" + this.totalPrice +
                ", material='" + this.material + '\'' +
                ", availableItems=" + this.availableItems +
                '}';
    }

    //Show all items in array list
    public String showAvailableItems() {
        StringBuilder buf = new StringBuilder();
        for (KnightEquipment counter : this.availableItems) {
            buf.append(counter);
            buf.append('\n');
        }
        return buf.toString();
    }

    //Add item to array list
    public void pushItem(KnightEquipment object) {
        this.availableItems.add(object);
        ++this.itemsNumber;
    }

    //Calculates total price
    public void CalculateTotalPrice() {
        for (KnightEquipment counter : this.availableItems) {
            this.totalPrice += counter.getPrice();
        }

    }

    //Sorts items by weight
    public void SortEquipmentByWeight() {
        this.availableItems.sort(Comparator.comparing(KnightEquipment::getWeight));
    }

    public String SearchInRange(int price) {
        StringBuffer buf = new StringBuffer();
        for (KnightEquipment equipment : this.availableItems) {
            if (equipment.getPrice() < price) {
                buf.append(equipment.toString());
                buf.append('\n');
            }
        }
        return buf.toString();
    }
}
