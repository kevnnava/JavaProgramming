package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static & final by default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    void play(); // abstract by default
    // bc of  JDK version 8 or below it was the only method that the interface could have

}
