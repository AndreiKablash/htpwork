package com.htp.lessons.lesson9;

public class Demo {
    public static void main(String[] args) {
        try {
            new Demo().calculation(0);
        } catch (Exception e) {
            System.out.println("I've handled it ");
        }
    }

    public void calculation(int i) throws Exception{
        try {
            try{
                throw new Exception("Inner Runtime Exception");
            }catch(ArithmeticException e){
                throw new Exception("Inner Handling ArithmeticException");
            }
        }catch(ArithmeticException e){
            System.out.println("Checked ArithmeticException");
        } catch(RuntimeException e){
            System.out.println("Checked runtimeException");
            throw new RuntimeException("New Message + old message");
        } catch (Exception e){
            System.out.println("Checked exception");
            throw new Exception("throw new Exception");
        } finally{
            System.out.println("I'm in finally block!");
        }
    }
}
