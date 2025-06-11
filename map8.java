package collection;

public class map8 {

int age;
    int roll;
    String str;
    double per;

    public map8(int roll, String str, double per ,int age) {
        this.roll = roll;
        this.str = str;
        this.per = per;
        this.age=age;

    }

    @Override
    public String toString() {
        return "roll="+roll+",age="+age+",per="+per+",name="+str;
    }

}

