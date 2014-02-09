import java.util.Scanner;
 
public class Test {
 
public static Scanner input = new Scanner(System.in);
 
public static int mem(int x, int y) {
        if (y > x)
                return 0;
        return (1 + mem(x-y, y));
}
 
public static String toNewBase(int b10Num, int newBase) {
        String result = "";
        int f = b10Num;
        while (f != 0)
        {
                result = catchBinaryOverflow(String.valueOf(f % newBase)) + result;
                f = mem(f, newBase);
        }
        result = catchBinaryOverflow(String.valueOf(f % newBase)) + result;
        return result;
}
public static String catchBinaryOverflow(String s) {
        if (s.equals("10"))
                return "A";
        if (s.equals("11"))
                return "B";
        if (s.equals("12"))
                return "C";
        if (s.equals("13"))
                return "D";
        if (s.equals("14"))
                return "E";
        if (s.equals("15"))
                return "F";
        else
                return s;
}
public static void main(String[] args) {
        System.out.println("Enter a number in base ten.");
        int num = input.nextInt();
        System.out.println("Enter a base to convert to.");
        int nb = input.nextInt();
        String newnum = toNewBase(num, nb);
        System.out.println("Your new number is: "+newnum);
}
 
}