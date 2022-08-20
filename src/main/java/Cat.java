public class Cat extends Animal{

    public Cat(String name, Integer age, Integer weight, String color) {
        super(name, age, weight, color);
    }

    public void say(){
        System.out.println("Мяу");
    }
}
