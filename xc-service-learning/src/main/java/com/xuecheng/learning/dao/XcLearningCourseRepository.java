package com.xuecheng.learning.dao;

import com.xuecheng.framework.domain.learning.XcLearningCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/02/17
 */
public interface XcLearningCourseRepository extends JpaRepository<XcLearningCourse,String> {

    //根据用户id和课程id查询
    XcLearningCourse findByUserIdAndCourseId(String userId,String courseId);
}
