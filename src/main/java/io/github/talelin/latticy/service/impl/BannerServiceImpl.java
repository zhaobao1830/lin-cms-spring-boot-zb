package io.github.talelin.latticy.service.impl;

import io.github.talelin.latticy.mapper.BannerMapper;
import io.github.talelin.latticy.model.BannerDO;
import io.github.talelin.latticy.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<BannerDO> getBanners1() {
        return bannerMapper.getaLLBanners1();
    }

    @Override
    public Long insertBanner() {
        BannerDO bannerDO = new BannerDO();
        bannerDO.setName("NewBanner");
        bannerDO.setTitle("NewTitle");
        bannerMapper.insertBanner(bannerDO);
        System.out.println(bannerDO.getName());
        return bannerDO.getId();
    }
}
