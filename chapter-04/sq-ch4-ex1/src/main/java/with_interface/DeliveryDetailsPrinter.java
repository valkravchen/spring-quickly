package with_interface;

public class DeliveryDetailsPrinter {

    private Sorter sorter;

    public DeliveryDetailsPrinter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void print() {
        sorter.sortDetails();
        System.out.println("Печатаю детали доставки...");
    }
}
