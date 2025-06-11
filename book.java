package collection;

public  class book implements Comparable<book> {
    String name;
    Double price;

    public book(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return name + price;
    }

    @Override
   public int compareTo(book o) {
        //System.out.println("hii");
        return this.price.compareTo(o.price);
       /* int result=this.price.compareTo(o.price);
        if(result!=0)
            return result;
        return this.name.compareTo(o.name);


    }

    /* @Override
    public int compareTo(book o) {
        return (int)(this.price-o.price);
    }*/
    }
}
