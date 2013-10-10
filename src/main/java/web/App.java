package web;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import persistencia.dominio.Mecanico;
import persistencia.dominio.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        System.out.println("Inician do aplicacion ...");
        System.out.println("Creando EntityManager ...");

        String UNIDAD_DE_PERSISTENCIA = "EJEMPLO1-PU";
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory(UNIDAD_DE_PERSISTENCIA, System.getProperties());
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();


        System.out.println("Creado Personas...");
        List<Persona> personasList = new ArrayList<Persona>();
        List<Mecanico> mecanicosList = new ArrayList<Mecanico>();

        personasList.add(new Persona("DNI", "11111111", "Aaaaa", "Bbbbb"));
        personasList.add(new Persona("DNI", "22222222", "Ccccc", "Ddddd"));
        personasList.add(new Persona("DNI", "33333333", "Eeeee", "Fffff"));
        personasList.add(new Persona("DNI", "44444444", "Ggggg", "Hhhhh"));
        //personasList.add(new Persona(1, "DNI", "11111111", "Aaaaa", "Bbbbb"));
        //personasList.add(new Persona(2, "DNI", "22222222", "Ccccc", "Ddddd"));
        //personasList.add(new Persona(3, "DNI", "33333333", "Eeeee", "Fffff"));
        //personasList.add(new Persona(4, "DNI", "44444444", "Ggggg", "Hhhhh"));


        System.out.println("Persistiendo Personas...");
        for (Persona persona : personasList) {
            em.persist(persona);
        }
        em.flush();
        em.getTransaction().commit();

//        ------------------------
        System.out.println("Listando todas la personas...");
        Query jpql1 = em.createQuery("SELECT p FROM Persona p");
        List<Persona> personaList = jpql1.getResultList();
        System.out.println("Tamaño lista: " + personaList.size());
        for (Persona persona : personaList) {
            System.out.println(persona.toString());
        }


        System.out.println("Listando una persona...");
        Query jpql2 = em.createQuery("SELECT p FROM Persona p WHERE p.id = :PERSONA_ID");
        jpql2.setParameter("PERSONA_ID", 2);
        Persona unaPersona = (Persona) jpql2.getSingleResult();
        System.out.println(unaPersona.toString());

    }
}
