package errorAndException_yiwa;

public class testError {
    public static void main(String[] args) {
        //1.栈溢出java.lang.StackOverflowError
//        main(args);
        //2堆溢出：java.lang.OutOfMemoryError: Java heap space
        Integer[] arr=new Integer[1024*1024*1024];
    }
}
