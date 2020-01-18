package _java._se._01._start;

/**
 * Created by user on 18.01.2020.
 */
public class Modificatorspublic {
    public static void main(String[] args){
        AboutJava obj = new AboutJava();
        String s1 = obj.getAboutJava();
        String s2 = obj.info();
    }
}
class AboutJava{
    public String getAboutJava(){
        return info();
    }
    private String info(){
        return "About Java.";
    }
}
