package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: GH
 * @Date: 2019/6/13 23:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/cms")
public class CmsPageController implements CmsPageControllerApi {

    @GetMapping("/list/{page}/{size}")
    @Override
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
        QueryResult<CmsPage> queryResult = new QueryResult<CmsPage>();
        queryResult.setTotal(6);
        List<CmsPage> list = new ArrayList<CmsPage>();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("筱红");
        list.add(cmsPage);
        queryResult.setList(list);


        QueryResponseResult queryResponseResult =
                new QueryResponseResult(CommonCode.SUCCESS, queryResult);
        return queryResponseResult;
    }
}
