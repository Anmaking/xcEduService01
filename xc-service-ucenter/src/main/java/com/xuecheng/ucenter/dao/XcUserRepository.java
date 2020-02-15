package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/02/13
 */
public interface XcUserRepository extends JpaRepository<XcUser,String> {

    //根据账号查询用户信息
    XcUser findByUsername(String username);
}
