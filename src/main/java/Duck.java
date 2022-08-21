public class Duck extends Animal implements Flying{

    public Duck(String name, Integer age, Integer weight, String color) {
        super(name, age, weight, color);
    }

    public void say(){
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу! Если закрыть глаза, то летать сможет и собака с кошкой и  даже человек!");
    }
}
