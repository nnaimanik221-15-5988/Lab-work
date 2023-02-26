public class Person {
    private String name;
    private int id;
    public Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }
    public static void main(String[]args){
        Person p1=new Person("Anik",5988);
        System.out.println(p1.getName());
        System.out.println(p1.getId());
        p1.setId(988);
        System.out.println(p1.getId());
    }
}
