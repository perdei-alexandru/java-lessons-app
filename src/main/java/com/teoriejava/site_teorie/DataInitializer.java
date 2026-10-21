package com.teoriejava.site_teorie;

import com.teoriejava.site_teorie.model.Lectie;
import com.teoriejava.site_teorie.repository.LectieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataInitializer implements CommandLineRunner {

    private final LectieRepository lectieRepository;

    public DataInitializer(LectieRepository lectieRepository) {
        this.lectieRepository = lectieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //lectieRepository.deleteAll();

        if (lectieRepository.findByTitlu("Metode de Instanță").isEmpty()) {
            lectieRepository.save(new Lectie("Metode de Instanță", "Metode", "Aparțin fiecărui obiect și pot accesa atributele și alte metode ale instanței.", """
                    public class Persoana {
                        private String nume;
                    
                        // Metodă de instanță
                        public void afiseazaNume() {
                            System.out.println("Numele este: " + this.nume);
                        }
                    }
                    Apelare: 
                    Persoana p1=new Persoana("Alex");
                    p1.afiseazaNume();
                    """,


                    """
                            Metodele de instanță sunt cele mai comune metode în Java. 
                            Ele sunt legate direct de un obiect creat (o instanță) și au acces 
                            la atributele acelui obiect prin cuvântul cheie 'this'.
                            """));
        }

        if (lectieRepository.findByTitlu("Metode Statice").isEmpty()) {

            lectieRepository.save(new Lectie("Metode Statice", "Metode", "Aparțin clasei, nu instanțelor; nu pot accesa atributele non-statice sau metodele de instanță.", """
                    public class Calculator {
                        // Metodă statică
                        public static int aduna(int a, int b) {
                            return a + b;
                        }
                    }
                    Apelare: 
                    int suma = Calculator.aduna(5, 10);
                    """,
                    """
                            Metodele statice sunt asociate cu clasa în sine, nu cu un obiect specific. 
                            Ele pot fi apelate fără a crea o instanță a clasei și nu pot accesa 
                            direct atributele non-statice sau metodele de instanță.
                            """));
        }
        if (lectieRepository.findByTitlu("Metode Finale").isEmpty()) {

            lectieRepository.save(new Lectie("Metode Finale", "Metode", "Nu pot fi suprascrise în subclase.", """
                    public class Persoana {
                        private String nume;
                    
                        // Metodă finală
                        public final void afiseazaNume() {
                            System.out.println("Numele este: " + this.nume);
                        }
                    }
                    """,
                    """
                            Metodele finale sunt metode care nu pot fi suprascrise în subclase. 
                            Ele sunt declarate cu cuvântul cheie 'final'.
                            """));
        }
    }
}