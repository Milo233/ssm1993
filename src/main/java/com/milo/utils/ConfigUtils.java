package com.milo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 通用的 读取配置文件的类
 */
public class ConfigUtils {

    private Properties properties; // 保存配置信息 基于map实现

    // 通过xml里配置的bean传入配置文件的路径完成实例化 spring管理
    public ConfigUtils(String path) throws IOException {
        init(path);
    }

    public String getConfigByKey(String key){
        return properties.getProperty(key);
    }

    private void init(String path) throws IOException {
        properties = new Properties();
        InputStream inputStream = this.getClass().getResourceAsStream(path);
        properties.load(inputStream);
        System.out.println(properties.get("TestOrder"));
    }
}
