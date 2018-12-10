package br.com.pagamento.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pagamento.model.FormaPagamento;
import br.com.pagamento.repository.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {

	private FormaPagamentoRepository formaPagamentoRepository;

	@Autowired
	private void setFormaPagamentoRepository(FormaPagamentoRepository formaPagamentoRepository) {
		this.formaPagamentoRepository = formaPagamentoRepository;
	}
	
	public FormaPagamento save(FormaPagamento caminhao) {
		return formaPagamentoRepository.save(caminhao);
	}
	
	public Optional<FormaPagamento> findOne(Long id) {
		return formaPagamentoRepository.findById(id);
	}
	
	public Iterable<FormaPagamento> findAll() {
		return formaPagamentoRepository.findAll();
	}

}
