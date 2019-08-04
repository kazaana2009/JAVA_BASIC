import java.util.Arrays;

public class EX {
    public static void RegisterCourse(Course<?> course){
        System.out.println(course.getName() +"수강생"+ Arrays.toString(course.getStudents()));
    }
    //Student 나  HighStudent 만 올수있다.
    public static void RegisterCourseStudent(Course<? extends Student> course){
        System.out.println(course.getName() +"수강생"+ Arrays.toString(course.getStudents()));
    }
    //Student나 Person이 올수 있다.
    public static void RegisterCourseWorker(Course<? super Student> course){
        System.out.println(course.getName() +"수강생"+ Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        //제한이 없는 경우
       //RegisterCourse(new Course<Person>("일반인 과정",5));
       //RegisterCourse(new Course<Student>("학생 과정",5));
       //RegisterCourse(new Course<Worker>("근로자 과정",5));
       //RegisterCourse(new Course<HighStudent>("고등학생 과정",5));

       //상위 클래스 제한
       //RegisterCourseStudent(new Course<Student>("학생 과정",5));
       //RegisterCourseStudent(new Course<HighStudent>("고등학생 과정",5));

       //하위 클래스 제한
       // RegisterCourseWorker(new Course<Person>("일반인 과정",5));
       // RegisterCourseWorker(new Course<Student>("학생 과정",5));
       //일반인 과정
       Course<Person>personCourse =new Course<Person>("일반인 과정",5);

       personCourse.add(new Person("일반인"));
       personCourse.add(new Person("직장인"));
       personCourse.add(new Person("학생"));
       personCourse.add(new Person("고등학생"));

       //근로자 코스
       Course<Worker>workerCourse =new Course<>("직장인과정",5);
       workerCourse.add(new Worker("직장인"));

       //학생코스
        Course<Student>studentCourse =new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("학생"));

        //고등학생의 과정
        Course<HighStudent>highStudentCourse =new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));


        RegisterCourse(personCourse);
        //RegisterCourse(workerCourse);
       // RegisterCourse(studentCourse);
       // RegisterCourse(highStudentCourse);


    }

}
