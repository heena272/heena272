package E2EFramework.ISOWebsite;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Base baseObject = new Base();
        baseObject.invokeBrowser();
        
    }
}
