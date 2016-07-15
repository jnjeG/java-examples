package jdk.java.util.concurrent.locks;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;
import java.util.concurrent.locks.LockSupport;

/**
 * Created by chenjunjie on 16/7/10.
 */
public class LockSupportTest {
    public static void main(String[] args) {
        LockSupport.parkUntil(DateUtils.addSeconds(new Date(),60).getTime());
        System.out.printf("time elapse");
    }
}
