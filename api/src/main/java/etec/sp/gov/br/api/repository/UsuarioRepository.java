package etec.sp.gov.br.api.repository;

import etec.sp.gov.br.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository <Usuario,Long> {
}
