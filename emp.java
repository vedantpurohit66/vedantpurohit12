package collection;

public class emp implements Comparable<emp>{
    public int age;
    String name;
  public  int sal;
    public emp(int age,String name,int sal){
        this.age=age;
        this.name=name;
        this.sal=sal;
    }

    @Override
    public int  compareTo(emp o) {

     return age-o.age;
    }

    @Override
    public String toString() {
        return "age="+age+",name="+name+",sal="+sal;
    }



}
