package com.joybar.superwifi.services;

import com.joybar.superwifi.entity.UpdateInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joybar on 07/01/18.
 */
@Service
public class UpdateServiceImpl implements IUpdateService {
    @Override
    public UpdateInfo getUpdateInfo() {
        UpdateInfo updateInfo = new UpdateInfo();
        updateInfo.setVersionCode(2);
        updateInfo.setVersionName("1.0.1");
        updateInfo.setUpdateTitle("有新版本啦");
        List<String> updateContentList = new ArrayList<String>();
        updateContentList.add("修复已知bug");
        updateContentList.add("优化性能");
        updateInfo.setUpdateContentList(updateContentList);
        updateInfo.setIsForceUpdate(true);
        return updateInfo;
    }
}
