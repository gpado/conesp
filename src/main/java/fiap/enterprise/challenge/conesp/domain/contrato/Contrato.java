package fiap.enterprise.challenge.conesp.domain.contrato;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="contratos")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String documento;
    private String numeroApolice;
    private LocalDate vigenciaInicio;
    private LocalDate vigenciaFim;
    @Column
    private LocalDateTime dataCadastro = LocalDateTime.now();
    private String status;

    public Contrato(DadosCadastroContrato dados){
        this.nome = dados.nome();
        this.documento = dados.documento();
        this.numeroApolice = dados.numeroApolice();
        this.vigenciaInicio = dados.vigenciaInicio();
        this.vigenciaFim = dados.vigenciaFim();
        this.status = dados.status();
    }

    public Contrato(){}

    @Override
    public String toString() {
        return "Contrato{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", numeroApolice='" + numeroApolice + '\'' +
                ", vigenciaInicio='" + vigenciaInicio + '\'' +
                ", vigenciaFim='" + vigenciaFim + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Long getId() { return id; }

    public String getNome() { return nome; }

    public String getDocumento() { return documento; }

    public String getNumeroApolice() { return numeroApolice; }

    public String getVigenciaInicio() {
        return vigenciaInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public String getVigenciaFim() {
        return vigenciaFim.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public LocalDateTime getDataCadastro() { return dataCadastro; }

    public String getStatus() { return status; }

    public void atualizaDados(DadosAlteracaoContrato dados) {
        this.nome = dados.nome();
        this.documento = dados.documento();
        this.numeroApolice = dados.numeroApolice();
        this.vigenciaInicio = dados.vigenciaInicio();
        this.vigenciaFim = dados.vigenciaFim();
        this.status = dados.status();
    }
}
