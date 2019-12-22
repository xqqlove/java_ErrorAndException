package errorAndException_yiwa;

public class MytestException extends RuntimeException {
   public MytestException(){
       super();
   }
   public MytestException(String msg){
       super(msg);
   }
}
