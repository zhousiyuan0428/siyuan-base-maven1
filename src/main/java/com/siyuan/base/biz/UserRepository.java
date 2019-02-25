package com.siyuan.base.biz;

import com.siyuan.base.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    /**
     * 查询用户名为username的用户
     * @param name
     * @return
     */
    List<User> findAllByNameEquals(String name);


}
