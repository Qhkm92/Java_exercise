package com.Qaiyyum;

public class Main {

    public static void main(String[] args) {
        Student9.change();

        Student9 s1 = new Student9(111, "Siti");
        Student9 s2 = new Student9(222, "Qaiyyum");
        Student9 s3 = new Student9(333, "test");

        s1.display();
        s2.display();
        s3.display();


    }
}

    class Student9{
        int rollNo;
        String name;
        static String college = "ITS";


        static void change(){
            college = "Keio";
        }

        Student9(int r, String n) {
            this.rollNo = r;
            this.name = n;
        }

        void display(){
            System.out.println(rollNo + name + college);
        }
    }

