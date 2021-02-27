package com.shuhai.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述：
 *
 * @author 含光
 * @email jarvan_best@163.com
 * @date 2021/2/26 11:02 上午
 * @company 数海掌讯
 */
@FeignClient(name = "account-service")
public interface AccountFeignClient {

    @PostMapping("account/reduce")
    boolean reduce(@RequestParam("userId") String userId, @RequestParam("money") Integer money);
}
