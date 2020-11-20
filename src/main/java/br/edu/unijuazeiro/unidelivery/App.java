package br.edu.unijuazeiro.unidelivery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.unidelivery.dao.CustomerDAO;
import br.edu.unijuazeiro.unidelivery.model.customer.Customer;

public final class App {
    private App() {
    }

    public static void main(final String[] args) {

        CustomerDAO dao = new CustomerDAO();
        Customer c = new Customer();
        c.setName("Andrey");
        c.setEmail("andreu@gmail.com");

        dao.save(c);

        dao.emf.close();






























































         // EntityManagerFactory emf =  Persistence.createEntityManagerFactory("unit-unijuazeiro");
        
         // EntityManager em = emf.createEntityManager();

       // em.getTransaction().begin();
        // * INSERT //
        //Customer c = new Customer();
        // c.setName("Edvane da Silva");       // cria o cliente
        // c.setEmail("edvane151@gmail.com");

        //Address address = new Address();
       // address.setStreet("Rua Valdemizio Brito");  // cria o endereço
       // address.setNumber("248");

       // c.setAddress(address);  // atribui o endereço criado ao cliente


        //em.persist(c); // salva o cliente no BD

        



       //* SELECT
      // Customer c = em.find(Customer.class, 1);  
      // System.out.println("ID do Cliente: " + c.getCode());
      // System.out.println("Nome do cliente: " + c.getName());
      // System.out.println("Email do cliente: " + c.getEmail());
       //System.out.println("Rua do cliente: " + c.getAddress().getStreet());
       //System.out.println("Nº da Casa: " + c.getAddress().getNumber());

       // Address address = new Address();
       // address.setStreet("Rua Valdemizio Brito");  // cria o endereço
       // address.setNumber("249");

        //c.setAddress(address);
        //em.merge(c);




        //* UPDATE
       // Customer c = em.find(Customer.class, 12);
       // System.out.println("nome " + c.getName());         
       //em.refresh(c); //atualiza objeto na aplicação
       // em.merge(c); 

       //* REMOVER
        //em.remove(c);


        //em.getTransaction().commit();
       // em.close();
       // emf.close();







    }
}
