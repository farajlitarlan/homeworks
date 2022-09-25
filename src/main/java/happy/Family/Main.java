package happy.Family;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("dog",
                "Cloud",
                1, 20,
                new String[]{"playing", "sleeping"});

        Human mother = new Human("Anne", "Murphy", 1989);
        Human father = new Human("Jack", "Murphy", 1984);

        Human child = new Human("Belle","Murphy", 2000, 111, pet,
                father,mother, new String[][]{{"sunday", "walking"}}) ;



        System.out.println(child);
    }
}
