package io.github.talelin.latticy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.github.talelin.latticy.common.mybatis.Page;
import io.github.talelin.latticy.model.BannerDO;

import java.util.List;

public interface BannerService {
    IPage<BannerDO> getBanners(long page, long count);

    List<BannerDO> getBanners1();

    public Long insertBanner();
}
