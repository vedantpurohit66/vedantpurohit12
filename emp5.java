package collection;

public class emp5 implements Comparable<emp5>{
    int id;
    String str;
    public emp5(int id,String str){
        this.id=id;
        this.str=str;
    }

    @Override
    public String toString() {
        return "id="+id+",string= "+str;
    }

    @Override
    public int compareTo(emp5 o) {
      return this.id-o.id;
    }
}
