32 simple 简单工厂

33 method 工厂方法

34 abstract 抽象工厂

**zhss**

简单工厂
```$xslt
未使用设计模式:使用指定产品功能需要创建一个,多处使用多处创建,不适合管理;
使用设计模式: 使用指定产品功能只需修改工厂创建一处地方,多处使用统一修改,适合管理;

```
工厂方法
```
场景：
（1）我们现在要生产的产品有多种
（2）每种产品的生产过程，都有一些是共同的逻辑，但是也有一些是特殊的逻辑
（3）现在要生产出来各种产品
工厂 + 模板 设计模式
```

抽象工厂
```$xslt
场景：
（1）就是我们现在要生产的不是一个一个产品，而一个一个的产品组合
（2）比如说我们有产品ABC，现在第一种产品组合是A+B，第二种产品组合是B+C，第三种产品组合是A+Cs
（3）就是要对工厂模式进行进一步的增强

不使用设计模式,产品组合每次使用就需要new一个
使用设计模式只需要修改工厂方法一处即可
```