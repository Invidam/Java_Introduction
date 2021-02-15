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

# .class밖에 안남음 .java는 어디간거?;;