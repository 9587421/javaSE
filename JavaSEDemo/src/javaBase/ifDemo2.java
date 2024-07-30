package javaBase;

import java.util.Scanner;

public class ifDemo2{
    public static void main(String[] args) {
        //多重if选择结构

        //1、声明Scanner
        Scanner input = new Scanner(System.in);

        //2、接收用户输入的时间
        System.out.println("请输入你几个小时没喝水了：");
        int num = input.nextInt();

        //3、使用多重if选择结构进行判断

        //声明变量存放判定的结果
        String result="";
        //91~100这个范围
        if(num >=48 && num <=72){
            result="大口喝水";
        }else if(num >=24 && num <=48){
            result="中口喝水";
        }else if(num >=12 && num <=24){
            result="小口喝水";
        }else if(num >=0 && num <=12){
            result="想喝就喝，不想喝就不喝。";
        }else{
            result="......你渴死了，不用喝了。";
        }
        System.out.println("你应该"+result);;
    }
}