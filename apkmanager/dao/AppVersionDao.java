package com.zgiot.soft.api.apkmanager.dao;

import com.zgiot.soft.api.apkmanager.pojo.beanExtend.AppVersionExtend;
import com.zgiot.soft.api.apkmanager.pojo.beanReturn.AppVersionReturn;

import java.util.List;

/**
 * @author
 */
public interface AppVersionDao {

    AppVersionReturn selectZxVersion(AppVersionExtend ex);

    List<AppVersionReturn> select(AppVersionExtend ex);
}
