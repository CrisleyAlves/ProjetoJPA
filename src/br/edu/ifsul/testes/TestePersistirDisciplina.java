package br.edu.ifsul.testes;

import br.edu.ifsul.jpa.EntityManagerUtil;
import br.ifsul.edu.modelo.Curso;
import br.ifsul.edu.modelo.Disciplina;
import br.ifsul.edu.modelo.Especialidade;
import br.ifsul.edu.modelo.Instituicao;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;

/**
 *
 * @author crisley
 */
public class TestePersistirDisciplina {

    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        
        Disciplina d = new Disciplina();
        
        d.setCargaHoraria(3.20);
        d.setConhecimentosMinimos("Conhecimentos mínimos");
        d.setDescricao("descrição da disciplina");
        d.setNome("Disciplina");
        d.setCurso(em.find(Curso.class, 2));
        
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        
        
    }
    
}
