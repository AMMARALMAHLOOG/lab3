import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Arabic on 26/01/22.
 */
public class Test {
    public static void main(String[] args) {
        ArrayStack<Integer> mystack=new ArrayStack<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("is sack empty ?"+mystack.isEmpty());
        System.out.println("input stack elelment");
        for (int i = 0; i <5 ; i++) {
            mystack.push(in.nextInt());
            System.out.println("top= "+mystack.top());
            System.out.println("size"+mystack.size());
            System.out.println("is sack empty ?"+mystack.isEmpty());
        }


        while (!mystack.isEmpty()){
            System.out.println("delet = "+mystack.pop());
            System.out.println("after delete top= "+mystack.top());
            System.out.println("size= "+mystack.size());
            System.out.println("is sack empty ?"+mystack.isEmpty());
        }
    }
}
