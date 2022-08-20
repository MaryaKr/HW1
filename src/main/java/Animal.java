 class Animal {
    protected String name;
    protected Integer age;
    protected Integer weight;
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
protected String diffAge (int age){
        String a;
        if (age>=5){
            a=" лет";}
            else if ( age>1){
            a=" года";
        }    else { a=" год";}
        return a;
}
    @Override
  public String toString() {
        return "Привет! Меня зовут "
                + name +
                ", мне " + age +diffAge(age)+
                ", я вешу " + weight + " кг"+
                ", мой цвет " + color + '.' ;
    }
}
