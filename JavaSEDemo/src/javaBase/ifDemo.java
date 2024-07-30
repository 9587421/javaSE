package javaBase;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//变量声明，创建Scanner对象
        System.out.println("你好，我将为你分析你的成绩");
        System.out.println("请输入你的成绩：");//提示语
        int score = input.nextInt();//接收数据

        if (score >= 60) {
            System.out.println("你不及格，准备补考吧你！");
        }else{
            System.out.println("你及格了，好好玩去吧！");
        }
        System.out.println("下次将会推出喝水教学，灌注我，我将满足你");
    }
}