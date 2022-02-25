package ss07_abstract_class_interface.thuc_hanh.AnimalAndInterface;

public class AbstractionAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            System.out.println(animal.makeSound());
        }
    }
}
