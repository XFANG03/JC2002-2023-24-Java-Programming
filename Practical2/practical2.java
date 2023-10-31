package pratical;
import java.util.Scanner;
public class practical2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int a  = start;
        if(start>end){
            System.out.println("false");
        }
        else{
            while(start < end){
                a = a+start+1;
                start = start+1;
            }
            System.out.println(a);
        }

        


    }
}
