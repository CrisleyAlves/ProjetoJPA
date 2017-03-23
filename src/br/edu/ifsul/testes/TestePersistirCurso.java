package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.ifsul.edu.modelo.Curso;
import br.ifsul.edu.modelo.Especialidade;
import br.ifsul.edu.modelo.Instituicao;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;

/**
 *
 * @author crisley
 */
public class TestePersistirCurso {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        Curso c = new Curso();
        
        c.setAtivo(true);
        c.setDescricao("texto sem limites mano aewww hoooooooo ");
        c.setInicioAtividades(new GregorianCalendar(1991, Calendar.AUGUST, 9));
        c.setNome("Nome do Curso");
        c.setSigla("NDC");
        c.setInstituicao(em.find(Instituicao.class, 1));
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
        
    }
    
}
