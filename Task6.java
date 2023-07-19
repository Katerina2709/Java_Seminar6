package gb.javaproject;
import java.util.HashSet;
public class Task6 {
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat("Фараон", "Сфинкс", "Серый", "Male", 3));
        cats.add(new Cat("Айна", "Мейнкун", "Белый", "Female", 2));
        cats.add(new Cat("Мурка", "Сибирская", "Черно-белая", "Female", 3));
        cats.add(new Cat("Рамзес", "Сфинкс", "Персиковый", "Male", 4));
        cats.add(new Cat("Феликс", "Абиссинская", "Черный", "Male", 1));
        System.out.println(cats);

        cats.add(new Cat("Айна", "Мейнкун", "Белый", "Female", 2));
        cats.add(new Cat("Мурка", "Сибирская", "Черно-белая", "Female", 3));
        cats.add(new Cat("Айна", "Мейнкун", "Белый", "Female", 2));
        /* Проверим, что все дубликаты сохранились во множество. */
        System.out.println(cats);
        /* Переопределим метод HashCode и убедимся, что все дубликаты удалились.*/
        System.out.println(cats);
    }
}

