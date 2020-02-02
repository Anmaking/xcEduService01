package com.xuecheng.filesystem.dao;

import com.xuecheng.framework.domain.filesystem.FileSystem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/02/01
 */
public interface FileSystemRepository extends MongoRepository<FileSystem,System> {
}
