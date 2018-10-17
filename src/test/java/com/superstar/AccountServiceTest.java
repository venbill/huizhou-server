package com.superstar;

import com.superstar.model.system.vm.RegisterVm;
import com.superstar.service.system.AccountService;
import com.superstar.service.system.ShortMsgService;
import com.superstar.util.GsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:51 2018/10/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Autowired
    private ShortMsgService shortMsgService;


    @Test
    public void sendMsg(){
        shortMsgService.sendCodeMsg("15856687612");
    }
    @Test
    public void register(){
        RegisterVm registerVm = new RegisterVm();
        registerVm.setCode("lham");
        registerVm.setNick("bill");
        registerVm.setPassword("12345678");
        registerVm.setPhone("15856687612");

        System.out.println(GsonUtil.toJson(accountService.register(registerVm)));
    }

}
