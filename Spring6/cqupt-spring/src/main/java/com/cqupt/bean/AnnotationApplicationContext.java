package com.cqupt.bean;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class AnnotationApplicationContext implements ApplicationContext {

    // 创建map集合，放bean对象
    private Map<Class, Object> beanFactory = new HashMap<>();
    private static String rootPath;
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    // 当前包及其子包，哪个类有@Bean注解，就把这个类通过反射实例化
    // 创建有参构造，传递包路径，设置包扫描规则
//    public AnnotationApplicationContext(String basePackage) {
    public static void pathDemo1(String basePackage) {
        // com.cqupt
        //2 获取包的绝对路径
        try {
            //1 把.替换成\
            String packagePath = basePackage.replaceAll("\\.", "\\\\");

            //2 获取包绝对路径
            Enumeration<URL> urls
                    = Thread.currentThread().getContextClassLoader()
                                            .getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                // 获取包前面路径部分(根路径)，字符串截取
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                // 包扫描
                loadBean(new File(filePath));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //3
    }

    // 包扫描过程，bean实例化
    private static void loadBean(File file) {
        //1 判断当前内容是否是文件夹

        //2 获取文件夹里面的所有内容

        //3 判断文件夹里内容为空，直接返回

        //4 如果文件夹不为空，遍历文件夹所有内容
        //4.1 遍历得到每个File对象，继续判断，如果还是文件夹，递归
        //4.2 遍历得到的File对象不是文件夹，是文件
        //4.3 得到包路径 + 类名称部分（字符串的截取过程）
        //4.4 判断当前文件类型是否是.class类型
        //4.5如果是.class类型，把路径\替换成.  把.class去掉
        // com.cqupt.service.UserServiceImpl

        //4.6 判断类上面是否有@Bean注解，如果有，实例化

        //4.7 把对象实例化之后，放到map集合beanFactory
        
    }

    public static void main(String[] args) {
        pathDemo1("com.cqupt");
    }

}
