//unchecked exceptions - the program can run, but it will eventually shut down.
//checked exceptions - gets shut down at compile time

class exclass{
    static void exception() throws NoClassDefFoundError{ // if you know that you will have checked exception you have to add throws
        System.out.println("sth");
        throw new NoClassDefFoundError();
    }
}
class Randomclass{
    static void exceptionStaff(){
        try {
            throw new NullPointerException();

        }catch (NullPointerException e){
            System.out.println("THis exception was caught inside of a method");
            throw e;
        }

    }
}



public class Main {
    public static void main(String[] args) {

        //with throw keyword we can create our own exceptions
        try{
            Randomclass.exceptionStaff();

        }catch(NullPointerException e){
            System.out.println("It was caught in outer try statement ");
        }

        try{
            exclass.exception();

        }catch(NoClassDefFoundError e){
            System.out.println("Bypassed error ");
        }finally { //The finally statement lets you execute code, after try...catch, regardless of the result:
            System.out.println("Finally always run ");
        }


        //when you throw checked exceptions you have to handle them right ofd the bat because they are checked at compile time
    }
}