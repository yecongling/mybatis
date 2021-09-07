package com.ycl.mybatis.io.sqlsession;

/**
 * 自定义mybatis中和数据库交互的核心类
 * 他可以创建dao的代理类
 */
public interface SqlSession {

    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
