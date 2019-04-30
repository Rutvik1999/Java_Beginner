class UserExceptionThread extends Thread implements Runnable 
{

    UserExceptionThread(String name)
    {
        super(name);
    }

    @Override
    public void run() 
    {
        try 
        {
            if (getName().equals("One")) 
            {
                throw new UserException("Exception : One as a name is not allowed");
            }
            System.out.println(getName());
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

public class MThP9
{
    public static void main(String[] args){
        UserExceptionThread u1 = new UserExceptionThread("One");
        UserExceptionThread u2 = new UserExceptionThread("Two");
        UserExceptionThread u3 = new UserExceptionThread("Three");
        UserExceptionThread u4 = new UserExceptionThread("Four");
        UserExceptionThread u5 = new UserExceptionThread("Five");

        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u5.start();
    }
}

class UserException extends Exception
{

    UserException(String s)
    {
        super(s);
    }

    @Override
    public String toString() 
    {
        return super.toString();
    }
}