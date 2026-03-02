public class OuterClass {
    private int outerField = 200;
    
    class InnerClass {
        private int innerField = 100;
        
        void printSum() {
            System.out.println("Sum: " + (outerField + innerField));  // Accesses outer field
        }
    }

    public void accessInnerClass()
    {
        InnerClass in=new InnerClass();
        System.out.println("Outer:"+outerField +" Inner:"+in.innerField);
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();

        OuterClass.InnerClass inner=outer.new InnerClass();
        inner.printSum();

    }
}
