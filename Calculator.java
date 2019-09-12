/*Calculator*/

public class Calculator {

    int a=10;
    int b=20;

    void add() {
        System.out.println("add : "+(10+20));

    }

    void sub(){
        System.out.println("sub : "+(10-20));
    }

    static {
        System.out.println("Inside Static Method");
    }


    static void mul(){           //static function
        System.out.println("mul : "+(10*20));
    }

    static void div(){          //static function

        System.out.println("div : "+(10/20));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();//syntax to initialise  object
        System.out.println("a : "+calculator.a);
        System.out.println("b : "+calculator.b);
        calculator.add();     //object created for non static function
        calculator.sub();
        mul();                //no need of creating objects of static function
        div();



    }
}