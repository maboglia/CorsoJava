package esempio;

public class ClearConsole {
public static void main(String[] args) {
System.out.println("bla bla");	
System.out.println("bla bla");	
System.out.println("bla bla");	
System.out.println("bla bla");	
System.out.println("bla bla");	
clearConsole();
}

public final static void clearConsole()
{
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
            
        }
        else
        {
            Runtime.getRuntime().exec("clear");
            System.out.println(".....");
        }
    }
    catch (final Exception e)
    {
        e.getMessage();//  Handle any exceptions.
    }
}
}
