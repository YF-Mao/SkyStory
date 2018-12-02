# File文件读取与输入输出流

目的：通过这次附件迁移来学习java中IO相关的知识，学习file类，以及搞清楚各种流的类型，以及如何
正确的使用这些流。

## 1.File文件的创建

> 1.File的构造方法

- File(File parent, String child):Creates a new File instance from a parent abstract pathname and a child pathname string.

- File(String pathname):Creates a new File instance by converting the given pathname string into an abstract pathname.

- File(String parent, String child):Creates a new File instance from a parent pathname string and a child pathname string.

路径名又分为绝对路径和相对路径。

## 2.流的分类

字节输出流可以操作任意类型的文件，比如图片音频等。

> 1.输入流，所有输入流类都是以下2个抽象类的子类

通俗点讲，输入流都是读操作。

- `InputStream`：字节输入流
- `Reader`：字符输入流


> 2.输出流，所有输出流类都是以下2个抽象类的子类

通俗点讲，输出流都是写操作。

- `OutputStream`：字节输出流
- `Writer`：字符输出流


## 参考文献

- [Java中IO流，输入输出流概述与总结](https://yq.aliyun.com/articles/310674?spm=a2c4e.11153940.blogcont58543.11.c57d5137DnTydM)