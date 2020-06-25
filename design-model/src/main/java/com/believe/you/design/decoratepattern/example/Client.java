package com.believe.you.design.decoratepattern.example;

/**
 * @Author: qiaole
 * @Description:
 * @Date: Created in 2020/6/15 1:27
 */
public class Client {
    public static void main(String[] args) {
        Person xc = new Person("小菜");
        System.out.println("第一种装扮");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        sneakers.decorate(xc);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();
        
        System.out.println("第二种装扮");
        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();
        leatherShoes.decorate(xc);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();
    }
}
