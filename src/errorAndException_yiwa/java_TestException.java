package errorAndException_yiwa;

import com.sun.org.apache.bcel.internal.generic.LDIV;
import org.junit.Test;

import java.io.IOException;

public class java_TestException {
    public static void div(int one, int two) {
        if (two == 0) {
            throw new ArrayIndexOutOfBoundsException("两数相除除数不能为0");
        }
        else
        System.out.println("两数相除结果为：" + one / two);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        div(a, b);
    }

}
