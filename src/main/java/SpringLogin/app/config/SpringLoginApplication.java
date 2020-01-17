package SpringLogin.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication //Spring Bootアプリケーションであることを示す
@ComponentScan("SpringLogin.app") //BeanとしてDIに登録する。パッケージとして指定することができる。
@EntityScan("SpringLogin.app.entity") //上記同様BeanとしてDIに登録。
@EnableJpaRepositories("SpringLogin.app.repository") //JpaRepositoryをONにするためのもの。指定されたパッケージ内を検索し、@Repositoryを付けたクラスをBeanとして登録。
public class SpringLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLoginApplication.class, args);
	}

}
