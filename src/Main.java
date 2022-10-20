public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 1");
        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";


        System.out.println("Ф.И.О. сотрудника " + lastName + " " +  firstName + " " + middleName);
        System.out.println("Ф.И.О. сотрудника " + fullName);

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        String fullNameUpperCase = fullName.toUpperCase();

        System.out.println("Ф.И.О. сотрудника " + fullNameUpperCase);

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        String fullName2 = "Иванов Семён Семёнович";
        String changeFullName = fullName2.replace('ё', 'е');

        System.out.println("Ф.И.О. сотрудника " + changeFullName);

    }


}