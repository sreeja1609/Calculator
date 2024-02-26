import java.util.*;
class Calci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(add(num1, num2));
        System.out.println(sub(num1, num2));
        sc.close();
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }
}
