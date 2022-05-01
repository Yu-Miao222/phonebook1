package com.bjsxt;

import javax.swing.*;
import java.util.Scanner;

/**
 * 数据校验类
 */

public class TelNoteRegex {
    /**
     * 对菜单输入选项的验证
     * @param min
     * @param max
     * @return
     */
    public int menuItemValidate (int min, int max) {
        //定义验证菜单项的正则表达式
        String regex = "[1-9]{1}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter item number,min:"+min+"\t"+"max:"+max);
            String input = scanner.nextLine();
            if (input.matches(regex)){
                int inputNum = Integer.parseInt(input);
                if(inputNum>= min && inputNum <= max){
                    return inputNum;
                }else{
                    System.out.println("Invalid item number,please try again！");
                }

            }else{
                System.out.println("Invalid number ，please check！");
            }

        }

    }


    /**
     * 对用户输入姓名验证
     * 字母可以是大写或者小写，长度1-10之间
     * @return
     */
    public String nameValidate(){
        //验证姓名的正则表达式
        String regex = "[a-zA-Z]{1,10}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter name , uppercase or lowercase letter, length from 1 to 10.");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else{
                System.out.println("Wrong name,please try again！");
            }
        }

    }

    /**
     * 对用户输入年龄验证
     * 年龄的格式要求是：10-99之间的
     * @return
     */
    public String ageValidate(){
        //验证年龄正则表达式
        String regex = "[1-9]{1}[0-9]{1}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter age：from 10 to 99.");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else{
                System.out.println("Age format error ,please try again");
            }

        }

    }


    /**
     * 对用户输入性别验证
     * 性别的输入要求：男（m或M）女（f或F）
     * @return
     */
    public String genderValidate(){
        //验证性别正则表达式
        String regex = "[m|M|f|F]{1}";
        //创建scanner对象
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter gender ：（ m or M）（ f or F）");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else{
                System.out.println("Gender format error , please try again!");
            }
        }

    }

    /**
     * 对用户输入电话号码验证
     * 电话号码要求：允许带有区号的做记号，允许手机号
     * @return
     */
    public String telNumValidate(){
        //对电话号码验证正则表达式
        String regex = "(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter tel-number：mobile or home");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }
            else{
                System.out.println("Invalid tel-number,please try again");
            }
        }

    }

    /**
     * 对用户输入地址验证
     * 地址格式要求：字母或者是数字，长度1，50
     * @return
     */
    public String addressValidate(){
        //输入地址正则表达式
        String  regex ="\\w{1,50}";
        //创建 scanner对象
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please enter address：alphabet or number，length from 1 to 50");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else{
                System.out.println("Address format error,please try again!");
            }
        }

    }

    public static void main(String[] args) {
        TelNoteRegex regex = new TelNoteRegex();
        /*int menuItem = regex.menuItemValidate(1, 6);
        System.out.println(menuItem);*/

        /*String name = regex.nameValidate();
        System.out.println(name);*/

        /*String age = regex.ageValidate();
        System.out.println(age);*/

        /*String gender = regex.genderValidate();
        System.out.println(gender);*/

/*
        String telNumber = regex.telNumValidate();
        System.out.println(telNumber);
*/


        String address = regex.addressValidate();
        System.out.println(address);





    }

}
