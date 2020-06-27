# Design Model
这个是java版本的大话设计模式的源码，都是自己手敲的，可以提供参考


# 设计模式

Author：chenqiaole

Edit Time：2020/06/14

## 一、状态模式

### 1、概述 

![image-20200614160919417](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022619.png)

### 2、结构图

![image-20200614160957779](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022620.png)

### 3、类层次

#### （1）State类

![image-20200614162441164](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022621.png)

```java
package com.believe.you.design.statepattern.bean;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 1:32 2020/6/14
 * @Modified By:
 */
public abstract class State {
    public abstract void handle(Context context);
}

```

#### （2）ConcreteState类

![image-20200614162557848](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022622.png)

##### a、ConcreteStateA

![image-20200614162848433](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022623.png)

##### b、ConcreteStateB

![image-20200614162916443](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022624.png)

#### （3）Context类

![image-20200614163130533](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022625.png)

![image-20200614163343446](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022626.png)

#### （4）客户端代码

![image-20200614163428758](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022627.png)

### 4、状态模式的好处和用户

![image-20200614163508060](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022628.png)

![image-20200614163604415](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022629.png)

### 5、具体事例-工作状态

![image-20200614163646109](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022630.png)

#### （1）抽象状态类

![image-20200614163713012](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022631.png)

```java
package com.believe.you.design.statepattern.bean;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 1:48 2020/6/14
 * @Modified By:
 */
public abstract class WState {
    public abstract void writeProgram(Work work);
}

```

#### （2）上午和中午的工作状态类

![image-20200614163925242](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022632.png)

![image-20200614163938544](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022633.png)

#### （3）下午和傍晚工作状态类

![image-20200614164016797](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022634.png)

![image-20200614164024598](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022635.png)

#### （4）睡眠和下班休息状态类

![image-20200614164114231](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022636.png)

![image-20200614164120389](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022637.png)

#### （5）工作类，即context类

设置条件分支判断的依据，还有下个判断分支的状态，此时没有了过长的分支判断语句了

![image-20200614164401384](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022638.png)

#### （6）客户端代码

![image-20200614164452323](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022639.png)

## 二、建造者模式

### 1、概述

![image-20200615004112194](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022640.png)

### 2、结构图

![image-20200615004228877](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022641.png)

![image-20200615004324861](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022642.png)

### 3、类层次

#### （1）product类

![image-20200615004751047](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022643.png)

![image-20200615004840704](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022644.png)

#### （2）builder类

![image-20200615004909799](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022645.png)

![image-20200615004946487](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022646.png)

#### （3）ConcreteBuilder类 具体的建造者类

![image-20200615005048212](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022647.png)

![image-20200615005055048](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022648.png)

#### （4）Director类---指挥者类

![image-20200615005142972](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022649.png)

说白了，就是拼接建造顺序的

#### （5）客户端代码

![image-20200615005446913](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022650.png)

### 4、适用场景

![image-20200615005537575](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022651.png)

### 5、具体的实例-----建造小人

#### （1）PersonBuilder类

![image-20200615005704800](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022652.png)

![image-20200615005720883](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022653.png)

#### （2） PersonThinBuilder类

![image-20200615005818606](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022654.png)

![image-20200615005847468](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022655.png)

#### （3）PersonFatBuilder类

![image-20200615005929542](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022656.png)

#### （4）Director类

![image-20200615010000597](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022657.png)

![image-20200615010025345](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022658.png)

#### （5）结构图

![image-20200615010045617](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022659.png)

#### （6）客户端代码

![image-20200615010115634](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022700.png)

![image-20200615010202315](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022701.png)

## 三、装饰模式

### 1、概述

![image-20200615020040214](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022702.png)

### 2、结构图

![image-20200615020056057](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022703.png)

![image-20200615020116192](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022704.png)

![image-20200615020130684](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022705.png)

### 3、类层次

#### （1）component类

![image-20200615020242663](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022706.png)

#### （2）ConcreteComponent类

![image-20200615020325973](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022707.png)

#### （3）Decorator类

![image-20200615020529696](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022708.png)

#### （4）ConcreteDecoratorA

![image-20200615020657140](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022709.png)

#### （5）ConcreteDecoratorB



![image-20200615020740431](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022710.png)

#### （6）客户端代码

![image-20200615020826274](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022711.png)

#### （7）总结

![image-20200615020908999](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022712.png)

### 4、具体的实例--穿衣服

#### （1）结构图

![image-20200615020958522](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022713.png)

![image-20200615021046379](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022714.png)

#### （2）Person类

![image-20200615021112042](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022715.png)

#### （3）服饰类（Decorator）

![image-20200615021511353](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022716.png)

#### （4）具体服饰类（ConcreteDecorator）

![image-20200615021625951](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022717.png)

![image-20200615021636610](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022718.png)

#### （5）客户端代码

![image-20200615021801010](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200617022719.png)

#### （6）总结

![top20_2020-06-26_01-50-12](https://gitee.com/top20chenql/md_imgs/raw/master/img/top20_2020-06-26_01-50-12.jpg)

## 四、模板方法模式

### 1、概述

![image-20200625232659330](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013914.png)

> 就是把一样的代码都放在父类中的模板方法中，
>
> 至于不一样的代码单独抽出来一个方法空实现，
>
> 模板方法调用这个空方法，子类来重写这个方法，
>
> 所以当用多态，子类调用模板方法，这个空方法就是子类重写的实现了

### 2、结构图

![image-20200625234049216](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013915.png)

### 3、类层次

#### （1）AbstarctClass

![image-20200625234144292](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013916.png)

![image-20200625234447329](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013917.png)

#### （2）ConcreteClass

![image-20200625234327145](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013918.png)

![image-20200625234646384](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013919.png)

#### （3）客户端调用

![image-20200625234732013](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013920.png)

### 4、具体的实例-试卷

#### （1）结构图

![image-20200625234950583](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013921.png)

#### （2）TestPaper类

![image-20200625235107247](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013922.png)

#### （3）TestPaperA和TestPaperB类

![image-20200625235143549](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013923.png)

![image-20200625235155161](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013924.png)

#### （4）客户端代码

![image-20200625235303890](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013925.png)

### 5、总结

![image-20200625234828545](https://gitee.com/top20chenql/md_imgs/raw/master/img/20200626013926.png)

## 五、观察者模式

### 1、概述

![image-20200627221455584](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627221455584.png)

### 2、结构图

![image-20200627221612000](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627221612000.png)

### 3、类层次

#### （1）Subject类

![image-20200627221703838](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627221703838.png)

![image-20200627222230668](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222230668.png)

#### （2）Observer类

![image-20200627222310869](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222310869.png)

![image-20200627222403202](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222403202.png)

#### （3）ConcreteSubject类

![image-20200627222339542](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222339542.png)

**![image-20200627222452134](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222452134.png)**

#### （4）ConcreteObserver类

![image-20200627222521794](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222521794.png)

#### （5）客户端代码

![image-20200627222706071](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222706071.png)

### 4、具体事例--新闻分发

#### （1）MyObservable--主题接口

![image-20200627222841141](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222841141.png)

#### （2）MyObserver--观察者接口

![image-20200627222911412](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627222911412.png)

#### （3）新闻类 NewsModel

![image-20200627223000422](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627223000422.png)

#### （4）User--实际的观察者

![image-20200627223026611](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627223026611.png)

#### （5）NewsProvider--主题类

![image-20200627223325847](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627223325847.png)

```java
package com.believe.you.design.observerpattern.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/27 16:08
 */
public class NewsProvider implements MyObservable {
    
    private static final long DELAY = 2 * 1000;
    
    private List<MyObserver> myObservers;
    
    public NewsProvider() {
        myObservers = new ArrayList<>();
        generateNews();
    }
    /**
     * 模拟产生新闻，每个2s发送一次
     */
    private void generateNews() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int titleCount = 1;
            int contentCount = 1;
            
            @Override
            public void run() {
                send(new NewsModel("title:" + titleCount++, "content:" + contentCount++));
            }
        }, DELAY, 1000);
    }
    @Override
    public void register(MyObserver myObserver) {
        if (myObserver == null) {
            return;
        }
        synchronized (this) {
            if (!myObservers.contains(myObserver)) {
                myObservers.add(myObserver);
            }
        }
    }
    @Override
    public synchronized void remove(MyObserver myObserver) {
        myObservers.remove(myObserver);
    }
    @Override
    public void send(NewsModel newsModel) {
        for (MyObserver observer : myObservers) {
            observer.receive(newsModel);
        }
    }
}

```

#### （6）客户端

![image-20200627223654682](https://gitee.com/top20chenql/md_imgs/raw/master/img/image-20200627223654682.png)
