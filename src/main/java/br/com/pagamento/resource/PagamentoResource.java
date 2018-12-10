package br.com.pagamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pagamento.model.FormaPagamento;
import br.com.pagamento.repository.FormaPagamentoRepository;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoResource {

	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;
	
	@GetMapping("/listar")
	public ResponseEntity<?> findAll() {
		List<FormaPagamento> formas = formaPagamentoRepository.findAll();
		
		if (formas.isEmpty()) {
			return new ResponseEntity<FormaPagamento>(HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(formas);
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<?> save(@RequestBody FormaPagamento formaPagamento) {
		FormaPagamento formaSalva = formaPagamentoRepository.save(formaPagamento);
		return ResponseEntity.ok(formaSalva);
	}
}
