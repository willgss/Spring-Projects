package com.gss.productservice.Controller;

import com.gss.productservice.Config.ConfigInfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class ConfigController {

    @Autowired
    private ConfigInfo configInfo;

    @GetMapping("/config")
    ConfigInfo getConfig()
    {
        return configInfo;
    }
}
