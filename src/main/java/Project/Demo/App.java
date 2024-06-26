package Project.Demo;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( System.getProperty("user.dir") );
        System.out.println( System.getProperty("user.home") );
        System.out.println(File.separator);
    }
}
