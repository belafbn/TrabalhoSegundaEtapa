/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.dao;

import br.edu.ifsul.converters.ConverterOrdem;
import br.edu.ifsul.modelo.Especialidade;
import java.io.Serializable;
import javax.ejb.Stateful;
import br.edu.ifsul.dao.DAOGenerico;

/**
 *
 * @author bela
 */
@Stateful
public class DAOEspecialidade<TIPO> extends DAOGenerico<Especialidade> implements Serializable  {
    public DAOEspecialidade(){
        super();
        classPersistente = Especialidade.class;
        //definindo a lista de ordenações
        listaOrdem.add(new Ordem("id", "ID","="));
        listaOrdem.add(new Ordem("nome","Nome","like"));
        //definição da ordem atual
        ordemAtual = listaOrdem.get(1);
        //criando uma instancia do conversor
        converterOrdem = new ConverterOrdem();
        //associando a lista de ordens ao conversor
        converterOrdem.setListaOrdem(listaOrdem);
        
    }
}
