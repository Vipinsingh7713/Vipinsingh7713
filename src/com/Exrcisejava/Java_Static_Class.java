package com.Exrcisejava;

public class Java_Static_Class {

        private static String s= "Javatpoint";
        //Static and nested class
        static class StaticNestedClass
        {
            //non-static method of the nested class
            public void show()
            {
//prints the string defined in base class
                System.out.println(s);
            }
        }
        public static void main(String args[])
        {
            Java_Static_Class.StaticNestedClass obj = new Java_Static_Class.StaticNestedClass();
//invoking the method of the nested class
            obj.show();
        }
    }

