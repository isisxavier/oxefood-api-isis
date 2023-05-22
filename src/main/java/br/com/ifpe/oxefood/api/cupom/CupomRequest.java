package br.com.ifpe.oxefood.api.cupom;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.cupom.Cupom;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CupomRequest {

    private Long id;

    private Long versao;

   private String codigoDesconto;

   private Double percentualDesconto;

   private Double valorDesconto;

   private Double valorMinimoPedidoPermitido;

   private Integer quantidadeMaximaUso;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate inicioVigencia;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate fimVigencia;

   public Cupom build() {

       return Cupom.builder()
               .id(id)
               .versao(versao)
               .codigoDesconto(codigoDesconto)
               .percentualDesconto(percentualDesconto)
               .valorDesconto(valorDesconto)
               .valorMinimoPedidoPermitido(valorMinimoPedidoPermitido)
               .quantidadeMaximaUso(quantidadeMaximaUso)
               .inicioVigencia(inicioVigencia)
               .fimVigencia(fimVigencia)
               .build();
   }
    
}
