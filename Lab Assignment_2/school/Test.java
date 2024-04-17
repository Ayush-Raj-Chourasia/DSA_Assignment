package school;

public class Test extends Student {

    public int mark1,mark2;
    public void inputDetails(String name, int roll , int mark1, int mark2){
        super.inputDetails(name, roll);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Marks 1 : "+ this.mark1);
        System.out.println("Marks 2 : "+ this.mark2);
    }

    
}
