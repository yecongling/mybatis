import com.ycl.dao.IUserDao;
import com.ycl.domain.User;
import com.ycl.mybatis.io.Resources;
import com.ycl.mybatis.io.sqlsession.SqlSession;
import com.ycl.mybatis.io.sqlsession.SqlSessionFactory;
import com.ycl.mybatis.io.sqlsession.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    public static void main(String[] args) throws IOException {
        // 1、读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3、使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        // 4、使用SqlSession创建Dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        // 5、使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users){
            System.out.println(user);
        }
        // 6、释放资源
        session.close();
        in.close();
    }
}
