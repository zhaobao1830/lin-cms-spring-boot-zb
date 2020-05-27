package io.github.talelin.latticy.service;

import io.github.talelin.latticy.model.BannerDO;

import java.util.List;

public interface BannerService {
    List<BannerDO> getBanners();

    public void insertBanner();
}
