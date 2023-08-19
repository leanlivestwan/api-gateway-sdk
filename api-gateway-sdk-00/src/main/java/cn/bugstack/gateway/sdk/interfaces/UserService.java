package cn.bugstack.gateway.sdk.interfaces;

import cn.bugstack.gateway.sdk.annotation.ApiProducerClazz;
import cn.bugstack.gateway.sdk.annotation.ApiProducerMethod;
import org.springframework.stereotype.Service;

/**
 * @author 小傅哥，微信：fustack
 * @description 用户服务
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@ApiProducerClazz(interfaceName = "用户服务", interfaceVersion = "1.0.0")
@Service
public class UserService {

    @ApiProducerMethod(methodName = "探测", uri = "/wg/user/hi", httpCommandType = "POST", auth = 1)
    public String hi(String str) {
        return "hi " + str + " by api-gateway-sdk";
    }

}
