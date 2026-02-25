package Mypackage;

class Employees
{
    protected String name;
    private int id;

    Employees(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public void showDetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employees
{
    private int teamsize;

    Manager(String name, int id, int teamsize)
    {
        super(name, id);
        this.teamsize = teamsize;
    }

    public void assignTask()
    {
        System.out.println(name + " is assigned to a task having a team size of: " + teamsize);
    }
}

class Developer extends Employees
{
    private String programminglang;

    Developer(String name, int id, String programminglang)
    {
        super(name, id);
        this.programminglang = programminglang;
    }

    public void writeCode()
    {
        System.out.println(name + " writes code in " + programminglang + " language");
    }
}

class Intern extends Employees
{
    private int traininghours;

    Intern(String name, int id, int traininghours)
    {
        super(name, id);
        this.traininghours = traininghours;
    
    }
    


    public void attendTraining()
    {
        System.out.println(name + " attended a meeting");
