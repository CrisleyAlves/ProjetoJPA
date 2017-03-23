package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.ifsul.edu.modelo.Aluno;
import br.ifsul.edu.modelo.Especialidade;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;

/**
 *
 * @author crisley
 */
public class TestePersistirAluno {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        Aluno a = new Aluno();
        
        a.setEmail("joao@Hotmail.com");
        a.setNascimento(new GregorianCalendar(1991, Calendar.AUGUST, 9));
        a.setNome("João");
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        
        
    }
    
}
