package collection;

public class hashmap {
    private int roll;
    private String name;
    private double per;
    private Integer rol;
    public hashmap(int roll,String name,double per){
        this.roll=roll;
        this.name=name;
        this.per=per;

    }

    @Override
    public String toString() {
    return "roll="+roll+",name="+name+",persentage="+per;

    }
    public int getRoll(Integer i){
        this.rol=i;
        return rol;
    }
}
