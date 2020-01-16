package SpringLogin.app.repository;
package SpringLogin.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.spr

import SpringLogin.app.repository.UserDao;

import SpringLogin.app.repository.UserDao;

import SpringLogin.app.repository.UserDao;

import SpringLogin.app.repository.UserDao;

import SpringLogin.app.repository.UserDao;

import SpringLogin.app.repository.UserDao;

import SpringLogin.app.repository.UserDao;ingframework.stereotype.Repository;



@Repository("UserDaoJdbcImpl")
public class UserDaoJdbcImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbc;

    // Userテーブルの全データを取得.
    @Override
    public List<User> selectMany() throws DataAccessException {

        List<Map<String, Object>> getList = jdbc.queryForList("SELECT * FROM user");
        System.out.println(getList);
        List<User> userList = new ArrayList<>();

        for (Map<String, Object> map : getList) {

            User user = new User();
            user.setUserId((int) map.get("user_id"));
            user.setPassword((String) map.get("password"));
            user.setUserName((String) map.get("user_name"));

            userList.add(user);
        }
        return userList;
    }


}
