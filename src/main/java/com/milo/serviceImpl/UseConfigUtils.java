package com.milo.serviceImpl;

import com.milo.utils.ConfigUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  构造方法注入 例子
 *  需要被xml扫描到  <context:component-scan base-package="com.milo.serviceImpl"/>
 */
@Service
public class UseConfigUtils {

    // spring里构造方法要比@Autowired注入早，可能还没注入就执行了构造方法，需要通过这种方法注入
    private ConfigUtils configUtils;
    @Autowired
    public UseConfigUtils(ConfigUtils configUtils) {
        this.configUtils = configUtils;
        // init action
        String test = this.configUtils.getConfigByKey("TestOrder");
        System.out.println("config from UseConfigUtils " + test);
    }
}
