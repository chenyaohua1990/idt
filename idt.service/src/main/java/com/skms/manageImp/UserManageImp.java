package com.skms.manageImp;

import com.alibaba.druid.support.json.JSONUtils;
import com.skms.core.domian.ActIdUser;
import com.skms.dao.ActIdUserMapper;
import com.skms.manageApi.UserManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userManage")
public class UserManageImp implements UserManage {
    @Autowired
    private ActIdUserMapper actIdUserMapper;
    public String login(ActIdUser user) {

        return JSONUtils.toJSONString(actIdUserMapper.selectByPrimaryKey("kkd"));
    }
}
