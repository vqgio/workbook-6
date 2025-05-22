package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("JOhn", "Pork", 62));
        people.add(new Person("Jeff", "Buckley", 22));
        people.add(new Person("John", "Lennon", 32));
        people.add(new Person("Ant", "Edwards", 56));
        people.add(new Person("Lebron", "James", 21));
        people.add(new Person("Bruno", "Fernandez", 19));
        people.add(new Person("JJ", "Jones", 7));
        people.add(new Person("Melchi", "Komi", 37));
        people.add(new Person("Juliet", "Simmons", 25));
        people.add(new Person("Park", "Min-Sung", 29));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name or a last name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        List<Person> searchPeople = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getFirstName().toLowerCase().contains(searchName) || person.getLastName().toLowerCase().contains(searchName)) {
                searchPeople.add(person);
            }
        }
        System.out.print("\nsearchPeople: ");
        for (Person person : searchPeople) {
            System.out.println(person);
        }
        System.out.println("\nPeople Details: ");
        double averageAge = people.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println("\nAverage age: " + averageAge);
        int MaxAge = people.stream().mapToInt(Person::getAge).max().orElse(0);
        System.out.println("\nMax age: " + MaxAge);
        int MinAge = people.stream().mapToInt(Person::getAge).min().orElse(0);
        System.out.println("\nMin age: " + MinAge);

        scanner.close();
    }
}
