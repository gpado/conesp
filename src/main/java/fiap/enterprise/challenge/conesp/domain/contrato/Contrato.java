package fiap.enterprise.challenge.conesp.domain.contrato;

import jakarta.persistence.*;

@Entity
@Table(name="contratos")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String documento;
    private String numeroApolicie;

    public Contrato(DadosCadastroContrato dados){
        this.nome = dados.nomeCompleto();
        this.documento = dados.documento();
        this.numeroApolicie = dados.numeroApolicie();
    }

    public Contrato(){}

    @Override
    public String toString() {
        return "Contrato{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", numeroApolicie='" + numeroApolicie + '\'' +
                '}';
    }

    public Long getId() { return id; }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumeroApolicie() {
        return numeroApolicie;
    }


    public void atualizaDados(DadosAlteracaoContrato dados) {
        this.nome = dados.nomeCompleto();
        this.documento = dados.documento();
        this.numeroApolicie = dados.numeroApolicie();
    }
}


