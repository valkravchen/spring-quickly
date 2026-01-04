package with_interface;

public class SorterBySender implements Sorter{
    @Override
    public void sortDetails() {
        System.out.println("Сортирую по имени отправителя");
    }
}
