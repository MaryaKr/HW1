import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Напишите команду, одну из add/list/exit");
            String s = input.next().trim().toUpperCase();
            Comands as = Comands.valueOf(s);
            switch (as) {
                case ADD:
                    System.out.println("Выберете животное cat/dog/duck");
                    String animal = input.next().trim().toUpperCase();
                    System.out.println("Назовите животного:");
                    String name = input.next().trim();
                    System.out.println("Какой возраст у животного?");
                    int age = input.nextInt();
                    System.out.println("Какой вес у животного в кг?");
                    int weight = input.nextInt();
                    System.out.println("Какой цвет у животного?");
                    String color = input.next().trim();
                    switch (animal) {
                        case "CAT":
                            Cat cat = new Cat(name,age,weight,color);
                            animals.add(cat);
                            cat.say();
                            break;
                        case "DOG":
                            Dog dog = new Dog(name,age,weight,color);
                            animals.add(dog);
                            dog.say();
                            break;
                        case "DUCK":
                            Duck duck = new Duck(name,age,weight,color);
                            animals.add(duck);
                            duck.say();
                            break;
                    }
                    break;
                case LIST:
                    for (Animal i : animals) {
                        System.out.println(i);
                    }
                    break;
                case EXIT:
                    System.exit(0);


            }


        }
    }
}