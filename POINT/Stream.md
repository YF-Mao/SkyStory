#JDK8集合新增方法
## 1.stream()方法

根据流的操作性，可以分为 `串行流` 和 `并行流` 。
根据操作返回的结果不同，流式操作又分为中间操作和最终操作。

> 中间操作

- 1.filter()：对元素进行过滤
- 2.sorted()：对元素排序
- 3.map()：元素映射
- 4.distinct()：去除重复的元素

> 最终操作

- 1.forEach()：遍历每个元素
- 2.reduce()：把Stream元素组合起来。
- 3.collect()：返回一个新的集合
- 4.min()：找到最小值
- 5.max()：找到最大值


## 2.lamdba表达式
基本语法
(parameters) -> expression
或
(parameters) -> {statements;}

// 1. 不需要参数,返回值为 5  
() -> 5  
  
// 2. 接收一个参数(数字类型),返回其2倍的值  
x -> 2 * x  
  
// 3. 接受2个参数(数字),并返回他们的差值  
(x, y) -> x – y  
  
// 4. 接收2个int型整数,返回他们的和  
(int x, int y) -> x + y  
  
// 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)  
(String s) -> System.out.print(s)

##参考文献

- [JDK8的集合流式操作](https://blog.csdn.net/asdfsadfasdfsa/article/details/55654629)
- [Java中Lambda表达式的使用](https://www.cnblogs.com/franson-2016/p/5593080.html)