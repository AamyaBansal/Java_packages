package Assignment5_PIJ_part3;

public abstract class Employee {
    private String name;
    private String address;
    private double monthlySalary;
    protected double basicSalary, hra, da, ma, pf;      /*HRA : House rent allowance
                                                         DA : Dearness Allowance
                                                         MA : Medical Allowance
                                                         PF : Provident Fund*/

    public Employee(String address, double monthlySalary, double hra, double da, double ma) {

        this.address = address;
        this.monthlySalary = monthlySalary;
        this.hra = hra;
        this.da = da;
        this.ma = ma;
    }

    public Employee() {

    }

    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public double getBasicSalary()
    {
        return basicSalary;
    }

    public void setBasicSalary(int sal)
    {
        basicSalary = sal;
    }
    public Employee(String name, String address, double basicSalary, double hra, double da, double ma, double pf)
    {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.ma = ma;
        this.pf = pf;
    }
    public abstract double getMonthlySalary();

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}



