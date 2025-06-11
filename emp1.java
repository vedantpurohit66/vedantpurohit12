package collection;


public class emp1 implements Comparable<emp1> {
    private int age;
   private String name;
   private Double sal;
   public emp1(int age,String name,double sal){
       this.age=age;
       this.name=name;
       this.sal=sal;

   }

    @Override
    public String toString() {
        return age+ name+sal;
    }

    @Override
    public int compareTo(emp1 o) {
       return sal.compareTo(o.sal);
        //int result=this.sal.compareTo(o.sal);
        /*if(result!=0)
            return result;
        return this.name.compareTo(o.name );*/
    }
}
