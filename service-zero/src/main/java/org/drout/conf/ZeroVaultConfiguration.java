package org.drout.conf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Configuration
@ConfigurationProperties("api.zero")
public class ZeroVaultConfiguration {
  @Value("url")
  private String url;
  @Value("username")
  private String username;
  @Value("password")
  private String password;
  @Value("token")
  private String token;

}