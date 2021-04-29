package com.enjoy.beans.transaction;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author wu
 * @Date 4/19/2021 11:16 PM
 * @Version 1.0
 */
@Configuration
@EnableTransactionManagement(mode = AdviceMode.PROXY,proxyTargetClass = true)
public class TransactionConfig {

}
