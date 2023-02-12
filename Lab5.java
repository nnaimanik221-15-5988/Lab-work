
class Lab5{    int empId;
    String empName;   Lab5 (int id,String name){
        this.empId=id;      this.empName=name;
    }    void info()
    {        System.out.println("Id"+empId+"Name"+empName);
    }
    public static void main(String[] args) {
        Lab5 obj1=new Lab5(1023,"Anik");
        Lab5 obj2=new Lab5(1024,"Naim");
        obj1.info();
        obj2.info();    }
}