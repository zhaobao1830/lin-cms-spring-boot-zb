package io.github.talelin.latticy.service.impl;

import io.github.talelin.latticy.mapper.BannerMapper;
import io.github.talelin.latticy.model.BannerDO;
import io.github.talelin.latticy.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<BannerDO> getBanners() {
        return bannerMapper.getaLLBanners();
    }

    @Override
    public void insertBanner() {
        BannerDO bannerDO = new BannerDO();
        bannerDO.setName("NewBanner");
        bannerDO.setTitle("NewTitle");
    }
}
