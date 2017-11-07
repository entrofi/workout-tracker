package net.entrofi.workouttracker.service;


import net.entrofi.workouttracker.domain.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class UserServiceTest extends AbstractServiceTest {


    @Autowired
    private UserService userService;

    private static List<String> initUsersIdList = new ArrayList<>();

    static {
        initUsersIdList.add("5a0055e51dbc8675faa4371b");
        initUsersIdList.add("5a0055e51dbc8675faa4371c");
        initUsersIdList.add("5a0055e51dbc8675faa4371d");
        initUsersIdList.add("5a0055e51dbc8675faa4371e");
        initUsersIdList.add("5a0055e51dbc8675faa4371f");
        initUsersIdList.add("5a0055e51dbc8675faa43720");
        initUsersIdList.add("5a0055e51dbc8675faa43721");
        initUsersIdList.add("5a0055e51dbc8675faa43722");
        initUsersIdList.add("5a0055e51dbc8675faa43723");
        initUsersIdList.add("5a0055e51dbc8675faa43724");
        initUsersIdList.add("5a0055e51dbc8675faa43725");
    }
    @Before
    public void setUp(){
        importJSON("user", "/data/users_sample.json");
    }



    @Test
    public void testFind(){
        User user = userService.find(initUsersIdList.get(0));
        assertNotNull(user);
    }

    @Test
    public void testFindAll(){
        List<User> userList = userService.findAll();
        assertNotNull(userList);
        assertTrue(userList.size() > 0);
    }

    @Test
    public void testSave(){
        User user = new User();
        user.setEmail("mail@integrationtest.net");
        user.setName("integration");
        user.setLastName("test");
        user.setPassword("123456");
        user.setUsername("integrationtest");
        userService.save(user);
        assertNotNull(user.getId());
    }


    @Test
    public void testDelete_by_id(){
        userService.delete(initUsersIdList.get(1));
        assertNull(userService.find(initUsersIdList.get(1)));
    }


}
