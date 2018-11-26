# 1.HashMap知识理解

![](https://ws1.sinaimg.cn/large/006tNc79gy1ftiv16vu4aj30i30k4q47.jpg)

众所周知 HashMap 底层是基于 `数组 + 链表` 组成的

- 容量
- 负载因子

容量的默认大小size是16，负载因子是0.75，当HashMap的`size > 16 * 0.75` 时，就会发生扩容，会导致性能大幅度下降。 

## 1.put方法

首先会传入的 Key 做 `hash` 运算计算出 hashcode,然后根据数组长度取模计算出在数组中的 index 下标。PS,因为key值是唯一的，所以你如果对两个自定义对象，有需要比较对象，那么你就需要重写`equals`和`hashCode`方法。

## 2.遍历键值对的两种方法

> 1.
```java
 Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
            System.out.println("key=" + next.getKey() + " value=" + next.getValue());
        }
```

如果没有指定HashMap的泛型类型可以用如下方法
```java
 Iterator<Map.Entry> entryIterator = map.entrySet().iterator();
 while (entryIterator.hasNext()) {
    Map.Entry next = entryIterator.next();
    System.out.println("key=" + next.getKey() + " value=" + next.getValue());
}
```

> 2.
```java
for(Map.Entry<String, Employee> entry : staff.entrySet()) {
	String key = entry.getKey();
	Employee value = entry.getValue();
	do something with key, value;
}
```