package top.vlor.demo;

import org.junit.jupiter.api.Test;
import org.sep4j.Ssio;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 15:14 2018/3/23
 * @Modified by：
 */
public class ReadXlsxTest {
    @Test
    public void XlsxAnalysisDemo() throws IOException {
        Map<String,String> map = new HashMap();
        map.put("user id","userid");
        map.put("user name","username");
        map.put("age","age");
        List<User> users = Ssio.parseIgnoringErrors(map,new ClassPathResource("acc.xlsx").getInputStream(),User.class);
        for(User user:users){
            System.out.println(user.getUserid()+":"+user.getUsername()+":"+user.getAge());
        }
    }

    @Test
    public void XlsxWriterDemo(){
        List<User> userList = new ArrayList<>();
        User user = new User("11","aaa","33");
        User user2 = new User("21","aba","43");
        User user3 = new User("31","aca","23");
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        try {
            FileOutputStream fos = new FileOutputStream(new File("aaa.xlsx"));
            Map<String, String> map = new LinkedHashMap<>();
            map.put("userid", "userid");
            map.put("username", "username");
            map.put("age", "age");
            Ssio.save(map, userList, fos);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
