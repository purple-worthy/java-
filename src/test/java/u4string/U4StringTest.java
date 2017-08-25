package u4string;

import com.git.comm.utils.u4string.StringUtils;
import org.junit.Test;

/**
 * Created by dragon on 8/20/2017.
 */
public class U4StringTest {

    @Test
    public void test(){
        // isEmpty
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty("notNull"));
        // isSNullOrEmpty
        System.out.println(StringUtils.isSNullOrEmpty(""));
        System.out.println(StringUtils.isSNullOrEmpty("notNull"));
        // isStrsEmptyOrNull
        System.out.println(StringUtils.isStrsEmptyOrNull("first","second"));
        System.out.println(StringUtils.isStrsEmptyOrNull("first",""));
        // getUUID
        System.out.println(StringUtils.getUUID());
    }
}
