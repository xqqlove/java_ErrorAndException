package errorAndException_yiwa;

public class Test_Throw {
    public static void main(String[] args) {
        Student s = new Student();
        s.regist(-1);
        System.out.println(s.toString());
    }

}

class Student {
    private int id;

    public int regist(int id) {
        if (id > 0) {
            this.id = id;
            return this.id;
        } else
//            System.out.println("输入非法的数据");
        throw new RuntimeException("输入非法的数据！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}