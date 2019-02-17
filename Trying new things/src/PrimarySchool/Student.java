package PrimarySchool;

public class Student extends classroom{
    private String name;
    public String surname;
    private int mathscore;
    private int sciscore;
    private int engscore;

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void grademath(int score){
        this.mathscore = score;
    }
    public void gradesci(int score){
        this.sciscore = score;
    }
    public void gradeeng(int score){
        this.engscore = score;
    }
}
