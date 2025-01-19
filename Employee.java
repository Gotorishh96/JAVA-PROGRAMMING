 class Emp
{
    int empno;
    String name;
    Emp(int eno,String nm){
        empno = eno ;
        name = nm;
    }
     void display(){
        System.out.println("empno: "+empno);
        System.out.println("name: "+name);
    }
}
class PrEmp extends Emp{
    double basic;
    double ta;
    double pf;
    double netSal;
    PrEmp( int empno,String name,double bs,double t,double p){
        super(empno, name);
        basic=bs;
        ta=t;
        pf=p;
        calgrosspay();
    }
    private void calgrosspay(){
    netSal = basic+ta-pf;
    System.out.println("NET SALARY OF PERMANENT EMPLOYEES= "+ netSal);

}
void print(){
    display();
    System.out.println("Basic Salary= "+ basic);
    System.out.println("TA= "+ ta);
    System.out.println("PF= "+ pf);
    System.out.println("Net Salary= "+ netSal);
   System.out.println();
}
}
class DwEmp extends Emp{
    int no_of_days;
    double amt_per_days;
    double tot_sal;
    DwEmp(int empno,String name,int nfd,double apd){
        super(empno, name);
        no_of_days=nfd;
        amt_per_days=apd;
        calgrosspay();
    }
   private void calgrosspay(){
    tot_sal=no_of_days*amt_per_days;
    System.out.println("TOTAL SALARY OF DAILYWAGES EMPLOYEES= "+ tot_sal);
}
void print(){
    display();
    System.out.println("No. Of Days Worked= "+ no_of_days);
    System.out.println("Amount per Day= "+ amt_per_days);
    System.out.println("Total Salary= "+ tot_sal);
    System.out.println();
  
}
}
public class Employee{
    public static void main(String args[]){
        PrEmp ob = new PrEmp(18,"RISHIKANTA",35000.00,5000.00,1000.00);
        ob.print();
       
        PrEmp od = new PrEmp(19,"MANASWINI",30000.00,5000.00,1000.00);
        od.print();

        DwEmp oc = new DwEmp(10,"RONIT",13,1000.00);
        oc.print();
    }
}
