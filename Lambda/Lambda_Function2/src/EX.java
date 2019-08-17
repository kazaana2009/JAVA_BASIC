import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class EX {
    private static List<Student>  list= Arrays.asList(
            new Student("홍길동", 90, 100),
            new Student("똥개", 95, 95)
    );



    public static double avg(ToIntFunction<Student> function){
        int sum =0;
        for(Student student:list){
            sum+=function.applyAsInt(student);
        }
        double avg=(double)sum/list.size();
        return avg;
    }

    public static void main(String[] args) {
        double engavg=avg(t-> t.getEnglishScore());
        System.out.println("영어 평균점수 "+engavg);

        double mathavg = avg(t->t.getMathScore());
        System.out.println("수학 평균점수 "+mathavg);
    }


}
