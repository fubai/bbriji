package com.bbriji.manage.fallback;

import com.bbriji.manage.service.UserService;
import org.springframework.stereotype.Component;

/**
 * 断路回调
 * Created by zhangxingke on 2017/8/1.
 */
@Component
public class UserServiceFallback implements UserService {

    @Override
    public int test() {
        return -1;
    }
}
