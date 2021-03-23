package net.coru.targetapp.config;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="targetapp")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomConfig implements Serializable {

  private static final long serialVersionUID = -8900976432592584351L;

  private String property1;
  private String property2;
  private String property3;
}
