package com.waiterxiaoyy.common.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * 功能描述：验证码异常
 *
 * @Author WaiterXiaoYY
 * @Date 2022/1/18 19:37
 * @Version 1.0
 */
public class CaptchaException extends AuthenticationException {
    public CaptchaException(String msg) {
        super(msg);
    }
}
