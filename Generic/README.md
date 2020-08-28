# Generic(제네릭)


## 제네릭이란?
- 타입을 파리미터화 해서컴파일시 구체적인 타입이 결정 되도럭 하는것.
- 컬랙션 , 람다식(함수적 인터페이스) , 스트림 ,NIO에서 널리 사용된다.
- 제네릭을 모르면 도큐먼트를 해석할 수 없다.
- 제네릭을 사용함 으로서 얻는 이점
	1. 컴파일시 강한 타입체크를 할 수 있다.
		실행시 타입에러가 나는것보다는 컴파일시에 미리 타입을 강하게 체크해서 에러를 사전에 방지함
	2. 타입변환을 제거할 수 있다.

## Generic 표기법 
- 기본
   	ex) 
		```
		public class 클라스명 <T>{}
           	pubic interface 인터페이스명<T>{}
		```


## Generic Type(제네릭 타입)

- 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
- 제네릭 타입을 사용하지 않을경우 Object 타입을 사용 하므로서 빈번한 타입변환 발생 -> 성능저하 발생!
- Generic_Basic 코드 참조하면 무슨말이지 이해가 될것이다.

## 멀티 타입 파라미터
- 두개이상의 타입 파라미터를 사용해서 선언이 가능
```
	ex) public class<K,V> …{….}
              pubic interface<K,V> ….{….}
```
- Generic_Multi_Pram 코드 참조하면 이해가 된다.

## 제네릭 매소드
- 메개변수 타입과 리턴 타입으로 타입 파라미터를 갖는 메소드를 이야기한다.
```
 	ex) public<타입파라미터> 리턴타입 메소드명(매게변수){}
              public<T> Box><T> boxing(T t){}
                  (메게변수 타입)(리턴)     (메게변수 타입)   
```


- Generic_Method1 패키지 코드 참고사항
```
	Box<Integer> box1= Util.<Integer>boxing(100);
	//boxing 에서 매게타입을 Integer로 줘서 나머지 T값은 Integer
	int val= box1.get();

	Box<String> box2= Util.boxing("홍길동");
	//만약 메게타입을 안주면 유추를한다 (String)
	String str=box2.get();
```

## 제네릭 제한된 타입 파라미터
- 상위 타입의 클래스의 종류만 쓸수있게한다.
- 상위 타입이거나 하위 또는 구현 클래스만 지정할 수 있다.
```
	ex) Public <T extends 상위타입 > 리턴타입 메소드 (매게변수,..._{}
        Ex) public class Util {
    		public static <T extends Number> int compare(T t1,T t2){
        			double v1 = t1.doubleValue();  //Number 의 자식클래스인 double을 사용이 가능하다
        			double v2 = t2.doubleValue();  
        return Double.compare(v1, v2); 
  		  	}
		}
```

## 제네릭의 상속과 구현
- Generic_Extends_implements 소스코드 참고. 이해 하면 장윤진
```
public class ChildProduct<K,V,C> extends Product<K,V> {….}
```

       






