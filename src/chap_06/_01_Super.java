package chap_06;

public class _01_Super {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 13);
        System.out.println(person.toString());

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("배트맨");
        hero.attack(hero2);

    }
}

class Person{
    private String name;
    private int age;

    Person(){

    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Hero extends Person{
    public Hero(String name){
        super(name,0);
    }
    private boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public void attack(Hero hero){
        System.out.println(hero.getName() + "와 싸우고 있습니다.");
    }
}