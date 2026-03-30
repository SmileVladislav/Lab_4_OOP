public class lab4Main {
    public static void main(String[] args) {
        SportEquipment[] inventory = {
                new SportEquipment("М'яч", "Adidas", 1200.0, 0.4, 15),
                new SportEquipment("Гантеля", "York", 800.0, 5.0, 10),
                new SportEquipment("Ракетка", "Wilson", 2500.0, 0.3, 5),
                new SportEquipment("Гантеля", "Interat", 800.0, 2.0, 20),
                new SportEquipment("М'яч", "Nike", 1100.0, 0.45, 12)
        };


        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - i - 1; j++) {
                boolean needSwap = false;
                if (inventory[j].getPrice() > inventory[j+1].getPrice()) {
                    needSwap = true;
                } else if (inventory[j].getPrice() == inventory[j+1].getPrice()) {

                    if (inventory[j].getName().toString().compareTo(inventory[j+1].getName().toString()) > 0) {
                        needSwap = true;
                    }
                }

                if (needSwap) {
                    SportEquipment temp = inventory[j];
                    inventory[j] = inventory[j+1];
                    inventory[j+1] = temp;
                }
            }
        }

        System.out.println("Відсортований інвентар:");
        for (SportEquipment item : inventory) {
            System.out.println(item);
        }


        SportEquipment target = new SportEquipment("Гантеля", "York", 800.0, 5.0, 10);
        System.out.println("\nШукаємо ідентичний об'єкт: " + target);

        boolean found = false;
        for (SportEquipment item : inventory) {
            if (item.equals(target)) {
                System.out.println("Успіх! Знайдено ідентичний об'єкт.");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Об'єкт не знайдено.");
    }
}
