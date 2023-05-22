package br.com.ifpe.oxefood.api.cupom;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.cupom.Cupom;
import br.com.ifpe.oxefood.modelo.cupom.CupomService;
import br.com.ifpe.oxefood.util.entity.GenericController;

@RestController
@RequestMapping("/api/cupomDesconto")
public class CupomController extends GenericController {
    
    @Autowired
    private CupomService cupomService;
 
    @PostMapping
    public ResponseEntity<Cupom> save(@RequestBody @Valid CupomRequest request) {
 
        Cupom cupom = cupomService.save(request.build());
        return new ResponseEntity<Cupom>(cupom, HttpStatus.CREATED);
    }
 
    @GetMapping
    public List<Cupom> listarTodos() {
   
        return cupomService.listarTodos();
    }
 
    @GetMapping("/{id}")
    public Cupom obterPorID(@PathVariable Long id) {
 
        return cupomService.obterPorID(id);
    }
}
