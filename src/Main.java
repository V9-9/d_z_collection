import java.util.*;

/* Д/з Расширим предыдущую задачу. Замерить время добавления, поиска и удаления
объектов из коллекции в LinkedList, ArrayList, TreeSet, HashSet. Сравнить время
и сделать вывод о том, в каких условиях какая коллекция работает быстрее.  */
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();

        System.out.println("Время добавления элементов в ArrayList: " + addElements(arrayList));
        System.out.println("Время добавления элементов в LinkedList: " + addElements(linkedList));
        System.out.println("Время добавления элементов в TreeSet: " + addElements(treeSet));
        System.out.println("Время добавления элементов в HashSet: " + addElements(hashSet));

        System.out.println("Время поиска элементов в ArrayList: " + searchElements(arrayList));
        System.out.println("Время поиска элементов в LinkedList: " + searchElements(linkedList));
        System.out.println("Время поиска элементов в TreeSet: " + searchElements(treeSet));
        System.out.println("Время поиска элементов в HashSet: " + searchElements(hashSet));

        System.out.println("Время удаления элементов в ArrayList: " + removeElements(arrayList));
        System.out.println("Время удаления элементов в LinkedList: " + removeElements(linkedList));
        System.out.println("Время удаления элементов в TreeSet: " + removeElements(treeSet));
        System.out.println("Время удаления элементов в HashSet: " + removeElements(hashSet));
    }

    public static long addElements(List<Integer> list){
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++){
            list.add(i);
        }
        time = System.currentTimeMillis() - time;
        return time;
    }

    public static long addElements(Set<Integer> set){
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++){
            set.add(i);
        }
        time = System.currentTimeMillis() - time;
        return time;
    }

    public static long searchElements(List<Integer> list){
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++){
            list.contains(i);
        }
        time = System.currentTimeMillis() - time;
        return time;
    }

    public static long searchElements(Set<Integer> set){
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++){
            set.contains(i);
        }
        time = System.currentTimeMillis() - time;
        return time;
    }

    public static long removeElements(List<Integer> list){
        long time = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        time = System.currentTimeMillis() - time;
        return time;
    }

    public static long removeElements(Set<Integer> set){
        long time = System.currentTimeMillis();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        time = System.currentTimeMillis() - time;
        return time;
    }
}