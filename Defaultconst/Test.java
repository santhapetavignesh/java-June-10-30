class A extends Object{
    int acc_Amount;
    
    /* A(int amount){
        super();
        this.acc_Amount = amount;
        System.out.println(" A class - const");
    } */
}

class B extends A{
    B(int amount){
    super(); //generated by compliter
    //super(amount);
    System.out.println(" B class - const");
    }
}
class Test{
    public static void main(String[] args){
        B obj=new B(100);
        System.out.println(obj.acc_Amount);
    }
}