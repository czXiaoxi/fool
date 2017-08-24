package com.xi.fool;

import com.google.common.collect.Lists;
import com.xi.fool.model.User;

import java.util.List;

/**
 * Created by xi on 7/31/17.
 */
public class CollectorsTest {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setAge(10);
        user.setName("zs");

        User user1 = new User();
        user1.setId(2);
        user1.setAge(1);
        user1.setName("ls");

        User user2 = new User();
        user2.setId(3);
        user2.setAge(19);
        user2.setName("ww");

        List<User> users = Lists.newArrayList(user, user1, user2);

        users.forEach(u ->
        {
            if (u.getId() != 1){
                return;
            }
            System.out.println("user:" + u.toString());
        });



    }
}
