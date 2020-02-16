package com.xuecheng.ucenter.dao;

import com.xuecheng.framework.domain.ucenter.XcMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/02/16
 */
@Component
@Mapper
public interface XcMenuMapper {

    //根据用户id查询用户的权限
    public List<XcMenu> selectPermissionByUserId(String userid);
}
