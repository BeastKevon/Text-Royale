import java.io.IOException;
/**
 * Write a description of class Cls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clear
{
    public static void main(String arg[]) throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
