package without_interface;

public class DeliveryDetailsPrinter {

    private SorterByAddress sorter = new SorterByAddress();

    public void print() {
        sorter.sortDetails();
        System.out.println("Печатаю детали доставки...");
    }
}
