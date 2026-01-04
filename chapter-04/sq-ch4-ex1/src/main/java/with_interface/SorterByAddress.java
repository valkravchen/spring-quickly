package with_interface;

public class SorterByAddress implements Sorter{
    @Override
    public void sortDetails() {
        System.out.println("Сортирую по адресу доставки");
    }
}
