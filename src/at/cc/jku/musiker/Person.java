package at.cc.jku.musiker;

public class Person {
    private String name;
    private int age;

    public Person(String name, int alter) {
        this.name = name;
        this.age = alter;
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

    public void printPersonData(){
        System.out.println("Name:\t\t\t\t" + this.name);
        System.out.println("Alter:\t\t\t\t" + this.age);
    }
}
