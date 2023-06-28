package UsoGetSet;

import org.junit.Assert;
import org.junit.Test;

public class ContaBancoTest {
    UsoGetSet.ContaBanco contaBanco= new UsoGetSet.ContaBanco();

    @Test
    public void testEstadoAtual() throws Exception {
        contaBanco.estadoAtual();
    }

    @Test
    public void testAbrirConta() throws Exception {
        contaBanco.abrirConta("t");
    }

    @Test
    public void testFecharConta() throws Exception {
        contaBanco.fecharConta();
    }

    @Test
    public void testDepositar() throws Exception {
        contaBanco.depositar(0f);
    }

    @Test
    public void testSacar() throws Exception {
        contaBanco.sacar(0f);
    }

    @Test
    public void testPargaMensalidade() throws Exception {
        contaBanco.pargaMensalidade();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme