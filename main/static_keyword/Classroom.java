package static_keyword;

public class Classroom {

        private String studentId;
        private int age;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static int count = 0 ;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Classroom.count = count;
    }

    public Classroom (){
             count++;
        }

        static {
            System.out.println("your call from ClassRoom ");
        }


}
