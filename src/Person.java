public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    };

    public String getName () {
//TODO: return the person's name
        return this.name;

    }

    public void setName (String name){
//TODO: change the name field to the passed value
        this.name = name;

    }
    public void sayHello () {
//TODO: print a message to the console using the person's name
        System.out.println("Hello to "+ this.name);
    }


    public static void main(String[] args) {
// Person Person = new Person("Horace Smith");
//        System.out.println(Person.getName());
//Person.sayHello();
//        Person.setName("joe");
//        Person.sayHello();
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }
}