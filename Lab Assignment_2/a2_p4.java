// Define a class Deposit. The instance variable of the class Deposit are mentioned
// below.
// Instance Variable Data Type
// Principal Long
// Time Integer
// Rate Double
// TotalAmt Double
// Initialize the instance variables Principal, Time, rate through constructors. Construc-
// tors are overloaded with the following prototypes.
// Constructor1: Deposit ( )
// Constructor2: Deposit (long, int, double)
// Constructor3: Deposit (long, int)
// Constructor4: Deposit (long, double)
// Apart from constructor, the other instance methods are
// (i) display ( ): to display the value of instance variables,
// (ii) calcAmt( ): to calculate the total amount.
// totalAamt = Principal + (Principal*rate*Time)/100;


class Deposit{
    long principal;
    int time;
    double rate,totalAmt;

    Deposit(){
        
    }
    

    Deposit (long principal, int time){
        this.principal = principal;
        this.time = time;

    }

    Deposit (long principal, double rate){
        this.principal = principal;
        this.rate = rate;

    }
    Deposit(long principal, int time , double rate){
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }
     void display(){
        System.out.println("Principal: "+this.principal);
        System.out.println("Time: "+this.time+" years");
        System.out.println("Rate: "+ this.rate+" %");
        calcAmt();
     }
     void calcAmt(){
        this.totalAmt = this.principal + (this.principal*this.time*this.rate)/100;
        System.out.println("TotalAmount: "+ this.totalAmt);
     }
  }

public class a2_p4 {
    public static void main(String[] args) {
        Deposit ob1 = new Deposit();
        Deposit ob2 = new Deposit(10000,5,7.1);
        Deposit ob3 = new Deposit(20000,2);
        Deposit ob4 = new Deposit(5000,5.3);
        ob1.display();
        ob2.display();
        ob3.display();
        ob4.display();
        
    }
}


// Principal: 0
// Time: 0 years
// Rate: 0.0 %
// TotalAmount: 0.0
// Principal: 10000
// Time: 5 years
// Rate: 7.1 %
// TotalAmount: 13550.0
// Principal: 20000
// Time: 2 years
// Rate: 0.0 %
// TotalAmount: 20000.0
// Principal: 5000
// Time: 0 years
// Rate: 5.3 %
// TotalAmount: 5000.0