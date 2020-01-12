package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * describe:
 *
 * @author AnAn
 * @date 2020/01/11
 */
@Data
public class QueryPageRequest {
    //接受页面查询条件
    //站点id
    @ApiModelProperty("站点id")
    private String siteId;
    //界面Id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private  String pageAliase;
    //模板id
    private String templateId;

}
