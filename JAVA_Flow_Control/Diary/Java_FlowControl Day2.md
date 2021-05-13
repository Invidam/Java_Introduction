# Java_FlowControl Day2
 
## 3. Conditional Operator (조건문)

+ `if(boolean) {내용}`
    + boolean이 항상 false면 dead code라고 뜬다.
+ && || 배웠다.
    
    
## 4. equals VS == (조건문)
+ 데이터 타입
    + primative : 원시 데이터 타입
        + boolean int double short long float char
    + non primative : 비 원시 데이터 타입
        + String Array Date File . . .
    + 차이점
        + primative type은 여러 변수가 같은 값을 가진다면 같은 곳을 가리킬 수 있다.
        + non primative type은 여러 변수가 같은 값을 가지더라도 다른 곳을 가리킨다.
            + 문자열은 예외 (new를 했을 경우만 non primative처럼 작동)

+ String 비교
    + == : 변수가 같은 곳을 가리키는지 비교.
    + s1.equals(s2) : 변수의 값들이 같은지 비교.
    
+ primative : == 사용
+ non primative : equals 사용
+ 비교할 일 있으면, 비교방법을 검색해볼 것.


## 5. Loop & Array

## Loop
+ while, for문 배웠다.
    + while문은 여러 조건들의 변수들이 떨어져 있어, 망가질 가능성이 있다.
    + 반면, for문은 응집되어 있어 문제가 생길 가능성이 적고 의도파악이 가능하다.
    
## Array
+ `arr[Index] = Element`
    
