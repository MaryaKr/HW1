import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Напишите команду, одну из add/list/exit");
            String s = input.next().trim().toUpperCase();
            Komands as = Komands.valueOf(s);

            switch (as) {

                case ADD:

                    System.out.println("Выберете животное cat/dog/duck");
                    String a = input.next().trim().toUpperCase();

                    System.out.println("Назовите животного:");
                    String b = input.next().trim();

                    System.out.println("Какой возраст у животного?");
                    int c = input.nextInt();


                    System.out.println("Какой вес у животного в кг?");
                    int d = input.nextInt();


                    System.out.println("Какой цвет у животного?");
                    String e = input.next().trim();


                    switch (a) {
                        case "CAT":
                            Cat cat = new Cat(b, c, d, e);
                            animals.add(cat);
                            cat.say();
                            break;
                        case "DOG":
                            Dog dog = new Dog(b, c, d, e);
                            animals.add(dog);
                            dog.say();
                            break;
                        case "DUCK":
                            Duck duck = new Duck(b, c, d, e);
                            animals.add(duck);
                            duck.say();
                            break;
                    }

                    break;
                case LIST:

             for (Animal i:animals){
                 System.out.println(i);
             }
                    break;
             case EXIT:
                    System.exit(0);

                    
            }


        }
    }
}