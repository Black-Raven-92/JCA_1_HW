package JCA_HW_5_OOP;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Worker {
    private static final String TYPE = "Worker";
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private float paid;
    private  int age;
    private GregorianCalendar birthday= new GregorianCalendar();



    Worker(String name, String position, String email,String phoneNumber,float paid, int age){
        this.name=name;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.paid=paid;
        this.age=age;
    }
    Worker(String name, String position, String email,String phoneNumber,float paid, int age, GregorianCalendar birthday){
        this.name=name;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.paid=paid;
        this.age=age;
        this.birthday=birthday;

    }
    public void Print(){
        System.out.printf("Worker: %s    Position: %s   Email: %s     Phone number: %s     Paid: %f    Age: %d     Birthday:",name, position, email, phoneNumber, paid, age);

    }
    public int getAge(){
        return  age;
    }
    public String getName(){
        return name;
    }
    public GregorianCalendar getBirthday()
    {
        return birthday;
    }


}
