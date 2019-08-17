import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EX {
    //데이터 생성
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", "남", 100),
            new Student("둘리", "남", 90),
            new Student("시리", "여", 96),
            new Student("순자", "여", 90)
    );
    //평균(남자일경우 , 여자일경우)
    public static double avg(Predicate<Student> predicate){
        int sum=0;
        int count=0;

        for(Student student:list){
            if(predicate.test(student)){  //뭔가를 조사해서 Ture , False 를 리턴해준다.
                count++;
                sum+=student.getScore();  //만약 남자일경우 남자 Score만 더해준다.
            }
        }
        return (double)sum/count;
    }

    public static void main(String[] args) {
        double manavg =avg(t->t.getSex().equals("남"));  //남자일경우만 평균일 낸다.
        System.out.println("남자 평균: "+manavg);

        double womanavg = avg(t->t.getSex().equals("여"));
        System.out.println("여자 평균: "+womanavg);


    }
}
