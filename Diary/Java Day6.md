# Java Day 6


## 14. 나의 앱 만들기 2

### Method : 서로 연관된 코드를 이름을 붙여 정리정돈하는 상자.
    + 함수와 비슷하다.

+ class안에 method가 있다. main method, etc method가 있다.
    + class와 method에도 전역변수 지역변수의 개념이 존재한다.
    
+ 메소드 선언 : 
```
    public static double getVAT(double valueOfSupply, double vatRate)
    {
        return valueOfSupply * vatRate;
    }
```
+ 전역변수 선언 : `public static doule vatRate = 0.1;`



### Class (Object) : 서로 연관된 변수와 메소드를 그루핑한 것.
    + 이름을 붙이는 것
    + 정리정돈의 상자
    + 구조, 뼈대의 역할
    
    
### Instance : 하나의 클래스를 복제하여 서로 다른 Data의 Value와 서로 같은 Method를 가진 복제본을 만드는 것.
+ 선언 : `Class1 c1 = new Class()`
+ c++의 class 생성자와 비슷하다.



## 15. 수업을 마치며