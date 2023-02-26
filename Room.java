public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean Acmachine;
    public Room(){
        System.out.println("Hellow,an object of Room class is created");
    }
    public Room(int no,String type,float area,boolean Ac){
        roomno=no;
        roomtype=type;
        roomarea=area;
        Acmachine=Ac;

    }
    void displayData(){
        System.out.println("Room_No:"+roomno);
        System.out.println("Room_Type:"+roomtype);
        System.out.println("Room_Area:"+roomarea);
        System.out.println("Ac-Machine:"+Acmachine);
    }
    public static void main(String[]args){
        Room obj=new Room(1,"Luxary",200.5f,true);
        Room obj1=new Room();
        obj.displayData();
    }
}
