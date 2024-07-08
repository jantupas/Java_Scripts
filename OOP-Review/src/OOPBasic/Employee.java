package OOPBasic;

public class Employee {
    protected String f_name;
    protected String l_name;
    protected int age;

    public Employee(String f_name, String l_name, int age){
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
    }

    public void setFname(String fname){
        this.f_name = fname;
    }

    public void setLname(String lname){
        this.l_name = lname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getFname(){
        return f_name;
    }

    public String getLname(){
        return l_name;
    }

    public int getAge(){
        return age;
    }

    public void greeting(){
        System.out.println("My name is " + f_name + " " + l_name + " and my age is " + age);
    }
}
