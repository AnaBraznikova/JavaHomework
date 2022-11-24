package org.example.stringLesson;

public class StringHomework {


    /*First level: 1 Создайте строку через new - I study Basic Java!
2 Напишите метод, который принимает в качестве параметра строку, передайте
в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5 Заменить все символы “а” на “о”.
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().

     */
    public static void main(String[] args) {

    String string = new String("I study Basic Java!");

    demonstrateString(string);



}
    static void demonstrateString(String string) {
        int lastSymbolIndex = string.length() - 1;
        System.out.println(string.charAt(lastSymbolIndex));     // !
        boolean containsJava = string.contains("Java");
        System.out.println(containsJava);    // true
        String strWithoutA = string.replace('a', 'o');
        System.out.println(strWithoutA);  // I study Bosic Jovo
        System.out.println(string.toUpperCase()); //I STUDY BASIC JAVA!
        System.out.println(string.toLowerCase()); //i study basic java!

        String strWithoutJava = string.substring(14,18);
        System.out.println(strWithoutJava); //Java




    }


    }


