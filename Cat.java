package gb.javaproject;
import java.util.HashSet;
import java.util.Objects;
public class Cat {
    String name, breed, colour, gender;
    int age;

    public Cat (String name, String breed, String colour, String gender, int age){
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.gender = gender;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed) && Objects.equals(colour, cat.colour) && Objects.equals(gender, cat.gender);
    }
    public int hashCode() {
        return Objects.hash(name, breed, colour, gender, age);
    }
    public String toString() {
        return String.format("%s, %s, %s, %s, возраст: %d \n", name, breed, colour, gender, age);
    }
}
