package io.github.talelin.latticy.controller.v1;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.talelin.latticy.mapper.BannerMapper;
import io.github.talelin.latticy.model.BannerDO;
import io.github.talelin.latticy.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @Autowired
    private BannerMapper bannerMapper;

    @GetMapping("/getBanners")
    public List<BannerDO> getBanners() {
        return bannerService.getBanners();
    }

    @GetMapping("/getBanners1")
    public List<BannerDO> getBanners1() {
        return bannerService.getBanners1();
    }

    @GetMapping("/getBanners2")
    public List<BannerDO> getBanners2() {
        bannerMapper.selectList(null);
        return bannerService.getBanners1();
    }

    @GetMapping("/createBanner")
    public Long createBanner() {
      return bannerService.insertBanner();
    }
}
