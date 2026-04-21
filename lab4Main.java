public class lab4Main {
    public static void main(String[] args) {
        SportEquipment[] items = {
                new SportEquipment("М'яч футбольний", "Nike", 1200.0, 0.4),
                new SportEquipment("Гантеля сталева", "York", 800.0, 5.0),
                new SportEquipment("Атлетична лава", "Interat", 2500.0, 15.0)
        };


        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].getPrice() > items[j+1].getPrice()) {
                    SportEquipment temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }

        System.out.println("Відсортований інвентар (назва через модель Text):");
        for (SportEquipment item : items) {
            System.out.println(item);
        }
    }
}
