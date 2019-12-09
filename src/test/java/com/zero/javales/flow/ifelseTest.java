package com.zero.javales.flow;

import org.testng.annotations.Test;

import java.util.Random;

public class ifelseTest {
    @Test
    public void ifelseTest() {
        int age = 10;
        if (age < 7) {
            System.out.println(age + "岁，属于儿童");
        } else if (age < 18) {
            System.out.println(age + "岁，属于少年");
        } else if (age < 40) {
            System.out.println(age + "岁，属于青年");
        } else if (age < 60) {
            System.out.println(age + "属于中年");
        } else {
            System.out.println(age + "岁，属于老年");
        }
    }
    @Test
    public void testWhile() {

        boolean isContinue = true;
        int times= 0;
        while(isContinue){
            int r = new Random().nextInt(1000);
            if( r%30 == 0){
                isContinue = false;
                System.out.println(r + "能被30整除，退出");
            }else{
                System.out.println(r + "不能被30整除");
                times++;
            }
            System.out.println("随即产生" + times + "次不能被30整除的数");
        }




    }













}
