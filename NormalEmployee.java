package Assignment5_PIJ_part3;

import java.util.Scanner;

public class NormalEmployee extends Employee {

    Scanner sc = new Scanner(System.in);
    public NormalEmployee(String name, String address, double basicSalary, double hra, double da, double ma, double pf)
    {

        super(name, address, basicSalary, hra, da, ma, pf);
        super.basicSalary = (super.basicSalary+ hra+ da+ ma - pf);
    }
    public double getMonthlySalary()
    {
        return getBasicSalary();
    }

    public String toString()
    {
        return " * * * * * * * * * * * * * * * * * * * * *"+ "\n" +
                " Name: "+super.getName()+"\n"+
                " Address: "+super.getAddress()+"\n"+
                " Gross Monthly Salary: "+super.getBasicSalary()+
                "\n" + " * * * * * * * * * * * * * * * * * * * * *" + "\n";
    }
}

