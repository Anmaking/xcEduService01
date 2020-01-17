package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/01/17
 */
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
