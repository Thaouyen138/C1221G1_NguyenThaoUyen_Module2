package ss07_abstract_class_interface.thuc_hanh.AnimalAndInterface;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}