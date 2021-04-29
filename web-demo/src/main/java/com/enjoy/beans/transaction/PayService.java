package com.enjoy.beans.transaction;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author wu
 * @Date 4/19/2021 11:21 PM
 * @Version 1.0
 */
@Component
public class PayService {


	@Transactional
	public void pay(){
		System.out.println("pay");
	}
}
