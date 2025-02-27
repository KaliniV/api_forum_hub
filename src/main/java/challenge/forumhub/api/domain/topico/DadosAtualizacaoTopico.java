package challenge.forumhub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        @NotNull Long id,
        String titulo,
        String mensagem,
        String autor,
        String curso) {

}
