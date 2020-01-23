package com.xuecheng.manage_cms_client.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/01/20
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}
