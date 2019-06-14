package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: GH
 * @Date: 2019/6/13 23:47
 * @Version 1.0
 */
public interface CmsPageRepository extends MongoRepository<CmsPage, String> {

}
