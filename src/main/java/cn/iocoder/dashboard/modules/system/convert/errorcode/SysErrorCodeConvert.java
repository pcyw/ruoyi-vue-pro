package cn.iocoder.dashboard.modules.system.convert.errorcode;

import cn.iocoder.dashboard.common.pojo.PageResult;
import cn.iocoder.dashboard.framework.errorcode.core.dto.ErrorCodeAutoGenerateReqDTO;
import cn.iocoder.dashboard.framework.errorcode.core.dto.ErrorCodeRespDTO;
import cn.iocoder.dashboard.modules.system.controller.errorcode.vo.SysErrorCodeCreateReqVO;
import cn.iocoder.dashboard.modules.system.controller.errorcode.vo.SysErrorCodeExcelVO;
import cn.iocoder.dashboard.modules.system.controller.errorcode.vo.SysErrorCodeRespVO;
import cn.iocoder.dashboard.modules.system.controller.errorcode.vo.SysErrorCodeUpdateReqVO;
import cn.iocoder.dashboard.modules.system.dal.dataobject.errorcode.SysErrorCodeDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 错误码 Convert
 *
 * @author 芋道源码
 */
@Mapper
public interface SysErrorCodeConvert {

    SysErrorCodeConvert INSTANCE = Mappers.getMapper(SysErrorCodeConvert.class);

    SysErrorCodeDO convert(SysErrorCodeCreateReqVO bean);

    SysErrorCodeDO convert(SysErrorCodeUpdateReqVO bean);

    SysErrorCodeRespVO convert(SysErrorCodeDO bean);

    List<SysErrorCodeRespVO> convertList(List<SysErrorCodeDO> list);

    PageResult<SysErrorCodeRespVO> convertPage(PageResult<SysErrorCodeDO> page);

    List<SysErrorCodeExcelVO> convertList02(List<SysErrorCodeDO> list);

    SysErrorCodeDO convert(ErrorCodeAutoGenerateReqDTO bean);

    List<ErrorCodeRespDTO> convertList03(List<SysErrorCodeDO> list);

}
