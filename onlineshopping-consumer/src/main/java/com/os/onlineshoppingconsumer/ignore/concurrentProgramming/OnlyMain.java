package com.os.onlineshoppingconsumer.ignore.concurrentProgramming;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author qianjin
 * @create on 2022/7/8 15:02
 */
public class OnlyMain {

    /**
     * main方法执行后有5（6）个线程创建
     * @param args
     */
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for (ThreadInfo threadInfo:threadInfos) {
            System.out.println(threadInfo.getThreadId()+"、"+threadInfo.getThreadName());
        }
    }
}
