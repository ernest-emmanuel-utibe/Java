package tdd.Shell_Co_Operation_Test;

import ErnestProjects.Shell_Co_Operations;

public class Shell_Co_Operation_Test {
    public static void main(String[] args) {

        Shell_Co_Operations shell_co_operations = new Shell_Co_Operations("Mr Ogbefianor","Samuel Jude.",57
        ,"Male","December","Monday,",1965,789.0,134.0);

        System.out.printf("My names are %s %s\n", shell_co_operations.getFirstName(),shell_co_operations.getLastName());
        System.out.printf("I am %d years of age. %n", shell_co_operations.getAge());
        System.out.printf("I was born on %s %s %d\n", shell_co_operations.getMonth(),shell_co_operations.getDay(), shell_co_operations.getYear());
        System.out.printf("My Minimum Heart Rate is %.2f%n", shell_co_operations.getMinimumHeartRate());
        System.out.printf("My Maximum Heart Rate is %.2f%n", shell_co_operations.getMaximumHeartRate());
    }
}
