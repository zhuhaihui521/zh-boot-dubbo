package net.zhenghao.zh.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import net.zhenghao.zh.api.entity.DubboDemo;
import net.zhenghao.zh.api.service.DemoService;
import net.zhenghao.zh.provider.dao.DubboDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 🙃
 * 🙃
 * 🙃
 *
 * @author:zhaozhenghao
 * @Email :736720794@qq.com
 * @date :2018/6/20 16:16
 * DefaultDemoService.java
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

    @Autowired
    private DubboDemoMapper dubboDemoMapper;

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

    @Override
    public List<DubboDemo> listDemo() {
        return dubboDemoMapper.listDemo();
    }
}
