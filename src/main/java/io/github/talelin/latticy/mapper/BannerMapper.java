package io.github.talelin.latticy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.model.BannerDO;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper {

    List<BannerDO> getaLLBanners();

    int insertBanner(BannerDO bannerDO);
}
