public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //task 2
        String employeeData = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + employeeData);

        //task 3
        String fullName3 = "Иванов Семён Семёнович";
        String newFullName = fullName3.replace('ё', 'е');
        System.out.println(newFullName);
    }
}