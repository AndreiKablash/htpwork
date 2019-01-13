package com.htp.lessons.lesson8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@MyAnn(value = "class")
    public class task {
        public static int m(Integer v) {
            return v;
        }

        public static void main(String[] args) {
            String str = "fkjrfrfkrefppprkrjxxxkzzjjfirfjfjzlszlfepxxfprfkgporkgxxerogkervkrokvrovkrevkroerorkvjrierigjvne";
            System.out.println(str.lastIndexOf("z"));
            System.out.println(str.replaceAll("xx", "QQ"));
            Integer in = new Integer(100);
            int i = in.intValue();
            System.out.println(in + " " + i);
            Integer o = 120;
            int r = o;
            System.out.println(o + " " + r);

            Integer ob = m(400);
            System.out.println(ob);

            System.out.println("tttr");
            Integer iob, iob1;
            int t;
            iob=100;
            System.out.println(iob);
            ++iob;
            System.out.println(iob);
            iob1=iob+(iob/3);
            System.out.println(iob1);
            i=iob+iob1;
            System.out.println(i);
            Double dob=98.2;
            dob=dob+iob;
            i= (int) (dob+iob);
            System.out.println(dob);
            switch(iob){
                case 100:
                    System.out.println(100);
                    break;
                case 200:
                    System.out.println(200);
                    break;
                default:
                    System.out.println(" frfrf");
                    break;
            }


            @MyAnn(value = "some")
            Integer rt =1000;
            int y = rt.byteValue();
            System.out.println(y);

           // task tsk = new task();
            System.out.println("");
            System.out.println("some methods");
            Class1 clss = new Class1();
            Class clss1 = clss.getClass();
            System.out.println(clss.getClass().getName());
            Method[] methods = clss1.getDeclaredMethods();
                for (Method method: methods
                     ) {
                    System.out.println(clss1.getMethods());
                }
            }


        }



@MyAnn(value = "Class class")
class Class1{
    private int i;

    public Class1() {
    }

    @MyAnn(value = "constructor")
    public Class1(int i) {
        this.i = i;
    }
    @MyAnn(value = "someMethod")
    public String someMethod(String s){
        System.out.println(s);
        return s;
    }

    public void someMethod2(){
        System.out.println("method 2");
    }



}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
boolean bool() default true;
String str() default " string";
String value();
        }