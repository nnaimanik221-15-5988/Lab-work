public class Main {
    public static void main(String[] args) {
        AddressInfo addressInfo= new AddressInfo("Sector 4", "Uttara", "Dhaka", "1711");
        InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 123);
        Employeee employeee =new Employeee("Mr. Rahim",addressInfo, insuranceInfo );
        employeee.display();


        Engine eng = new Engine(34.7);
        DashBoard db= new DashBoard(5.0);
        Volvo v=new Volvo(700,"2022", "DHA34567",eng,db);
        v.drive();
        v.stop();
        v.changeFuel();
        v.checkBattery();
        v.model="SUV. XC40";
        v.company="Volvo";

    }
}

