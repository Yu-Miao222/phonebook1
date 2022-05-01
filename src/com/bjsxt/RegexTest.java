package com.bjsxt;

public class RegexTest {
    public static void main(String[] args) {
        //String regex = "[^ab]{2,4}";

        /*String regex = "\\d*";
        String content = "1";*/

        /*String regex = "[a-z]{1}\\w{3,8}";
        String content = "a123sdf";*/

        String regex = "(\\d{3,4})-(\\d{7,8})";  //加上括号和不加括号没区别 只是代码的可读性更强
        String content = "010-1245689";
        System.out.println(content.matches(regex));

    }
}
