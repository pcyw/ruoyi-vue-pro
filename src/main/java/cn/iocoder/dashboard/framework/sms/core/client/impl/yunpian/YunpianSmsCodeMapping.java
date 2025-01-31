package cn.iocoder.dashboard.framework.sms.core.client.impl.yunpian;

import cn.iocoder.dashboard.common.exception.ErrorCode;
import cn.iocoder.dashboard.framework.sms.core.client.SmsCodeMapping;

import static cn.iocoder.dashboard.common.exception.enums.GlobalErrorCodeConstants.SUCCESS;
import static cn.iocoder.dashboard.framework.sms.core.enums.SmsFrameworkErrorCodeConstants.*;
import static com.yunpian.sdk.constant.Code.*;

/**
 * 云片的 SmsCodeMapping 实现类
 *
 * 参见 https://www.yunpian.com/official/document/sms/zh_CN/returnvalue_common 文档
 *
 * @author 芋道源码
 */
public class YunpianSmsCodeMapping implements SmsCodeMapping {

    @Override
    public ErrorCode apply(String apiCode) {
        int code = Integer.parseInt(apiCode);
        switch (code) {
            case OK: return SUCCESS;
            case ARGUMENT_MISSING: return SMS_API_PARAM_ERROR;
            case BAD_ARGUMENT_FORMAT: return SMS_TEMPLATE_PARAM_ERROR;
            case TPL_NOT_FOUND:
            case TPL_NOT_VALID: return SMS_TEMPLATE_INVALID;
            case MONEY_NOT_ENOUGH: return SMS_ACCOUNT_MONEY_NOT_ENOUGH;
            case BLACK_WORD: return SMS_SEND_CONTENT_INVALID;
            case DUP_IN_SHORT_TIME:
            case TOO_MANY_TIME_IN_5:
            case DAY_LIMIT_PER_MOBILE:
            case HOUR_LIMIT_PER_MOBILE: return SMS_SEND_BUSINESS_LIMIT_CONTROL;
            case BLACK_PHONE_FILTER: return SMS_MOBILE_BLACK;
            case SIGN_NOT_MATCH:
            case BAD_SIGN_FORMAT:
            case SIGN_NOT_VALID: return SMS_SIGN_INVALID;
            case BAD_API_KEY: return SMS_ACCOUNT_INVALID;
            case API_NOT_ALLOWED: return SMS_PERMISSION_DENY;
            case IP_NOT_ALLOWED: return SMS_IP_DENY;
        }
        return SMS_UNKNOWN;
    }

}
