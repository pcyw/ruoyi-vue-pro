package cn.iocoder.dashboard.modules.system.convert.sms;

import cn.iocoder.dashboard.common.pojo.PageResult;
import cn.iocoder.dashboard.framework.sms.core.property.SmsChannelProperties;
import cn.iocoder.dashboard.modules.system.controller.sms.vo.channel.SysSmsChannelCreateReqVO;
import cn.iocoder.dashboard.modules.system.controller.sms.vo.channel.SysSmsChannelRespVO;
import cn.iocoder.dashboard.modules.system.controller.sms.vo.channel.SysSmsChannelSimpleRespVO;
import cn.iocoder.dashboard.modules.system.controller.sms.vo.channel.SysSmsChannelUpdateReqVO;
import cn.iocoder.dashboard.modules.system.dal.dataobject.sms.SysSmsChannelDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 短信渠道 Convert
 *
 * @author 芋道源码
 */
@Mapper
public interface SysSmsChannelConvert {

    SysSmsChannelConvert INSTANCE = Mappers.getMapper(SysSmsChannelConvert.class);

    SysSmsChannelDO convert(SysSmsChannelCreateReqVO bean);

    SysSmsChannelDO convert(SysSmsChannelUpdateReqVO bean);

    SysSmsChannelRespVO convert(SysSmsChannelDO bean);

    List<SysSmsChannelRespVO> convertList(List<SysSmsChannelDO> list);

    PageResult<SysSmsChannelRespVO> convertPage(PageResult<SysSmsChannelDO> page);

    List<SmsChannelProperties> convertList02(List<SysSmsChannelDO> list);

    List<SysSmsChannelSimpleRespVO> convertList03(List<SysSmsChannelDO> list);

}
