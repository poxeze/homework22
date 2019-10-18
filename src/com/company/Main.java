package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        String name;
        int age;
        int temperature;

        System.out.println("Введите ваше имя");
        name = user.nextLine();
        System.out.println("Введите ваш возраст");
        age = user.nextInt();
        System.out.println("Введите температуру на улице");
        temperature = user.nextInt();

        if ((temperature >= 30 || temperature <= -20) && (age > 20 && age < 45)) {
            System.out.println(name + " Сидишь дома");
        } else if ((temperature < 0 || temperature > 28) && (age > 0 && age < 20)) {
            System.out.println(name + " Сидишь дома");
        } else if ((temperature > 25 || temperature < -10) && (age > 45)) {
            System.out.println(name + " Сидишь дома");
        } else {
            System.out.println(name +
                    " Идешь к другу в гости");
        }


        generateRandomAg();

    }

    // Задание на сообразительность
    public static int generateRandomAg() {
        int random = (int) (Math.random() * 107);
        System.out.println("Ваш случайный возраст " + random);
        return random;
    }
}
