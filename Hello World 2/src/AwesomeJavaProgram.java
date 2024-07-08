public class AwesomeJavaProgram {
    public static void main(String[] args){
        int myInt = 7;
        double shoeSize = 9.5;
        char myInitial = 'j';

        String myName = "Jan";
        System.out.println(myName.length());
        String name = burp(myName);
        System.out.println(name);
        Cat.dingDong();

        Cat myCat = new Cat();
        myCat.name = "Fred";
        myCat.age = 6;

        System.out.println(myCat.name);
    }
    private static String burp(String name){
        return "My name is " + name;
    }
}
