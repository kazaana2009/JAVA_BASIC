import java.util.function.IntBinaryOperator;

public class EX {

    private static int[] score={92,97,93};

    public static int MaxOrMin(IntBinaryOperator operator){
        int result =score[0]; //0번쨰 배열 선택
        for(int score :score){
            result=operator.applyAsInt(result, score); //0번째 배열과 비교해서 큰값을 리턴해준다. ex 92->97->93 순
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 구하기
        int max=MaxOrMin((a,b)->{
            if(a>=b) return a;
            else return b;
        });
        System.out.println("max값: "+max);

        //최소값 구하기
        int min=MaxOrMin((a,b)->{
            if(a<=b) return a;
            else return b;
        });
        System.out.println("min값: "+min);
    }
}
