class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    public Animal(String name, Integer age, Integer weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    protected String diffAge(int age) {
        String a ="";
        boolean excAge=(age%100>=11)&&(age%100<=14);
        int remainder=age%10;
        if (age==1||remainder==1) a=" год";
        else if ( (remainder>1 && remainder< 5)||(age>1 && age<5)) a=" года";
        else if ((age==0)||(remainder==0)||(age>=5&&age<=9)||(remainder>=5&&remainder<=9)||(age>=11&&age<=14)) a=" лет";
        else if (excAge==true) a=" лет";

        return a;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут "
                + name +
                ", мне " + age + diffAge(age) +
                ", я вешу " + weight + " кг" +
                ", мой цвет " + color + '.';
    }
}
