package com.ycl.mybatis.io.sqlsession;

public interface SqlSessionFactory {

    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();

}
