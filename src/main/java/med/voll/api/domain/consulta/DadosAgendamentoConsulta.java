package med.voll.api.domain.consulta;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
       Long idPaciente,

        @NotNull
        @Future //garantir uma data futura
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
        LocalDateTime data,

        Especialidade especialidade) { }
