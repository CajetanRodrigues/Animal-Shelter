import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Animal("dog",3));
        as.enqueue(new Animal(("cat"),6));
        as.enqueue(new Animal("dog",2));
        as.enqueue(new Animal("cat",4));

        System.out.println(as.dequeueAny());
        System.out.println(as.dequeueCat());
        System.out.println(as.dequeueDog());
    }
}
