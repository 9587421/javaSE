# javaSE
总结javaSE阶段知识点及对应demo（自用）

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

#### 3.为什么要配置系统环境变量

环境变量一般是指在操作系统中用来指定操作系统运行环境的一些参数，如临时文件夹位置和系统文件夹位置等。

环境变量是在操作系统中一个具有特定名字的对象，它包含了一个或者多个应用程序所将使用到的信息。例如Windows和DOS操作系统中的path环境变量，当要求系统运行一个程序而没有告诉它程序所在的完整路径时，系统除了在当前目录下面寻找此程序外，还应到path中指定的路径去找。用户通过设置环境变量，来更好的运行进程。

[为何要配置环境变量？_为什么要配置环境变量-CSDN博客](https://blog.csdn.net/zybb166/article/details/122492724)

### 2.开发工具IDE的选择

看个人爱好，我使用了eclipse和idea编写程序，hbuilder X、记事本、vs code、来作为查看代码的工具。

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

​	但是经历长时间的发展之后各大编程语言已经逐步发展出了一样的特性，面向对象，跨平台，多线程等等。那我们为什么还要选择Java，因为Java作为国内长期开发的首选语言，即使在这个百花齐放的时代，依旧在就业市场占据相对较大的岗位需求。

​	同时，世界范围内，Java的生态环境可以说是最为完善的。强大的生态环境造就了Android的辉煌。同样的，Java的生态环境也促就了其居高不下的选用率。即使未来可能走向没落，但不妨碍十年内，它依旧能够占据一席之地。

#### Java基础学习路线

​	JavaSE→JavaEE→Spring→Spring boot→Spring cloud

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

 1、编译、解释型：java   c    c#    c++ python等 需要先 编译   在执行时边解释边执行

 2、解释型：html   javascript 机器能够直接识别，无需编译
