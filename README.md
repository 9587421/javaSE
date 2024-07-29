# javaSE-Springcloud
总结javaSE-Springcloud各个阶段知识点及对应demo。（整理一下自己学习Java时的心路历程，如果能够重来，我是否还会走上这条路？）

（如果你是大一大二学生，看到此文档可以用作课程阶段学习，如果你大三大四了，就别学了，Java就是个坑。火速去学go，python，云原生。ps：2024.7.29）

git操作

找到一个你想要保存的文件夹位置

在cmd中输入

git clone https://github.com/9587421/javaSE-JavaEE.git

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

#### 5.Java类与程序结构

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





































