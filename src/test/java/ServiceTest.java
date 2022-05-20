import com.zzg.config.SpringConfig;
import com.zzg.dao.CourseDao;
import com.zzg.pojo.Course;
import com.zzg.service.SchoolService;
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
 * @Date: 2020/2/19 17:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {

    @Autowired
    private SchoolService schoolService;

    /**
     * 测试接口 根据id得到课程信息
     */
    @Test
    public void getCourseByIdTest(){
    }

    /**
     * 测试接口 根据学院名得到课程信息
     */
    @Test
    public void getComputerCourseByNameTest(){
    }

    /**
     * 测试接口 增加一条课程信息
     */
    @Test
    public void addCourse(){
    }

    /**
     *  测试接口 输出所有学院的课程信息
     */
    @Test
    public void getAllSchoolCourse(){
        System.out.println(schoolService.getAllSchoolCourse());
    }
}