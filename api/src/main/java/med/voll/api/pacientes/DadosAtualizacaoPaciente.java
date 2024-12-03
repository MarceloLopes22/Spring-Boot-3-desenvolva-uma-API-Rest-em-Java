package med.voll.api.pacientes;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.medico.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco) {
}
