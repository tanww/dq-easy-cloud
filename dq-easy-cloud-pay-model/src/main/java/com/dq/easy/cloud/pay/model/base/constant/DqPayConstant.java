package com.dq.easy.cloud.pay.model.base.constant;

import com.dq.easy.cloud.model.basic.constant.DqBaseConstant;

/**
 * 支付常量类
 * @author daiqi
 * @date 2018年2月23日 下午11:31:27
 */
public class DqPayConstant extends DqBaseConstant{
	
	/** 支付键类 */
	public static class DqPayKey extends DqPayConstant{
		/** appid的键名---APPID_KEY---appid */
		public static final String APPID_KEY = "appid";
		/** mch_id的键名---APPID_MCH_ID_KEY---mch_id */
		public static final String MCH_ID_KEY = "mch_id";
		/** nonce_str的键名---APPID_NONCE_STR_KEY---nonce_str */
		public static final String NONCE_STR_KEY = "nonce_str";
	}
}
