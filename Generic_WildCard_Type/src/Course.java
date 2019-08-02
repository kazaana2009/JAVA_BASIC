import java.util.Objects;

public class Course <T>  {
    private String name;
    private T[] students;

    public Course(String name ,int capacity) {  //capacity 하나의 과목을 학생이 얼마나 수강할수있는지 ...
        this.name = name;
        students = (T[]) new Objects[capacity]; //아직 T타입이 결정안된상태에서 오브젝트배열을 만들고 T타입으로 강제 캐스팅
    }

    public String getName() {
        return name;
    }

    public T[] getStudents() {
        return students;
    }

    //T타입의 객채가 들어와서 student에 저장한다.
    public void add(T t){
        for(int i=0;i<students.length;i++){
            if(students[i]==null) {
                students[i] = t;
                break;
            }
        }
    }
}
