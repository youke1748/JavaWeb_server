import com.zzg.config.SpringConfig;
import com.zzg.dao.CourseDao;
import com.zzg.pojo.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @version : V1.0
 * @ClassName: ServiceTest
 * @Description: TODO
 * @Auther: zzg
 * @Date: 2020/5/19 17:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class DaoTest {

    @Autowired
    private CourseDao courseDao;
    /**
     * 测试接口 根据id修改某课程
     */
    @Test
    public void addCourseHoursByIdTest(){
        Course course = new Course(2,"数据挖掘",80,1);
        courseDao.updateCourseById(course);
    }
}
