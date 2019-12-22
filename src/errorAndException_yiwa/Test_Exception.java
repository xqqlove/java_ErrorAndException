package errorAndException_yiwa;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test_Exception {
    @Test
    public void test1() {
        int[] arr = null;
        System.out.println(arr[3]);
    }
    @Test
    public void test2(){
//        String s=new String("abc");
//        System.out.println(s.charAt(3));
        char arr[]=new char[]{'1','2','3'};
        System.out.println(arr[3]);
    }
    @Test
    public void in(){
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();
        System.out.println(score);
        scanner.close();
    }

    @Test
    public void test() throws Exception{
        File file =new File("hello.txt");

            FileInputStream fis=new FileInputStream(file);
            int data=fis.read();
            while (data!=-1){
                System.out.println(data);
                data=fis.read();
            }
            fis.close();

    }
    public int  hello(){
        try {
            int i=0;
            int x=0;
            int y=i/x;
            return 1;
        } catch (ArithmeticException e) {
            System.out.println("我出了异常");
            return 2;
        }finally {
            System.out.println("我必须执行");
            return 3;
        }
    }
    @Test
    public void test8(){
        int x=hello();
        System.out.println(x);
    }

    public static int t(){
        int i=99;
        try {
            System.out.println("try block");
//            i=1/0;
            return 1;
        } catch (Exception e) {
            System.out.println(" catch block");
            i=100;
            return i;
        } finally {
            System.out.println("finally block");
            try {
                i=200/0;
            } catch (Exception e) {
                System.out.println("finally Exception");
                return 3;
            }
        }
    }
    @Test
    public void sus(){
        System.out.println(t());
    }
    /**
     * 对于这种情况我的理解就是在 return的时候会把返回值压入栈，并把返回值赋值给
     * 栈中的局部变量， 最后把栈顶的变量值作为函数返回值。所以在 finally中的返回
     * 值就会覆盖 try/catch中的返回值，如果 finally中不执行 return语句，
     * 在 finally中修改返回变量的值，不会影响返回结果。
     *
     */

}
