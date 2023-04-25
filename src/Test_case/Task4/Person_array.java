package Test_case.Task4;

class Person_array {
    public static void main(String[] args) {
        Person[] persons = new Person[7];
        persons[0] = new Person("Alex");
        persons[1] = new Person("Kristofer");
        persons[2] = new Person("Bill");
        persons[3] = new Person("John");
        persons[4] = new Person("Sebastian");
        persons[5] = new Person("Sam");
        persons[6] = new Person("Alex");
        for (int i = 0; i < persons.length; i++){
            if (persons[i].getAge() >= 18){
                persons[i].print();
            }
            }
    }
}