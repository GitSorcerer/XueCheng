package com.xuecheng.api;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @Author: GH
 * @Date: 2019/6/13 23:24
 * @Version 1.0
 */
public interface CmsPageControllerApi {
    /**
     * @param page 当前页码
     * @param size
     * @param queryPageRequest
     * @return
     */
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
