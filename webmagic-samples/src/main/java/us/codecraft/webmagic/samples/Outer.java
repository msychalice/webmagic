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

    public static void main(String[] args) {
        System.out.println(new Outer());
        System.out.println(new Outer().setName("NewOuter"));
    }
}
