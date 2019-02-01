package com.gss.productservice.Config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties
@Data
public class ConfigInfo {
    @Value("${foo}")
    private String foo;
}
