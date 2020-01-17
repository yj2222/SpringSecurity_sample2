package SpringLogin.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringLogin.app.entity.LoginUser;

/*
 * Spring Frameworkのデータ検索を行うための仕組み。
 * DIに登録しておくことでデータ検索が可能になる。引数には＜エンティティクラス,　IDタイプとなる＞
 * https://www.tuyano.com/index3?id=12626003
 */
@Repository
public interface UserRepository extends JpaRepository<LoginUser, Integer>{

}
