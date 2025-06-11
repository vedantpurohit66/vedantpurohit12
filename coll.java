package collection;

public class coll {
    public int a;
    public String b;
    public double c;
    public coll(int a,String b,double c){
        this.a=a;
        this.b=b;
        this.c=c;


    }

    @Override
    public String toString() {
        return a+b+c;
    }
    // public int r=1;

}
