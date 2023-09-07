package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank(message = "O campo nome não pode estar em branco")
        String nome,
        @Email(message = "O email deve ser válido")
        @NotBlank(message = "O campo email não pode estar em branco")
        String email,
        @NotBlank(message = "O campo telefone não pode estar em branco")
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
        String cpf,
        @NotNull(message = "O endereco não pode ser nulo")
        @Valid
        DadosEndereco endereco) {

}
