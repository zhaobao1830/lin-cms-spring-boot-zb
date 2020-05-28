package io.github.talelin.latticy.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.talelin.latticy.common.mybatis.Page;
import io.github.talelin.latticy.mapper.BannerMapper;
import io.github.talelin.latticy.mapper.GroupMapper;
import io.github.talelin.latticy.model.BannerDO;
import io.github.talelin.latticy.model.GroupDO;
import io.github.talelin.latticy.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, BannerDO> implements BannerService{
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public IPage<BannerDO> getBanners(long page, long count) {
        Page pager = new Page(page, count);
        return this.baseMapper.selectPage(pager, null);
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
