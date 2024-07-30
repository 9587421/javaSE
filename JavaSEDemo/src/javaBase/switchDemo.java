package javaBase;

import java.util.Scanner;
public class switchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入该学生成绩：");
        int score = input.nextInt();
        if(score <0 || score >100){//输入的整数范围应为0-100
            System.out.println("输入的成绩有误");
            return;
        }
        switch(score/10){
            case 10:
            case 9:
                System.out.println("该学生成绩优秀");
                break;
            case 8:
                System.out.println("该学生成绩良好");
                break;
            case 7:
                System.out.println("该学生成绩中等");
                break;
            case 6:
                System.out.println("该学生成绩基本合格");
                break;
            default:
                System.out.println("该学生成绩不合格");

        }
    }
}
