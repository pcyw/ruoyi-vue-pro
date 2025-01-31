package cn.iocoder.dashboard.modules.tool.dal.mysql.codegen;

import cn.iocoder.dashboard.BaseDbUnitTest;
import cn.iocoder.dashboard.modules.tool.dal.dataobject.codegen.ToolSchemaColumnDO;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToolInformationSchemaColumnMapperTest extends BaseDbUnitTest {

    @Resource
    private ToolSchemaColumnMapper toolInformationSchemaColumnMapper;

    @Test
    public void testSelectListByTableName() {
        List<ToolSchemaColumnDO> columns = toolInformationSchemaColumnMapper
                .selectListByTableName("", "inf_config");
        assertTrue(columns.size() > 0);
    }

}
