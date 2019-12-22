package errorAndException_yiwa;

public class Test_Throw {
    public static void main(String[] args) {
        Student s = new Student();
        s.regist(1);
        s.setName("name");
        System.out.println(s.toString());
    }

}

class Student {
    private int id;
    private String name;
    public void setName(Object name){
        if (name instanceof String){
            this.name= (String) name;
        }
        else
            throw new MytestException("名字赋值非法 必须为字符串");
    }
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
                ", name='" + name + '\'' +
                '}';
    }
}