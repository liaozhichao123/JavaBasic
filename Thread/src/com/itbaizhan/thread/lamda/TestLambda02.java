package com.itbaizhan.thread.lamda;

/**
 * 测试lambda推导
 */
public class TestLambda02 {
    public static void main(String[] args) {
        ILike l=new Like();
        l.like();
        ILike l2=new ILike() {
            @Override
            public void like() {
                System.out.println("i like lambda3");
            }
        };
        l2.like();
        ILike l3=()->{
            System.out.println("i like lambda self");
        };
        l3.like();
    }
}
interface ILike{
    void like();
}
class Like implements ILike{
    @Override
    public void like() {
        System.out.println("i like lambda");
    }
}
