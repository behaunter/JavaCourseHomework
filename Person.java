package Lesson_1;

//1. Создать класс Person, который содержит:
//        переменные fullName, age;
//        методы move() и talk(), в которых просто вывести на консоль сообщение - "Person {такой-то} говорит" и
//        "Person {такой-то} идет" (замените {такой-то} на fullName).
//        Добавьте геттеры и сеттеры.
//        Добавьте два конструктора  - Person() и Person(fullName, age).
//        Создайте два объекта этого класса. Один объект инициализируйте конструктором Person() и сеттерами, другой - конструктором Person(fullName, age)
public class Person {
    public static void main(String[] args) {


        Person Misha = new Person("Mykhailo", 23);
        Person Katya = new Person();
        Katya.setFullName("Kateryna");
        Katya.setAge(24);
        Katya.move();
        Misha.talk();
    }

    private String fullName;
    private int age;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void move() {
        System.out.println("Person " + fullName + " идет");
    }

    public void talk() {
        System.out.println("Person " + fullName + " говорит");
    }


}
