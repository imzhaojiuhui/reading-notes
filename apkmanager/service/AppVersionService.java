package com.zgiot.soft.api.apkmanager.service;

import com.zgiot.soft.api.apkmanager.pojo.beanExtend.AppVersionExtend;
import com.zgiot.soft.api.apkmanager.pojo.beanReturn.AppVersionReturn;

import java.util.List;

/**
 * @author wyt
 */
public interface AppVersionService {
    /**
     * 查询最新智信版本
     */
    AppVersionReturn selectZxVersion(AppVersionExtend ex);

    /**
     * 查询智信版本
     */
    List<AppVersionReturn> select(AppVersionExtend ex);
}
