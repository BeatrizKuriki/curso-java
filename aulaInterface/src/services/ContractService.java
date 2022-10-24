package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

/*
 * INVERSÃO DE CONTROLE SIGNIFICA QUE VOCÊ NÃO PODE DEIXAR SUA CLASSE RESPONSÁVEL PELO CONTROLE DE QUAL INSTANCIA ELA VAI PRECISAR 
 * PARA EXECUTAR.
 * QUEM TEM QUE CONTROLAR QUAL A INSTANCIA DO OBJETO DEPENDENTE VAI SER INSTANCIADA DEVE SER UM AGENTE EXTERNO QUE VAI INJETAR A DEPENDENCIA 
 * DENTRO DA CLASSE
 * INJEÇÃO DE DEPENDENCIA É UM TIPO ESPECÍFICO DE INVERSÃO DE CONTROLE NA PRATICA.
 * 
 * 
 */

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
		
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue()/months;
		for(int i =1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
			
		}
	}

	private Date addMonths(Date date, int N) {		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
		
	}
}
