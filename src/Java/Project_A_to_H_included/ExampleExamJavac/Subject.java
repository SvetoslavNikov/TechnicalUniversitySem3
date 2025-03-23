package Java.Project_A_to_H_included.ExampleExamJavac;

public enum Subject {
    SPORT(0), MATEMATIKA(1), ALGORITMI(2), BAZI_DANNI(3), MREJI(4), ELEKTRONIKA(5), DESIGN(6);
    private final int code;
    Subject(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

}
