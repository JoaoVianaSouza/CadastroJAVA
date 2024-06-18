package JoaoVianaSouza.banco_dados.repository;

import JoaoVianaSouza.banco_dados.models.Estado;
import JoaoVianaSouza.banco_dados.models.UsuarioCadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// Interface que estende JpaRepository para fornecer operações CRUD para a entidade UsuarioCadastro
public interface CadastroRepository extends JpaRepository<UsuarioCadastro, Long> {
    Optional<UsuarioCadastro> findByCpfContainingIgnoreCase(String cpfBusca);

    List<UsuarioCadastro> findByEstado(Estado estado);
}

