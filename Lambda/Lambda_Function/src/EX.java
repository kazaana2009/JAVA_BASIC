import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class EX {
    private static List<Student>  list= Arrays.asList(
            new Student("홍길동", 90, 100),
            new Student("똥개", 95, 95)
    );

     public static void PirngString(Function<Student,String> function){
        for(Student student:list){
            System.out.print(function.apply(student )+" ");
        }
        System.out.println();
    }

    public static void PrintInt(ToIntFunction<Student> function){
        for(Student student:list){
            System.out.print(function.applyAsInt(student)+" ");  //정수값을 리턴해서 출력
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("[학생이름]");
        PirngString(t->{
            return t.getName();
        });





    }
}
