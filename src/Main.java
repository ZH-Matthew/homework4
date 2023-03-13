public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 6;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 21;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if (age >= 24 && age < 65) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 12;
        if (age <= 5 ) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age > 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int numberOfPassengers = 100;
        int wagonCapacity = 102;
        int seatPlace = 60;
        if (numberOfPassengers <= 60) {
            System.out.println("В вагоне свободно " + (wagonCapacity - seatPlace) + " стоячих места и " + (seatPlace-numberOfPassengers) + " сидячих");
        } else if (numberOfPassengers > 60 && numberOfPassengers <= 102) {
            System.out.println("В вагоне свободно " + (wagonCapacity - numberOfPassengers ) + " стоячих места и заняты все сидячие ");
        } else if (numberOfPassengers > 102) {
            System.out.println("Вагон полностью забит");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two){
            if (one>three) {
                System.out.println("Число " + one + " большее из 3х чисел." );
            } else {
                System.out.println("Число " + three + " большее из 3х чисел." );
            }
        } else {
            if (two>three) {
                System.out.println("Число " + two + " большее из 3х чисел." );
            } else {
                System.out.println("Число " + three + " большее из 3х чисел." );
            }
        }
    }
}