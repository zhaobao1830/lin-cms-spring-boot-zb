package io.github.talelin.latticy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.model.BannerDO;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper {

    List<BannerDO> getaLLBanners();

    @Select("SELECT * FROM banner")
    List<BannerDO> getaLLBanners1();

    int insertBanner(BannerDO bannerDO);
}
