package Test_case.Task4;

import java.util.Random;

/**
 * 1. Напишите простой класс Java с именем "Person" с двумя полями - name (строка) и age (целое число),
 * а также конструктором, который принимает два аргумента (name и age) и геттерами и сеттерами для этих полей.
 * 2. Напишите метод, который принимает список объектов типа "Person" и возвращает список имен тех людей,
 * чей возраст больше или равен 18.
 * Пожалуйста, предоставьте решения каждого раздела в отдельном текстовом файле
 * или в комментариях к заданию.
 */

    public class Person {
        protected String name;
        protected int age;
        protected Random random = new Random();


        public Person (String name) {
            this.name = name;
            this.age = random.nextInt(1, 40);
        }

        public String get_person(){
            return ("His name is " + name + " his age is " + age);
        }

        public void  print(){
            System.out.println(get_person());
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
