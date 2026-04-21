public class SportEquipment {
    private Text name;
    private String brand;
    private double price;
    private double weight;


    public SportEquipment(String nameStr, String brand, double price, double weight) {
        this.name = new Text(nameStr);
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("Назва: %-15s | Ціна: %8.2f", name.toString(), price);
    }
}