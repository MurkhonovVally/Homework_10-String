public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println((char) 27 + "[34m----------Задача 1----------" + (char) 27 + "[0m");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }

    public static void task2() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 2----------" + (char)27 + "[0m");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
    }

    public static void task3() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 3----------" + (char)27 + "[0m");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}