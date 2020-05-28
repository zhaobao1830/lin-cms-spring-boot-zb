package io.github.talelin.latticy.service;

import io.github.talelin.latticy.model.BannerDO;

import java.util.List;

public interface BannerService {
    List<BannerDO> getBanners();

    List<BannerDO> getBanners1();

    public Long insertBanner();
}
