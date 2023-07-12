package training.me.ingineriaSoftware02;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        try {
            // Programare orientată pe obiect
            Person person = new Person("John", 25);
            System.out.println(person.getName() + " are " + person.getAge() + " ani.");

            // Gestionarea erorilor
            int result = divide(10, 0);
            System.out.println("Rezultat: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        // Container de date încorporat
        List<String> lista = new ArrayList<>();
        lista.add("Element 1");
        lista.add("Element 2");
        lista.add("Element 3");

        for (String element : lista) {
            System.out.println(element);
        }

        // Scrierea de cod general suplimentar
        String reversedString = reverseString("Hello, world!");
        System.out.println("String inversat: " + reversedString);

        // Elemente de programare funcțională
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println("Suma numerelor pare: " + sum);

        // Execuție multifir
        Thread thread1 = new Thread(() -> {
            System.out.println("Firul 1 rulează...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Firul 1 s-a încheiat.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Firul 2 rulează...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Firul 2 s-a încheiat.");
        });

        thread1.start();
        thread2.start();
    }

    // Clasă pentru programarea orientată pe obiect
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    // Metodă pentru gestionarea erorilor
    static int divide(int a, int b) {
        return a / b;
    }

    // Metodă pentru scrierea de cod general suplimentar
    static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
