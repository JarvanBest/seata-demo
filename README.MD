**此项目有5个模块，分别是**

记得执行seata-demo.sql中的脚本哦~

- `demo-business-service`：业务服务
- `demo-storage-service`：库存服务
- `demo-order-service`：订单服务
- `demo-account-service`：账号服务
- `seata-common-service`：公共工程

**此项目模拟用户下单场景，整个流程如下：**

用户下单(`business-service`) -> 扣库存(`storage-service`) -> 创建订单(`order-service`) -> 减少账户余额(`account-service`)

**提供以下两个测试接口**

1. 事务成功：扣除库存成功 > 创建订单成功 > 扣减账户余额成功 http://localhost:9090/placeOrder
2. 事务失败：扣除库存成功 > 创建订单成功 > 扣减账户余额失败，事务回滚 http://localhost:9090/placeOrderFallBack