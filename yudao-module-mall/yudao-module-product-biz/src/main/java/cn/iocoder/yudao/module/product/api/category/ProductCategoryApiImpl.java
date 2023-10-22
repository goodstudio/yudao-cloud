package cn.iocoder.yudao.module.product.api.category;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.product.service.category.ProductCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import java.util.Collection;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

/**
 * 商品分类 API 接口实现类
 *
 * @author owen
 */
@Service
@Validated
public class ProductCategoryApiImpl implements ProductCategoryApi {

    @Resource
    private ProductCategoryService productCategoryService;

    @Override
    public CommonResult<Boolean> validateCategoryList(Collection<Long> ids) {
        productCategoryService.validateCategoryList(ids);
        return success(true);
    }

}
