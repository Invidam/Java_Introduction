# Java Day 4













## 11. 내 힘으로 컴파일
+ java source -> java class -> run

+ java, javac.exe가 java ~, javac ~ 명령어를 실행할 때 사용되는 파일이다.

+ readlink -f $(which java) : java의 위치를 보여준다.
    + 구름IDE에서는 안보이게 해놓았다.

+ 내컴퓨터 -> 속성 -> 고급 설정 -> 환경 변수 -> java의 디렉토리 경로가 설정되어 있다.

+ java ~ 명령어를 치면 java파일을 환경변수에서 찾는다.

+ 다른 프로젝트에서, 읽지 못했을 때 `.bash_profile`에서 경로를 추가시키면 된다.
    + 리눅스 환경 변수 설정에서이다.
    
    
+ 실제로는 
    + 1. 소스 파일 생성
        + 서브 프로젝트 생성 후 bin, src, jar 폴더 생성
    + 2. javac Main.java 로 .class 생성하여 Compile
    + 3. src로 이동후 java project.Main or java project/Main으로 Run
    + 4. 소스 파일의 내용이 Virtual Machine에 의해 해석
    + 5. 컴퓨터상에 출력
    
+ java/Main 에서, import는 여러 라이브러리를 import하는 것이다.
    + src/org/ . . ./iot의 .java파일들을 javac(compile)해야 class가 생성되고 class가 있어야 run이 가능하다.
    
+ `javac --class-path = javac -cp <path> <source>`  (java폴더에서)
    + `<path>`에 있는 것들을 라이브러리로 삼아 source file을 compile 한다.
    + `<path>` : .:lib   (window = ';' , 나머지 = ':')
    + `<source>` : 정확히 입력해야함. (./src/project/OK.java)
        + `javac -cp ".:lib" ./src/project/OK.java`
    
+ `java -cp ".:../lib" project.OK`
    + `<path>`에서, ".:../lib" : .과 ../lib을 읽는다는 것을 의미.
        + :은 구분선의 느낌.
        
        
+ String args[]에 값을 줘서 코드를 실행시킬 수 있따.
    + java ~~ "args[0]에 들어갈 내용" "args[1]에 들어갈 내용" 
    
    
## 12. 자바 문서 보는 법

+ Computer -> OS -> Java(data,system,math,printwriter) -[API]-> Java Program -> ... -[UI]-> Program
    + API 
        + Application Programming Interface : 프로그램을 만드는 과정에서, 기능구현을 위해 조작하게 되는 언어의 기능들.
            + API문서 : 프로그램 만들 때, 이 언어에서 무엇을 어떻게 사용하는 지를 적어놓은 것.
    + UI   
        + User Interface : 사용자가 프로그램을 조작하기 위해 사용하는 인터페이스

+ API문서,
    + 좌상단 : package목록
    + 좌하단 : class목록
        
    + package : class들을 정리정돈해놓은 것.
    + class : 서로 연관된 변수 + Method(클래스 안의 함수)를 묶어 놓은 것.
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        