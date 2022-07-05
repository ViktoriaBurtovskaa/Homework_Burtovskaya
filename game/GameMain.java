package com.telran.alex.game;

import com.telran.alex.game.hero.Elf;
import com.telran.alex.game.hero.Ork;

public class GameMain {
    public static void main(String[] args){
        Elf elf = new Elf();
        Elf elf1 = new Elf(2);
      //  Elf elf2 = new Elf(3 , 5,10, 10 );

        Elf elf2 = new Elf(3);
        Elf elf4 = new Elf(4);

        System.out.println("id = " + elf1.getId());


        Ork ork = new Ork(01);
        System.out.println("id = " + ork.getId());
}
}
