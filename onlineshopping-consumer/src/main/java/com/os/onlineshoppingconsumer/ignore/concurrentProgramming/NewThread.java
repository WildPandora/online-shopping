package com.os.onlineshoppingconsumer.ignore.concurrentProgramming;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * java创建线程的三种方式(单继承多实现)
 * @author qianjin
 * @create on 2022/7/8 15:32
 */
public class NewThread {
    /*继承thread类*/

    /*实现Runnable接口*/
    private static class UseRun implements Runnable{

        @Override
        public void run() {
            System.out.println("this is runnable");
        }
    }

    /*实现Callable接口*/
    private static class UseCall implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("this is callable");
            return "callable result";
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        UseRun useRun = new UseRun();
        Thread t = new Thread(useRun);
        t.start();
//        t.suspend();
//        t.resume();
        t.interrupt();
        t.isInterrupted();
        UseCall useCall = new UseCall();
        FutureTask<String> futureTask = new FutureTask<>(useCall);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
    /**
     * tips:
     * 线程操作
     * stop，粗暴终止，不建议使用
     * suspend，挂起，不释放资源，不建议使用
     * resume，恢复挂起suspend的线程，不建议使用
     * interrupt，中断一个线程，不是强行关闭
     * isInterrupted，判断线程是否处于中断状态，如果返回true则后台Interrupted重置为false，需要我们自己在interruption异常catch处理中再次中断
     */
}
