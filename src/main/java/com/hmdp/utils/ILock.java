package com.hmdp.utils;

public interface ILock {
    /**
     * 尝试获取锁
     * timeoutSec锁持有的时间，超时自动释放
     * @param timeoutSec
     * @return
     */
    boolean tryLock(long timeoutSec);

    //释放锁
    void unLock();
}
