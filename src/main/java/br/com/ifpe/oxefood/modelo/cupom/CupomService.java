package br.com.ifpe.oxefood.modelo.cupom;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefood.util.entity.GenericService;



@Service
public class CupomService extends GenericService{

    @Autowired
   private CupomRepository repository;

   @Transactional
   public Cupom save(Cupom cupom) {

       super.preencherCamposAuditoria(cupom);
       return repository.save(cupom);
   }

   public List<Cupom> listarTodos() {
  
    return repository.findAll();
    }

    public Cupom obterPorID(Long id) {

    return repository.findById(id).get();
    }
    
}
