package _java._se._01._start;

/**
 * Created by user on 18.01.2020.
 */
public class CommandArg {
    public static void main(String[] args){
        for(int i=0; i<args.length; i++){
            System.out.println("Аргумент " + i + " = " + args[i]);
        }
    }
}
