import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	@Setter
	@Getter
	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public void setConta(Conta conta) {
		this.contas.add(conta);
	}

	public List<String> clientesBanco(){
		return this.contas.stream()
				.map(conta -> conta.getCliente().getNome())
				.collect(Collectors.toList());
	}

	public void imprimirClientesBanco() {
		System.out.printf("\n=== Clientes do %s ===\n", this.nome);
		clientesBanco().forEach((System.out::println));
	}
}
