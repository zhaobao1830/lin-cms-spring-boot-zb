package io.github.talelin.latticy.controller.v1;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.github.talelin.latticy.common.mybatis.Page;
import io.github.talelin.latticy.mapper.BannerMapper;
import io.github.talelin.latticy.model.BannerDO;
import io.github.talelin.latticy.service.BannerService;
import io.github.talelin.latticy.service.impl.BannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/v1/banner")
@Validated
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @Autowired
    private BannerServiceImpl bannerServiceImpl;

    @Autowired
    private BannerMapper bannerMapper;

    @GetMapping("/page")
    public void getBanners(@RequestParam(required = false, defaultValue = "0")
                                     @Min(value = 0) Integer page,
                                     @RequestParam(required = false, defaultValue = "10")
                                     @Min(value = 1, message = "{page.count.min}")
                                     @Max(value = 20, message = "{page.count.max}") Integer count) {
        IPage<BannerDO> paging = bannerService.getBanners(page, count);
        int i = 1;
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
