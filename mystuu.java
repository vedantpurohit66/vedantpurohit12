package collection;

public class mystuu {
    int roll;
    String name;
    double sal;
    public mystuu(int roll,String name,double sal){
        this.roll=roll;
        this.name=name;
        this.sal=sal;

    }
    public int send(){
        return roll;
    }

    @Override
    public String toString() {
        return "name="+name+",salary="+sal;
    }
}
