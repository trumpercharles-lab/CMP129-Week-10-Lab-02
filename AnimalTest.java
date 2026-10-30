public class AnimalTest {
    
    public static void main(String args[]){
        Cat newCat=new Cat("Garfield", 15, "Cat");
        newCat.displayInfo();
        newCat.makeSound();

        Dog newDog=new Dog("Dakota", 6, "Dog");
        newDog.displayInfo();
        newDog.makeSound();
    }

}
