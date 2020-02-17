package com.xuecheng.order.dao;

import com.xuecheng.framework.domain.task.XcTaskHis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/02/17
 */
@Component
public interface XcTaskHisRepository extends JpaRepository<XcTaskHis,String> {
}
