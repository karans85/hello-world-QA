public class HelloWorldApp {

public String getGreeting(){

    return "Hello World!";

}

public static void main (String[] args){

    System.out.println(new HelloWorldApp().getGreeting());
}
}