package com.pccw.task;

import com.pccw.task.dbtask.PurchaseexecuteTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xcl
 * @Date: 2019-4-15 9:52
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PurchaseexecuteTaskTest {
    @Autowired
    private PurchaseexecuteTask  purchaseexecuteTask;
    @Test
    public void testTaskPurchaseexecute(){
        purchaseexecuteTask.taskPurchaseexecute();
    }


}
