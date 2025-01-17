package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean keepLooping = true;

        while (keepLooping) {
            try {
                displayMenu();
                String choice = scanner.nextLine();

                switch (Integer.parseInt(choice)){
                    case 1 -> bookCar();
                    case 2 -> displayAllUserBookedCar();
                    case 3 -> allBookings();
                    case 4 -> displayAvailableCars();
                    case 5 -> displayAvailableCars();
                    case 6 -> displayAllUsers();
                    case 7 -> keepLooping = false;
                    default -> System.out.println(choice + " not a valid option ❌");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static void displayAllUsers(){}

    private static void displayAvailableCars(){}

    private static void allBookings(){}

    private static void displayAllUserBookedCar(){}

    private static void bookCar(){}

    private static void displayMenu(){
        System.out.println("""
                \n
                1️⃣ - Book Car
                2️⃣ - View All User Booked Cars
                3️⃣ - View All Bookings
                4️⃣ - View Available Cars
                5️⃣ - View Available Electric Cars
                6️⃣ - View all users
                7️⃣ - Exit
                """);
    }
}