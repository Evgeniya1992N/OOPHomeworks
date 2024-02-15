import transport.*;

import java.util.*;


public class Main {


    public static void main(String[] args) {


        for (int i = 0; i <= 4; i++) {
            DriverB driverB = new DriverB(
                    "Driver No" + i,
                    true,
                    5 + i
            );
            DriverC driverC = new DriverC(
                    "Driver No" + i,
                    true,
                    7 + i
            );
            DriverD driverD = new DriverD(
                    "Driver No" + i,
                    true,
                    10 + i
            );
            Car car = new Car(
                    "Car brand " + i,
                    "Car model " + i,
                    1.6,
                    driverB,
                    5,
                    5,
                    new Mechanic("Ivan Ivanovich", "Company1")

            );
            Truck truck = new Truck(
                    "Truck brand " + i,
                    "Truck model " + i,
                    4.0,
                    driverC,
                    5,
                    5,
                    new Mechanic("Ivan Ivanovich", "Company1")
            );
            Bus bus = new Bus(
                    "Bus brand " + i,
                    "Bus model " + i,
                    1 + i,
                    driverD,
                    -1 + i,
                    -1 + i,
                    new Mechanic("Ivan Ivanovich", "Company1")
            );
            printInfo(car);
            printInfo(bus);
            printInfo(truck);



        }
        }

    private static void printInfo(Transport<?> transport){

        HashSet<Driver> driversDatabase = new HashSet<>();
        addDriverToDatabase(driversDatabase, new DriverB("Ivanov", true, 5));
        addDriverToDatabase(driversDatabase, new DriverC("Ivanov", true, 5));
        addDriverToDatabase(driversDatabase, new DriverD("Petrov", false, 10));
        addDriverToDatabase(driversDatabase, new DriverD("Petrov", false, 10));
        // Вывод всех водителей в консоль с помощью итератора
        System.out.println("Список водителей:");
        Iterator<Driver> iterator = driversDatabase.iterator();
        while (iterator.hasNext()) {
           Driver driver = iterator.next();
            if (driver instanceof DriverB) {
                System.out.println("Категория B: " + ((DriverB) driver).getName());
            } else if (driver instanceof DriverC) {
                System.out.println("Категория C: " + ((DriverC) driver).getName());
            } else if (driver instanceof DriverD) {
                System.out.println("Категория D: " + ((DriverD) driver).getName());
            }
        }
    }

    // Метод для добавления водителя в базу данных с выводом информации о добавлении
    public static void addDriverToDatabase(HashSet<Driver> database, Driver driver) {
        if (!database.contains(driver)) {
            boolean added = database.add(driver);
            if (added) {
                System.out.println("Водитель " + driver.getName() + " добавлен в базу данных.");
            } else {
                System.out.println("Ошибка при добавлении водителя " + driver.getName() + " в базу данных.");
            }
        } else {
            System.out.println("Водитель " + driver.getName() + " уже есть в базе данных.");
        }
    }
    }



