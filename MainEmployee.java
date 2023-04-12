package Assignment5_PIJ_part3;

import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args)
    {
        String name, address;
        double monthlySalary,hra, da, ma, pf;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the employee: ");
        name = sc.nextLine();

        System.out.println("Enter the address of the employee: ");
        address = sc.nextLine();

        System.out.println("Enter the monthly basic salary of the employee: ");
        monthlySalary = sc.nextDouble();

        System.out.println("Enter the house rent allowance: ");
        hra = sc.nextDouble();

        System.out.println("Enter the dearness allowance: ");
        da = sc.nextDouble();

        System.out.println("Enter the medical allowance: ");
        ma = sc.nextDouble();

        System.out.println("Enter the provident fund: ");
        pf = sc.nextDouble();

        NormalEmployee ne = new NormalEmployee(name, address, monthlySalary, hra, da, ma, pf);
        System.out.println(ne);

        EmployeeBonus be =  new EmployeeBonus(name, address, monthlySalary, hra, da, ma, pf);
        System.out.println(be);
    }
}




