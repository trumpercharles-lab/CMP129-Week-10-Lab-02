public class Animal {
    public String name, species;
    public int age;

    public Animal(String name, int age, String species){
        this.name=name;
        this.age=age;
        this.species=species;
    }

    public void displayInfo(){
        System.out.print("Name: "+name+"\nAge: "+age+"\nSpecies: "+species+"\n");
    }

    public void makeSound(){
        if(species=="Dog"){
            System.out.print("Woof\n");
        }else if(species=="Cat"){
            System.out.print("Meow\n");
        }
    }

}
