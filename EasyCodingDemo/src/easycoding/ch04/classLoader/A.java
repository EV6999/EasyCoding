/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycoding.ch04.classLoader;

/**
 *
 * @author wliu
 */
public class A {

    private A mA;

    public void test() {
        System.out.println("I am in A class");
    }

    public void setA(Object a) {
        this.mA = (A) a;
        System.out.println("Set a == " + a);
    }
}
