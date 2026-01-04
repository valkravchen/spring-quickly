package with_interface;

public class Main {
    static void main() {
        Sorter sorterByAddress = new SorterByAddress();
        DeliveryDetailsPrinter printer1 = new DeliveryDetailsPrinter(sorterByAddress);
        printer1.print();
        System.out.println("---");
        Sorter sorterBySender = new SorterBySender();
        DeliveryDetailsPrinter printer2 = new DeliveryDetailsPrinter(sorterBySender);
        printer2.print();
    }
}
