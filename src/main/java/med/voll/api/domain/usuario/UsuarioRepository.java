package med.voll.api.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

    @Query("SELECT u FROM Usuario u JOIN FETCH u.roles where u.login = :login ")
    Usuario findByUserNameFetchRoles(@Param("login") String login);

}