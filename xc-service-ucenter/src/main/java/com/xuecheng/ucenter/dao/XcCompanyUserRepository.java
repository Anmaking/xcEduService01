package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcCompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/02/13
 */
public interface XcCompanyUserRepository extends JpaRepository<XcCompanyUser,String > {

    //根据用户id查询该用户所属的公司id
    XcCompanyUser findByUserId(String userId);
}
