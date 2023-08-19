package cn.bugstack.gateway.sdk.interfaces;

import cn.bugstack.gateway.sdk.annotation.ApiProducerClazz;
import cn.bugstack.gateway.sdk.annotation.ApiProducerMethod;
import org.springframework.stereotype.Service;

//@Service
@ApiProducerClazz(interfaceName = "用户服务", interfaceVersion = "1.0.0")
@Service
public class UserService implements IUserService{

    @ApiProducerMethod(methodName = "探测", uri = "/wg/user/hi", httpCommandType = "GET", auth = 0)
    public String hi(String str) {
        return "hi " + str + " by api-gateway-sdk";
    }

}
