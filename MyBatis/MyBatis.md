#mybatis
> 永远不要拘泥于一种方式，要在基于注解和XML的语句映射方式间自用移植和切换 

XML文件有为java类型内建的相应的类别名，都是大小写不敏感的。通常都是省略包名。需要注意的是由基本类型名称重复导致的特殊处理。

- 1.`SqlSessionFactoryBuilder`：可以被实例化、使用、丢弃。最佳作用域是方法作用域，也就是局部方法变量
- 2.`SqlSessionFactory`：一旦被创建，在运行期间一直存在。最佳作用域是应用作用域，最简单做到的方式是单例模式或者静态单例模式
- 3.`SqlSession`：每个线程都应该有它自己的SqlSession实例。不是线程安全的，不能被共享的，最佳作用域是请求或方法作用域。






##Mapper XML 文件

### 2.`Insert, Update, Delete 's Attributes`

- `useGeneratedKeys`：（仅对insert和update有用）令 MyBatis 使用 JDBC 的 getGeneratedKeys 方法来取出由数据库内部生成的主键
- `keyProperty`：（仅对 insert 和 update 有用）唯一标记一个属性，MyBatis 会通过 getGeneratedKeys 的返回值或者通过 insert 语句的 selectKey 子元素设置它的键值


### 3.Sql
`<sql/>`：被用来定义可重用的sql代码段，它可以被静态地（在加载参数）参数化，不同的属性值通过包含的实例变化。

### 4.Parameters

但大多时候你只须简单地指定属性名，其他的事情 MyBatis 会自己去推断，顶多要为可能为空的列指定 `jdbcType`。

使用${}这种方式接受参数，是不安全的。因为MyBatis不会修改或转义字符串，会导致潜在的SQL注入风险，要么不允许用户输入这些字段，要么自行转义并校验。


### 5.ResultMaps

- `id`：一个 ID 结果;标记出作为 ID 的结果可以帮助提高整体性能
- `result`：注入到字段或 JavaBean 属性的普通结果
- `constructor`：用于在实例化类时，注入结果到构造方法中
	- `idArg`：ID参数，标记出作为 ID 的结果可以帮助提高整体性能
	- `arg`：将被注入到构造方法的一个普通结果
- `association`：一个复杂类型的关联，许多结果将包装成这种类型
	> 嵌套结果映射 关联可以指定为一个 resultMap 元素，或者引用一个
- `collection`：一个复杂类型的集合
	> 嵌套结果映射 关联可以指定为一个 resultMap 元素，或者引用一个
- `discriminator`：使用结果值来决定使用哪个resultMap
	- `case`：基于某些值的结果映射
	> 嵌套结果映射 – 一个 case 也是一个映射它本身的结果,因此可以包含很多相 同的元素，或者它可以参照一个外部的 resultMap

- #### 5.1.Constructor
	- 1.`name`：构造方法形参的名字。从3.4.3版本开始，通过指定具体的名字，你可以以任意顺序写入arg元素

`columnPrefix`：当连接多表时，你将不得不使用列别名来避免ResultSet中的重复列名。指定columnPrefix允许你映射列名到一个外部的结果集中

N+1 查询问题