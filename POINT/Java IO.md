# File文件读取与输入输出流
# File文件与输入输出流的基本介绍

目的：通过这次附件迁移来学习java中IO相关的知识，学习file类，以及搞清楚各种流的类型，以及如何
正确的使用这些流。

## 1.File文件的创建

> 1.File的构造方法

- File(File parent, String child) : Creates a new File instance from a parent abstract pathname and a child pathname string.

- File(String pathname) : Creates a new File instance by converting the given pathname string into an abstract pathname.

- File(String parent, String child) : Creates a new File instance from a parent pathname string and a child pathname string.

File的路径可以指文件夹路径或者文件路径。路径名又分为绝对路径和相对路径。

> 2.File的创建功能

- boolean createNewFile() : Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist. 

不管你路径是否加后缀，只会创建文件，而且会去检查是否有这个名字的文件，没有就创建文件

- boolean mkdir() : Creates the directory named by this abstract pathname.

不管你路径是否加后缀，只会创建文件夹，如果父目录不存在就会抛出异常

- boolean mkdirs() : Creates the directory named by this abstract pathname, including any necessary but non existent parent directories.

> 3.File其他的常用属性

- boolean exists() : Tests whether the file or directory denoted by this abstract pathname exists.

- boolean isFile() : Tests whether the file denoted by this abstract pathname is a normal file.

- boolean isDirectory() : Tests whether the file denoted by this abstract pathname is a directory.

- File getAbsoluteFile() : Returns the absolute form of this abstract pathname.

- String getAbsolutePath() :Returns the absolute pathname string of this abstract pathname.

- File getParentFile() : Returns the abstract pathname of this abstract pathname's parent, or null if this pathname does not name a parent directory.

- String getParent() : Returns the pathname string of this abstract pathname's parent, or null if this pathname does not name a parent directory.

- String[] list() : Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.

- File[] listFile() : Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.

递归列出指定目录下所有文件名
```java
public static void listAllFiles(File dir) {
    if (dir == null || !dir.exists()) {
        return;
    }
    if (dir.isFile()) {
        System.out.println(dir.getName());
        return;
    }
    for (File file : dir.listFiles()) {
        listAllFiles(file);
    }
}
```

## 2.流的分类

### 1.字符和字节的区别，以及常用编码格式中中英文所占字节长度

> 1.字节和字符的概念

- 字节`Byte`：是计算机信息技术用于计量存储容量的一种计量单位，通常情况下`1字节(byte)` = `8位二进制(bit)`
- 字符：在计算机和电信技术中个，一个字符是一个单位的字形、类字形单位或符号的基本信息，比如，`'1'`、`'$'`、`'中'`、`'e'`。

> 2.常用编码格式所占的字节

- ASCII码：一个中文汉字占`2个字节`，一个英文字母占`1个字节`。
- UTF-8编码：一个中文（含繁体）汉字占`3个字节`，一个英文字母占`1个字节`。
- Unicode编码：一个中英文汉字都是占`2个字节`。注：Unicode是国际标准编码，也是java所采用的编码格式。

> 3.java中的编码方式

- 调用String的getBytes()方法或者初始化时，默认的编码方式与平台有关，一般为UTF-8。

### 2.输入流与输出流

字节输出流可以操作任意类型的文件，比如图片音频等。

> 1.输入流，所有输入流类都是以下2个抽象类的子类

- `InputStream`：字节输入流
- `Reader`：字符输入流

输入流只能从中读取数据，不能写入数据。通俗点讲，输入流都是读操作。


> 2.输出流，所有输出流类都是以下2个抽象类的子类


- `OutputStream`：字节输出流
- `Writer`：字符输出流

输出流只能从中写入数据，不能读取数据。通俗点讲，输出流都是写操作。


### 3.节点流与处理流，从流的分工划分(一下都以输入流InputStream为例)

节点流，必须直接与指定的物理节点关联。处理流是使用了装饰者模式，为组件提供了额外的功能，来间接的操作节点流。

> 1.节点流

|分类|字节输入流|字节输出流|字符输入流|字符输出流|
| :--------: | :--------: | :--------: | :--------: | :--------: |
|访问文件（硬盘）|FileInputStream|FileOutputStream|FileReader|FileWriter|
|访问数组（内存）|ByteArrayInputStream|ByteArrayOutputStream|CharArrayReader|CharArrayWriter|
|访问管道|PipedInputStream|PipedOutputStream|PipedReader|PipedWriter|

- `FileInputStream`


> 2.处理流

处理流都是继承于FilterInputStream，为组件提供额为的功能。FilterInputStream则是属于装饰者，用于装饰组件的

- [装饰者模式介绍]()

|额外功能|字节输入流|字节输出流|字符输入流|字符输出流|
| :--------: | :--------: | :--------: | :--------: | :--------: |
|缓冲功能|BufferedInputStream|BufferedOutputStream|BufferedReader|BufferedWriter|
|更多的数据类型|DataInputStream|DataOutputStream|||

- 缓冲思想介绍：在BufferedInputStream中内置了一个缓冲区（数组），会一次性从文件中读取8192(2^12)个，存在缓存区中，程序读取时会从缓冲区中获取，直至全部都被使用过

尽肯能的多使用处理流

### 4.IO体系的基类方法介绍及使用

> 1.`InputStream`

- abstract int read()：Reads the next byte of data from the input stream.

返回的字节数据可直接转化成int类型

- int read(byte[] b)：Reads some number of bytes from the input stream and stores them into the buffer array b

最多读取b.length长度的字节，返回实际读取的字节数

- int read(byte[] b, int off, int len)：Reads up to len bytes of data from the input stream into an array of bytes.

最多读取len长度的字节，从off位置开始放入b中，返回实际读取的字节数

```java
    /**
     * 使用缓存功能实现文件的复制
     * @author YF.Mao
     * @param srcFile 源文件路径
     * @param tgtFile 目标文件路径
     * @throws IOException
     *
     */
    public static void copyFile(String srcFile, String tgtFile) throws IOException{
        InputStream is = new FileInputStream(srcFile);
        OutputStream os = new FileOutputStream(tgtFile);
        
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] b = new byte[1024 * 8];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        bis.close();
        bos.close();
    }
```

> 2.`OutputStream`

- void flush()：Flushes this output stream and forces any buffered output bytes to be written out.

刷新缓存区


## 参考文献

- [Java中IO流，输入输出流概述与总结](https://yq.aliyun.com/articles/310674?spm=a2c4e.11153940.blogcont58543.11.c57d5137DnTydM)
- [Java IO](https://github.com/CyC2018/CS-Notes/blob/master/notes/Java%20IO.md)
- [Java IO流的概念理解](https://blog.csdn.net/czz1141979570/article/details/80098194)