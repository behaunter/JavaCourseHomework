package Lesson_1;

//Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение "Звонит {name}"”".
//        Метод getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.

public class Phone {
    public static void main(String[] args) {
        Phone Iphone = new Phone("01236657","iphone 13",0.3);
        Phone Samsung = new Phone("01245334","Samsung s11",0.25);
        Phone Xiaomi = new Phone("01344777","Xiaomi 9t",0.34);
        System.out.println("Модель телефона: " + Iphone.model + " Номер телефона: " + Iphone.number +  " Вес телефона: "  + Iphone.weight);
        System.out.println("Модель телефона: " + Samsung.model + " Номер телефона: " + Samsung.number +  " Вес телефона: "  + Samsung.weight);
        System.out.println("Модель телефона: " + Xiaomi.model + " Номер телефона: " + Xiaomi.number +  " Вес телефона: "  + Xiaomi.weight);
        Iphone.getNumber();
        Iphone.receiveCall("Паша");
        Samsung.getNumber();
        Samsung.receiveCall("Алексей");
        Xiaomi.getNumber();
        Xiaomi.receiveCall("Таня");
    }

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println("Вам звонит " + name );
    }

    public void getNumber(){
        System.out.println("Ваш номер телефона: " + number);
    }

}
