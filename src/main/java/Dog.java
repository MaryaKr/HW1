public class Dog extends  Animal{

    public Dog(String name, Integer age, Integer weight, String color) {
        super(name, age, weight, color);
    }

    public void say(){
        System.out.println("Гав");
    }
}
