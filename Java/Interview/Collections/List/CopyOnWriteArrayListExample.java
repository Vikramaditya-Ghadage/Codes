import java.util.concurrent.CopyOnWriteArrayList;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + "(" + age + ")"; }
}

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Person> list = new CopyOnWriteArrayList<>();
        list.add(new Person("A", 10));
        list.add(new Person("B", 100));

        // for-each uses an iterator snapshot of the *list entries*,
        // but each entry is still the same Person object.
        for (Person p : list) {
            p.age += 5;   // ✅ update field of the Person object
        }

        System.out.println(list);  // [A(25), B(30)]
    }
}

