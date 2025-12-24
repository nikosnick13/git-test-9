package gr.aueb.cf.testgit;

public class DivApp {

    public static void main(String[] args) {
        System.out.println( division(10,2));
    }

    public static int division(int a, int b){
        if(a == 0) return -1;
        return a / b;
    }
}
