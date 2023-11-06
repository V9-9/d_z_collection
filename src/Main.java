import java.util.ArrayList;
import java.util.LinkedList;

/* Д/з Напишите метод, который добавляет 500000 элементов в ArrayList и LinkedList
и измерьте время, которое потрачено на это. Сравните результаты.  */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++){
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        long arrayListTime = endTime - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++){
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        long linkedListTime = endTime - startTime;

        if (arrayListTime > linkedListTime){
            System.out.println("\nМеньшее количество времени потрачено на добавление элементов в LinkedList");
        } else if (arrayListTime < linkedListTime){
            System.out.println("\nМеньшее количество времени потрачено на добавление элементов в ArrayList");
        } else {
            System.out.println("\nОдинаковое количество времени ушло на добавление элементов в оба класса");
        }

        System.out.println("Время добавления элементов в ArrayList: " + arrayListTime);
        System.out.println("Время добавления элементов в LinkedList: " + linkedListTime);

    }
}