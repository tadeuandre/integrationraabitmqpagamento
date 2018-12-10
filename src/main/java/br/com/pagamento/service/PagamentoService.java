package br.com.pagamento.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pagamento.model.Pagamento;
import br.com.pagamento.repository.PagamentoRepository;

@Service
public class PagamentoService {

	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private void setDao(PagamentoRepository pagamentoRepository) {
		this.pagamentoRepository = pagamentoRepository;
	}
	
	public Pagamento save(Pagamento caminhao) {
		return pagamentoRepository.save(caminhao);
	}
	
	public Optional<Pagamento> findOne(Long id) {
		return pagamentoRepository.findById(id);
	}
	
	public Iterable<Pagamento> findAll() {
		return pagamentoRepository.findAll();
	}

}
