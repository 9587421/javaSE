# javaSE-Springcloud
总结javaSE-Springcloud各个阶段知识点及对应demo。

（整理一下自己学习Java时的心路历程，如果能够重来，我是否还会走上这条路？）

（Java实践课上，老师对我进行过一番批评：纸上得来终觉浅，绝知此事要躬行，不要想着看明白再写代码，先写出来，看报错，错了就改记住这个错误。重要的是先写，写出来才是最重要的。）

（如果你是大一大二学生，看到此文档可以用作阶段课程学习，如果你大三大四了，就别学了，Java就是个坑。火速去学go，python，云原生。ps：2024.7.29）

git操作

找到一个你想要保存的文件夹位置

在cmd中输入

git clone https://github.com/9587421/javaSE-SpringCloud.git

即可获取本文档。

需要下载配置git后进行此操作

[Git的安装与使用教程（超详细！！！）_git.exe安装教程-CSDN博客](https://blog.csdn.net/weixin_44950987/article/details/102619708)

git使用教程

[Git文件管理：Git提交_git 提交-CSDN博客](https://blog.csdn.net/mzgxinhua/article/details/135095373)

git练习

[Learn Git Branching](https://learngitbranching.js.org/?nodemo=&locale=zh_CN)

## 一、Java概述

### 1.Java的安装？

#### 1.下载

进入Oracle官网，寻找所需要的Java版本下载即可。安装Java后安装jdk。

#### 2.配置环境变量

在系统环境变量中，设置JAVA_HOME并设置JDK安装的根目录，并在path环境变量中配置%JAVA_HOME%\bin，%JAVA_HOME%\jre\bin

如果有多个jdk版本，可以在环境变量中设置多个jdk的变量，需要时手动配置根目录用作替换。

[Java详细安装配置教程(Windows)，从下载到配置——Java-1.8(jdk)安装_jre1.8-CSDN博客](https://blog.csdn.net/weixin_45710060/article/details/123315280)

#### 3.为什么要配置系统环境变量

环境变量一般是指在操作系统中用来指定操作系统运行环境的一些参数，如临时文件夹位置和系统文件夹位置等。

环境变量是在操作系统中一个具有特定名字的对象，它包含了一个或者多个应用程序所将使用到的信息。例如Windows和DOS操作系统中的path环境变量，当要求系统运行一个程序而没有告诉它程序所在的完整路径时，系统除了在当前目录下面寻找此程序外，还应到path中指定的路径去找。用户通过设置环境变量，来更好的运行进程。

[为何要配置环境变量？_为什么要配置环境变量-CSDN博客](https://blog.csdn.net/zybb166/article/details/122492724)

### 2.开发工具IDE的选择

看个人习惯，我使用eclipse和idea编写程序，hbuilder X、记事本、vs code来作为查看代码的工具。

[idea 2024 中文最新版破解激活永久（图文详细讲解教程）超级简单（亲测可用）_idea永久激活-CSDN博客](https://blog.csdn.net/qq_54621492/article/details/139903580)

### 3.Java的特点，为什么学习Java

#### 1.Java特点

1. 简单易学（语法简单，上手容易）；
2. 面向对象（封装，继承，多态）；
3. 平台无关性（ Java 虚拟机实现平台无关性）；
4. 支持多线程（ C++ 语言没有内置的多线程机制，因此必须调用操作系统的多线程功能来进行多线程程序设计，而 Java 语言却提供了多线程支持）；
5. 可靠性（具备异常处理和自动内存管理机制）；
6. 安全性（Java 语言本身的设计就提供了多重安全防护机制如访问权限修饰符、限制程序直接访问操作系统资源）；
7. 高效性（通过 Just In Time 编译器等技术的优化，Java 语言的运行效率还是非常不错的）；
8. 支持网络编程并且很方便；
9. 编译与解释并存；

#### 为什么学习Java	

​	但是经历长时间的发展之后各大编程语言已经逐步发展出了一样的特性，面向对象，跨平台，多线程等等。那我们为什么还要选择Java，因为Java作为国内长期开发的首选语言，即使在这个百花齐放的时代，依旧在国内就业市场占据相对较大的岗位需求。

​	同时，世界范围内，Java的生态环境可以说是最为完善的。强大的生态环境造就了Android的辉煌。同样的，Java的生态环境也促就了其居高不下的选用率。即使未来可能走向没落，但不妨碍十年内，它依旧能够占据一席之地。

#### Java基础学习路线

​	JavaSE→JavaEE→Spring→Spring boot→Spring cloud

[人类高质量 Java 学习路线【一条龙版】 - 程序员鱼皮 - 博客园 (cnblogs.com)](https://www.cnblogs.com/yupi/p/15166218.html)

#### Java SE vs Java EE

- Java SE（Java Platform，Standard Edition）: Java 平台标准版，Java 编程语言的基础，它包含了支持 Java 应用程序开发和运行的核心类库以及虚拟机等核心组件。Java SE 可以用于构建桌面应用程序或简单的服务器应用程序。
- Java EE（Java Platform, Enterprise Edition ）：Java 平台企业版，建立在 Java SE 的基础上，包含了支持企业级应用程序开发和部署的标准和规范（比如 Servlet、JSP、EJB、JDBC、JPA、JTA、JavaMail、JMS）。 Java EE 可以用于构建分布式、可移植、健壮、可伸缩和安全的服务端 Java 应用程序，例如 Web 应用程序。

思考：

​	什么是程序？

拓展：

​	Java程序的运行过程？

​	jdk，jre，jvm都是什么东西？

​	学完JavaSE后我对Java有什么理解？

## Java基础

程序：人通过编程语言给机器下达的指令的集合

编程语言：java是其中之一 从机器识别的角度分两类： 

​	 1、编译、解释型：java   c    c#    c++ python等 需要先 编译   在执行时边解释边执行

​	 2、解释型：html   javascript 机器能够直接识别，无需编译

问题：java程序的代码，人认识，但是机器不认识，程序员编写的代码，如何让机器能够认识、执行？ 

机器：只认识 有电、断电 两种状态  使用二进制 0  1 来表示

java程序的执行过程： 

​	1、编写java程序--- 程序员通过java语言把指令编写在.java文件中

​	2、编译java程序--- 相当于翻译官，把程序员认识的.java程序“翻译”成机器能够识别的.class程序 使用Jdk里面的javac.exe编译器来编译、翻译 

​	3、执行.class程序---最终执行的是.class程序 使用jvm来执行.class文件 如何编译、执行的java程序呢？ 只要安装jdk即可。 

​	概念：jdk  java  开发 工具 jdk:  编译器、调试工具、jre   

​	jre:  java运行环境，里面包含，java运行时需要的资源库、jvm  

​	jvm: java  virtual  mation java虚拟机 用来执行java程序

#### 第一个Java程序

[IntelliJ IDEA 如何创建一个 Java 项目_idea创建java项目-CSDN博客](https://blog.csdn.net/promsing/article/details/111225674)

直接在ide中运行即可，无需使用记事本与cmd编译运行。（有打火机为什么还要钻木取火？先学会生火再学习原理，第一个升起火的人可不懂燃点是什么。）

```Java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

### Java基础语法

[Java 基础语法 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-basic-syntax.html)

#### 1.关键字

[【基础篇】Java关键字（超详细）-CSDN博客](https://blog.csdn.net/weixin_43608968/article/details/133978103)

Java中的关键字指的是系统已经占用并且赋予其意义的单词。

就好比1+1=2这个定理一样，1的含义就是1，+的含义就是将两个数字在算术运算过程中相加。

你不能为1赋予新涵义，否则在规则完善的算术运算中无法正确进行运算。

#### 2.标识符

抛开被系统占用的关键字，我们在编程过程中可以自己定义一些自己使用的关键字-标识符。

对于标识符的命名，你可以在规则范围内随意命名，就好像你在编写一篇作文一样。但是想要写好作文，也要遵守一定的规范。

JavaApplication（以这个标识符为例子，多个英文单词组合表达他是做什么用的，每个单词使用首字母大写进行单词间的区分。）

[Java 变量命名规则 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-variable-naming-rules.html)

#### 3.数据类型

[Java 基本数据类型 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-basic-datatypes.html#:~:text=本网页介绍了 Java 语言的八种内置数据类型，包括整数、浮点数、字符和布尔类型，以及它们的存储空间、默认值和取值范围。还提供了一个实例，展示了如何使用包装类的常量来查看数据类型的相关信息。)

数据类型是用来修饰约束你定义的标识符的关键字。

数据类型可以分为两类：基本数据类型和引用数据类型。

基本数据类型有八个，引用数据类型则有很多个日后在学习的过程中可以慢慢积累。

但基本数据类型必须记住。

byte

short

int

long

使用：byte/short/int/long   a=1;

以上四个用于定义整数

float

double

使用：float/double a=1.1;

以上两个用于定义小数

char

使用：char a= ‘男’;

用于定单引号括起来的单个字符，有且仅有一个字符

原理：每一个字符在java中都使用一个十进制的数值来表示  这种字符和数值的对应关系成为ASCII码 每一个汉字以及其他语言的文字，也有一个对应的数值，是unicode  包含着ASCII码 Unicode  称为万国码   支持所有语言的文字 java的底层就使用Unicode。

boolean

自己了解去吧。

引用数据类型

String

String 字符串，是双引号括起来的若干个字符 0到多个 

String  str=""; 

String str="a";  

String str2="abc张王李赵"; 

String str3="100"

#### 4.变量与常量

在编写程序过程中我们所定义的每个标识符都可以被称作变量。

就好比我们在解方程过程中定义的x与y，常量就好比π=3.14一样。

```java
public class Main {
    public static void main(String[] args) {

        int num=1;
        int num2=num;
        System.out.println(num2);//此时num2=1
        num=3;
        num2=num;
        System.out.println(num2);//此时num2=3
    }
}
```

#### 5.Java类与对象

[什么是类和对象？看完这篇就知道-CSDN博客](https://blog.csdn.net/weixin_57011679/article/details/124511149)

java程序的结构：外层class   内层main方法

```java
public class Main {
    public static void main(String[] args) {

    }
}
```

程序的规范：注意缩进每一层都要区分， {}也是。

#### 6.Java运算符与修饰符

[Java 运算符 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-operators.html)

[Java 修饰符 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-modifier-types.html)

#### 7.基础语法问题：

（1）.面向对象的三个基本特征及其含义？

（2）.访问修饰符public，private，protected，以及不写（default）时
的区别？

（3）.下面所示代码块能够正常编译执行的是哪个，不能执行的是什么原因？

```Java
 // 
代码块
1  
short s1 = 1; s1 = s1 + 1; 
// 
代码块
2  
short s1 = 1; s1 += 1;
```

（4）.下面代码块输出结果

```Java
public static void main(String[] args) {
    Integer a = 128, b = 128, c = 127, d = 127;
    System.out.println(a == b);
    System.out.println(c == d);
 }
```

（5）.⽤最有效率的⽅法计算2乘以8？

（6）.&和&&的区别？

（7）.String是Java基本数据类型吗？String类可以继承吗？

（8）.String和StringBuilder、StringBuffer的区别？

（9）.Strings=newString("xyz")创建了⼏个字符串对象？

（10）.Strings="xyz"和Strings=newString("xyz")区别？

（11）.==和equals的区别是什么？

后面四个可以暂时看看。

尝试：

​	1.如果薪资大于5000 ，参与的项目数大于3个，则加薪1500，否则加薪1000 如果薪资小于5000，迟到次数小于5次，加薪800，否则加薪500。

​	2.把大写字母，转成对应的小写字母，把小写字母转成对应的大写字母。

### Java程序结构

#### 1.程序结构：

程序分为三种结构：

​	1.顺序结构：按照编码时的编写顺序一步一步进行编译、解释、执行。

​	2.分支、选择结构：根据定义的条件，选择性的进入分支中，执行分支中的代码。

​	3.循环结构：根据给定的条件，不断重复执行代码，直到不满足条件为止。

#### 2.表达式

表达式是，常量或变量与运算符组成的一个式子。在表达式中，运算符指示应对操作数进行什么样的运算。运算符包括+、-、\*、/和new；操作数包括文本、字段、局部变量和表达式。编写表达式时要注意运算符的优先级。

例如：

```java
int num = -10;//定义一个变量，并进行初始化赋值
String result = (num > 0) ? "正": "负";//定义一个result接收三目运算结果
System.out.println(result);//输出结果
```

在上述代码块中，前两行都可看作表达式。

#### 3.控制台输出与输入

输出

在以上内容中，我们反复提起

```java
System.out.println();
```

这个就是表示控制台输出的语句。当我们编码过后，想要看到编码结果，就需要使用此段代码，将结果可视化。

输入

变量之所以为变量，可不会从我们编码时直接赋值来体现。我们可以从键盘输入数据，将数据动态赋值给变量。

#### 4.类的导入

Java中提供了Scanner工具类来进行从键盘获取数据的操作。但是我们编码时无法直接使用，就好比我要拆电脑，我需要一个工具去拆解电脑，我需要先把工具拿到手里，才能使用。这就是类的导入

导入类的方法：

```java
import java.util.Scanner;//所有其他的类都是用import进行导入
```

导入后使用：

```java
Scanner input=new Scanner(System.in);//input是自己定义的变量名
```

例：

```java
 import java.util.Scanner; //从类库中导入Scanner
 public class Demo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //接收控制台的输入
        
        //声明Scanne变量
        Scanner input = new Scanner(System.in);
        
        //就可以使用变量input来接收用户的输入
        //注意：不同的类型的数据，Scanner的接收方式是不同的
        //接收用户的注册信息
        System.out.println("请按提示输入注册信息：");
        System.out.println("请输入年龄：");
        //接收int 
        int age = input.nextInt();
        //接收float
        System.out.println("请输入薪资：");
        float salary = input.nextFloat();
        System.out.println("你是否毕业？true/false");
        //接收boolean
        boolean isPass = input.nextBoolean();
        //接收String
        //next() 从头开始接收、读取字符串，如果遇到空格等特殊字符，停止接收
        System.out.println("请输入你的邮箱：");
        String email = input.next();
        
        //接收
        //nextLine() 从头接收整行输入，包括这特殊字符
        //System.out.println("请输入你的住址：");
        //String address  = input.nextLine();
        
        //接收字符类型
        //没有直接接收char类型的函数nextChar()
        //先以字符串方式接收，再从字符串里获取对应位置的字符，从0开始
        System.out.println("请输入你的性别：F/M");
        char gender = input.next().charAt(2);
        
        System.out.println("你的注册信息如下：年龄："+age+"\t薪资："+salary+"\t是否毕
业？"+isPass);
        System.out.println("邮箱："+email);
        //System.out.println("住址："+address);
        System.out.println("性别："+gender);
    }
 }
```

需要注意的是，当我们使用int定义变量接收input输入的变量时，我们必须键入整数。

否则就会报异常：java.util.InputMismatchException //此异常为输入数据类型与定义的数据类型不匹配导致。

#### 5.if选择结构

##### 1.if初步使用

if（判断条件，返回boolean结果）{

​	//当结果为true时执行的结构体

}else{

​	//当结果为false时执行的结构体

}

例如：

```java
import java.util.Scanner;

public class ifDemo{
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
```

//标题之所以是if选择结构，是因为单个if判断也能正常使用，无需加上else。

//同样的，

##### 2.if-else多层叠加

例如：

```Java
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
```

##### 3.if嵌套

在if的语句块中，又使用了if语句 在满足一个条件后，在里面继续判断是否满足某个条件

if(){

​	if(){



​	}

}

```java
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
```

使用If语句  完成以下内容。            

输入你的体重，单位是KG,  身高，单位是M      计算BMI指数                 

输出：根据BMI指数输出：肥胖、适中、较瘦等               

bmi = 体重 /  身高的平方               

< 18.5        过轻              

18.5~23.9  正常              

 24~27.9    超重                 

28        肥胖

#### 6.switch选择结构

相当于对if结构的简化

switch(表达式/变量/值){

​	case 值1：

​		语句；

​		break；

​	case 值2：

​		语句；

​		break；

​	case 值3：

​		语句；

​		break；

​	default：

​		语句

​		break；

}	

1、先执行switch里的表达式。

2、然后逐个判断 表达式或变量或值，与哪个case后面的值相等。

3、和哪个 case后面的值相等，那么就执行这个case后面的语句块。

4、一旦执行了某个语句块后，那么其余的case 将不会被判断执行。

5、default表示在所有case分支之外的其他分支所执行的语句。

6、case值不能重复。

7、switch后的表达式、变量数据类型必须是byte，short，int 、char、String、Enum。

8、break表示跳出结构体，并非必须加上，如果没有添加break，则会在执行首个符合条件的case语句后，继续执行下一个case语句，无论是否符合条件。

9、进行区间判断时可以使用if语句，进行等值判断时使用switch语句。

例子：

```Java
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
       switch(grade/10){
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
```

#### 7、循环结构

重复循环执行的结构叫做循环结构。

##### 1.while循环

​	while(循环条件){

​		//循环体

​	}

while循环特点：  

1、先判断循环条件，然后才执行循环体，有可能一次循环体都未被执行 

2、适用于已知循环次数的情况

在while循环中，先执行循环条件，循环条件的结果必须时boolean值

当boolean值为true时执行循环体，结果为false，结束循环。

当一轮运行结束后，会重新执行循环条件，若boolean值依旧为true，就会进行第二轮运行。

例子：输出十遍我是LOL高手

```java

public class whileDemo {
    public static void main(String[] args) {
        int num=1;
        while (num<=10) {//设置循环条件若num这个循环变量小于等于10，就继续执行程序
            System.out.println("我是LOL糕手");//主要的输出内容
            num++;//每输出一遍内容，给num值加1.当num值到11后，不满足循环条件，循环结束。
        }
    }
}

```

##### 2.局部变量

局部变量：

声明在方法内部，或方法中的语句块{}中的变量。

局部变量的有效范围：从声明时刻开始，到所在语句块的}结束，超出范围无法使用，报错。 

局部变量使用注意点： 

1、局部变量一定赋值之后，才能使用---输出  计算 ，这个赋值过程被称作初始化。

2、同一个作用域内，不能出现同名的变量

```java
public class Demo {
     public static void main(String[] args) {
         // TODO Auto-generated method stub
             int num = 100;
             int num1;
             System.out.println("num="+num);
             //因为num1 没有赋值，因此不能被使用
             System.out.println("num1="+num1);
             if(num==100){
             int num=120;
             System.out.println("");
         }
    }
 }
```

异常判断：分析以下程序中出现的问题。

```java
 public class Demo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //1~100之间数字之和
        //声明变量初始值为1
        //循环变量通常使用i  j   k   m   n
        //循环条件：循环变量i从1开始，累加，如果小于等于100  执行循环体
        int i =1;
        while(i<=100){
            //i  就是要累加的值
            int sum=0;
            sum = sum+i;
            //切记循环变量的累加
            i++;
        }
        //sum声明在while里，是局部变量，在while的外面无法使用，超出作用域
        System.out.println("1~100之间的累加和："+sum);
    }
 
```

【注意】使用断点跟踪的方式，来查看循环的执行过程 

1、在代码前面的“竖条”上双击，设置断点     当运行程序后，到断点处，程序就会中止 

2、需要单击 箭头按钮，逐步执行 

3、在执行每一行的过程中，观察：变量值的变化，执行的过程、输出结果 

【说明】设置断点的程序，运行时，单击debug虫子按钮  或 右键单击  debug as --->java applicaiton 

F6：逐步、逐行代码执行

小练习：

1.正向打印26个小写字母           

2.反向打印26个小写字母

3.输出100以内的偶数

4.输出100以内的奇数

##### 3.do-while循环

do{  

//循环体 

}while(循环条件);

先执行，后判断是否继续执行。

练习：

1.猜拳游戏： 默认有5000金币 和电脑猜大、猜小 

押金币：至少50个 或50的倍数 

电脑询问：是否加倍 如果人赢了，累加对应赢取的金币，输了就扣除对应的金币 

玩完一局后，询问是否继续，如果继续，重复 

大小的规则：电脑产生3个骰子 的点数 累加 如果累加和大于9 

2.do-while实现登录

3.登陆后，查看菜单选项，是否继续执行。

##### 4.for循环
