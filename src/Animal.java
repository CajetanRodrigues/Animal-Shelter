import java.util.LinkedList;

public class Animal {
    private String type;
    private int age;
    LinkedList<Animal> list = new LinkedList<Animal>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }
    public void enqueue(Animal a){
        list.add(a);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
