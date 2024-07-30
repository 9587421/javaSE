package javaBase;

import java.util.Scanner;
public class ifDemo3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //嵌套if选择结构
        Scanner input = new Scanner(System.in);

        System.out.println("请输入你的性别：F/M");
        char gender = input.next().charAt(0);
        //先判断性别：
        if(gender == 'F'){
            //输入婚否
            System.out.println("你是否成婚？Y/N");
            char is = input.next().charAt(0);
            //判断如果结婚，3月份有半天的假期
            if(is == 'Y'){
                System.out.println("即将到来的三月份，您有半天的假期！");
            }else{
                System.out.println("暂时还不具备休女神假期的资格！");
            }
        }else{
            System.out.println("您是男士，这个假与你无关！");
        }
    }
}
