package GITProjects;

class Add {
    int num1;
    int num2;

    Add(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public void add() {
        System.out.println(this.num1 +this.num2);
    }
}

public class Calculation{
    public static void main(String[] args){

    Add a = new Add(1,2);
    a.add();

    }
}

