#1.HashMap知识理解

![](https://ws1.sinaimg.cn/large/006tNc79gy1ftiv16vu4aj30i30k4q47.jpg)

众所周知 HashMap 底层是基于 `数组 + 链表` 组成的

##1.遍历键值对的两种方法

>1.
```java
 Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
            System.out.println("key=" + next.getKey() + " value=" + next.getValue());
        }
```

>2.
```java
for(Map.Entry<String, Employee> entry : staff.entrySet()) {
	String key = entry.getKey();
	Employee value = entry.getValue();
	do something with key, value;
}
```