package us.codecraft.webmagic.samples;

public class Outer {
    private String name = "DefaultOuter";
    private Inner inner = new Inner();

    public Outer setName(String name){
        this.name = name;
        inner.updateName();
        return this;
    }

    public String getName(){
        return name;
    }


    public String toString(){
        return name + "->" + inner;
    }

    class Inner{
        private String name = "DefaultInner";

        Inner updateName(){
            name = Outer.this.getName() + "'s inner";
            return this;
        }

        public String toString(){
            return name;
        }
    }

    public static void printMulti(Outer... outers){
        if (outers.length > 0) {
            for (Outer outer: outers) {
                System.out.println(outer);
            }
        }
    }

    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer o2 = new Outer().setName("NewOuter");

        System.out.println("print nothing");
        printMulti();
        System.out.println("the real print");
        printMulti(o1, o2);
    }
}
