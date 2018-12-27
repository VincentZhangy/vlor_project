package top.vlor.bridge.impl;

import top.vlor.bridge.CPUAbility;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 13:17 2018/5/4
 * @Modified by：
 */
public class AmdCpu implements CPUAbility {
    @Override
    public String abilityCpu() {
        return "性能一般";
    }
}
