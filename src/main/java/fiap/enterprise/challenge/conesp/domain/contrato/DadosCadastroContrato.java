package fiap.enterprise.challenge.conesp.domain.contrato;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DadosCadastroContrato(
        String nome,
        String documento,
        String numeroApolice,
        LocalDate vigenciaInicio,
        LocalDate vigenciaFim,
        LocalDateTime dataCadastro,
        String status
) {}

