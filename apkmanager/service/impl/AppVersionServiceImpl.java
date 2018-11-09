package com.zgiot.soft.api.apkmanager.service.impl;

import com.alibaba.fastjson.JSON;
import com.zgiot.core.db.service.impl.BaseSupportServiceImpl;
import com.zgiot.soft.api.apkmanager.dao.AppVersionDao;
import com.zgiot.soft.api.apkmanager.pojo.beanExtend.AppVersionExtend;
import com.zgiot.soft.api.apkmanager.pojo.beanReturn.AppVersionReturn;
import com.zgiot.soft.api.apkmanager.service.AppVersionService;
import com.zgiot.soft.common.util.CommUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author
 */
@Service
@Transactional
public class AppVersionServiceImpl extends BaseSupportServiceImpl implements AppVersionService {
    @Autowired
    private AppVersionDao appVersionDao;

    @Override
    public AppVersionReturn selectZxVersion(AppVersionExtend ex) {
        AppVersionReturn appVersionReturns = appVersionDao.selectZxVersion(ex);
        if (appVersionReturns == null) {
            return appVersionReturns;
        }
        appVersionReturns.setContentList((List) JSON.parseArray(appVersionReturns.getContent()));
        return appVersionReturns;
    }

    @Override
    public List<AppVersionReturn> select(AppVersionExtend ex) {
        List<AppVersionReturn> select = appVersionDao.select(ex);
        if (CommUtil.isNull(select)) {
            return select;
        }
        select.forEach(x -> x.setContentList((List) JSON.parseArray(x.getContent())));
        return select;
    }
}
