31  
`模板设计模式`

```$xslt
将共同的基础逻辑抽取到父类中，然后将要子类实现的逻辑留空，交给子类去实现。
```

```
场景：
（1）我们有多种优惠策略

（2）不同的优惠策略在计算的价格的时候，有一些通用的基础逻辑

（3）每种优惠策略还有一些是自己特殊的价格计算的逻辑
```



without: 未使用设计模式

pattern: 使用设计模式