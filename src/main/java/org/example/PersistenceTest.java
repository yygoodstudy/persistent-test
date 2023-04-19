package org.example;

import com.example.io.Resources;

import java.io.InputStream;

/**
 * Hello world!
 */
public class PersistenceTest {
    public static void main(String[] args) {
//       test01();
    }


    /**
     * 加载配置文件
     */
    public void loadConfigFile() {
        InputStream inputStream =
                Resources.getResourcesAsStream("sqlMapConfig.xml");
        System.out.println("inputStream = " + inputStream);
    }
}
