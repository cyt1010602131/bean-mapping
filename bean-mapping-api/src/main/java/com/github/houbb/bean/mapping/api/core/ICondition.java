package com.github.houbb.bean.mapping.api.core;

/**
 * <p> 生效条件接口 </p>
 * 1. 所有的实现都应该提供默认构造器
 * <pre> Created: 2019/2/19 10:15 PM  </pre>
 * <pre> Project: bean-mapping  </pre>
 *
 * @author houbinbin
 * @since 0.1.0
 */
public interface ICondition {

    /**
     * 将原始信息转换为目标信息
     * @param context 当前执行上下文
     * @return 转换结果
     */
    boolean condition(final IContext context);

}
