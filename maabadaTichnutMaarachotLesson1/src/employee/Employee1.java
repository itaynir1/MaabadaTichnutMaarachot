package employee;


public final class Employee1 {
    //immutable class
    private int level;
    private String job;
    private String name;

    public Employee1(String job, String name, int level) {
        super();
        this.level = level;
        this.job = job;
        this.name = name;
    }

    // copy constructor
    public Employee1(Employee1 one) {
        super();
        this.job = one.job;
        this.name = one.name;
        this.level = one.level;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(){this.level=level;}

    public String getJob() {
        return job;
    }
    public void setJob(){this.job = job;}

    public String getName() {
        return name;}
   public void setName() {this.name = name;}


    public Employee1 change(String name, String job , int level)
    {
        Employee1 one = new Employee1(this);
        one.name = name;
        one.job = job;
        one.level = level;
        return one;
    }
    public String toString() {
        return ("the name is = " + name + " the level is = " + level + " , the job is " + job);

    }
}





