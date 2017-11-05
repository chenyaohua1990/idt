package com.skms.service;

import com.skms.api.UserService;
import com.skms.bean.vo.UserVO;
import com.skms.core.domian.ActIdUser;
import com.skms.manageApi.UserManage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImp")
public class UserServiceImp implements UserService {
    @Autowired
    private UserManage userManage;

    public String login(UserVO userVO) {
        ActIdUser user=new ActIdUser();
        BeanUtils.copyProperties(userVO,user);
        String label= userManage.login(user);
        return label;
    }
}
