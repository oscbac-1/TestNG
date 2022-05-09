package Main;

import org.testng.annotations.Test;

public class Main {
    @Test
    void setup(){
        System.out.println("Hello Setup");
    }
    @Test
    void login(){
        System.out.println("Hello login");
}
    @Test
    void tearDown() {
        System.out.println("Hello login");
    }
}