package knight;

/**
 * Created by mykola on 21.02.17.
 */
public class KnightEquipment {
    private String purpose;
    private int price;
    private int weight;


    KnightEquipment(int price, int weight, String purpose) {
        this.price = price;
        this.purpose = purpose;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "KnightEquipment{" +
                "purpose='" + purpose + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    public int getPrice() {
        return price;
    }



    public int getWeight() {
        return weight;

    }



    public String getPurpose() {
        return purpose;
    }

}



