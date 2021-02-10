package com.company;
public class MainClass extends Student {
    public void getDecription(){
        System.out.println("Rekha is bijuaaa");
    }


    public static void main(String[] args) {
        MainClass obj = new MainClass();
        obj.getDecription();


    }
}

//create a cls Student the write:

package com.company;
public class Student {
    String name;
    public  void getDecription(){
        System.out.println(name);
    }

    public static void main(String[] args) {

    }
}



