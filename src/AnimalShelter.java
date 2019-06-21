import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Animal> list = new LinkedList<Animal>();

    public void enqueue(Animal a) // enqueue animal
    {
        list.add(a);
    }
    public Animal dequeueAny() // animal with min age
    {
        Animal animalWithMinAge = null;
        int min = list.peekFirst().getAge();
        for(Animal a : list)
        {
            if(a.getAge()<min)
            {
                min = a.getAge();
                animalWithMinAge = a;
            }
        }
        return animalWithMinAge;
    }
    public Animal dequeueDog() // dog with min age
    {
        Animal DogWithMinAge = null;
        int min = 99;
        for(Animal a : list)
        {
            if(a.getAge()<min && a.getType()=="dog")
            {
                min = a.getAge();
                DogWithMinAge = a;
            }
        }
        return DogWithMinAge;
    }
    public Animal dequeueCat() // cat with age
    {
        Animal CatWithMinAge = null;
        int min = 99;
        for(Animal a : list)
        {
            if(a.getAge()<min && a.getType()=="cat")
            {
                min = a.getAge();
                CatWithMinAge = a;
            }
        }
        return CatWithMinAge;
    }
}
