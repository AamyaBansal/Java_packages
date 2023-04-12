package Assignment5_PIJ_part3;

public class EmployeeBonus extends Employee{
    private double bonus;
    public EmployeeBonus(String name, String address, double basicSalary, double hra, double da, double ma, double pf)
    {
        super(name, address, basicSalary, hra, da, ma, pf);
    }
    public double getMonthlySalary()
    {
        if ((super.basicSalary + da) < 7000)
        {
            bonus = (super.basicSalary + da) * 8.33/100;
        }
        else if ((super.basicSalary + da) >= 7000 && (super.basicSalary + da)<50000)
        {
            bonus = (super.basicSalary + da) * 10/100;
        }
        if ((super.basicSalary + da) >= 50000 && (super.basicSalary + da)<125000)
        {
            bonus = (super.basicSalary + da) * 15/100;
        }
        if ((super.basicSalary + da) >= 125000)
        {
            bonus = (super.basicSalary + da) * 20/100;
        }
        System.out.println("You are eligible to have a bonus of " + bonus);
        System.out.println("\n");
        return (basicSalary + hra+ da+ ma - pf + bonus);
    }
    public String toString()
    {
        return " ----------------------------------------------"+ "\n" +" Name: "+ super.getName()+
                "\n"+" Address: "+ super.getAddress()+"\n"+
                " Basic Monthly Salary: "+ super.getBasicSalary()+
                "\n"+" Monthly Salary including bonus: "+ getMonthlySalary()+
                "\n" +"------------------------------------------";
    }
}

