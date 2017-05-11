# polymiorphism
## 多态对象的类型转换
子类->父类：向上转型 父类->子类：向下转型 <br>
父类引用可以指向子类对象 如行8:
```
father m = new son();
```

父类对象也可以接收子类对象 向上转型可以直接完成 <br>

但是纯父类对象不能直接强制转换成子类 如行18 抛出异常：java.lang.ClassCastException:
```
father n = new father();
son k= (son)n;
```

指向子类对象的父类引用可以 本身就是子类对象 如行16:
```
father m = new son();
son l = (son)m;
```
<br>

没有继承关系的两个类之间无法完成转换 如行14:
```
stranger s = new stanger();
s=(stranger)x;//son无法传递给stranger 没有继承关系
```
