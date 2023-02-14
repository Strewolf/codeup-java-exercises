//import java.util.Arrays;
//
//public class ArraysExercises {
//    private String name;
//
//    class Person {
//        private String name;
//
//        public Person (String name){
//            this.name = name;
//    }
//
//        public String getName() {
//            return name;
//        }
//
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public static Person[] addPerson(Person[] people, Person newPerson ){
//       Person[] newArray = new Person[people.length + 1];
//       for (int i = 0; i< people.length; i++) {
//            newArray[i] = people[i];
//       }
//        newArray[people.length] =  newPerson;
//       return newArray;
//
//    }
//    public static void main(String[] args) {
//    int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers));
//        Person [] people = new Person[3];
//        people[0] = new Person("john");
//        people[1] = new Person("tim");
//        People[2] = new Person("tom");
//        for (Person person : people){
//            System.out.println(person.getName());
//        }
//        Person[] newPerson = new Person("Horace");
//        people = addPerson(people, newPerson);
//        System.out.println("after adding new object array" + Arrays.toString(people));
//
//
//}}}
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jane");
        people[2] = new Person("Jim");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person newPerson = new Person("Joan");
        people = addPerson(people, newPerson);
        for (Person person : people){
            System.out.println("After adding a new person: " + person.getName());
        }

    }

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = newPerson;
        return newArray;
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}