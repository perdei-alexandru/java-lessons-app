package com.teoriejava.site_teorie;

import com.teoriejava.site_teorie.model.Lectie;
import com.teoriejava.site_teorie.repository.LectieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final LectieRepository lectieRepository;

    public DataInitializer(LectieRepository lectieRepository) {
        this.lectieRepository = lectieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       // lectieRepository.deleteAll();

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
        if (lectieRepository.findByTitlu("Instrucțiunea if-else").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea if-else",
                    "Structuri condiționale",
                    "Luarea deciziilor simple și ramificate în cod folosind if, else și else if.",
                    """
                            int varsta = 20;
                            
                            if (varsta >= 18) {
                                System.out.println("Persoana este majoră.");
                            } else {
                                System.out.println("Persoana este minoră.");
                            }
                            """,
                    """
                            Instrucțiunea 'if' evaluează o condiție booleană. Dacă rezultatul este true, 
                            se execută blocul asociat; dacă este false, programul trece la ramura 'else'.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea switch").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea switch",
                    "Structuri condiționale",
                    "O alternativă la if-else pentru multiple condiții discrete.",
                    """
                            int zi = 3;
                            
                            switch (zi) {
                                case 1:
                                    System.out.println("Luni");
                                    break;
                                case 2:
                                    System.out.println("Marți");
                                    break;
                                case 3:
                                    System.out.println("Miercuri");
                                    break;
                                default:
                                    System.out.println("Altă zi");
                            }
                            """,
                    """
                            Instrucțiunea 'switch' evaluează o expresie și compară rezultatul cu mai multe cazuri. 
                            Când găsește o potrivire, execută blocul asociat acelui caz.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea for").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea for",
                    "Structuri repetitive",
                    "O buclă care iterează un număr specificat de ori.",
                    """
                            for (int i = 0; i < 5; i++) {
                                System.out.println("Număr: " + i);
                            }
                            """,
                    """
                            Bucla 'for' este folosită pentru a repeta un bloc de cod de un număr specificat de ori. 
                            Ea are trei părți: inițializare, condiție și incrementare.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea while").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea while",
                    "Structuri repetitive",
                    "O buclă care continuă să execute un bloc de cod atâta timp cât o condiție este adevărată.",
                    """
                            int i = 0;
                            while (i < 5) {
                                System.out.println("Număr: " + i);
                                i++;
                            }
                            """,
                    """
                            Bucla 'while' evaluează o condiție înainte de fiecare iterație. 
                            Dacă condiția este adevărată, se execută blocul de cod; 
                            dacă este falsă, bucla se oprește.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea do-while").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea do-while",
                    "Structuri repetitive",
                    "O buclă care execută un bloc de cod cel puțin o dată și continuă să execute atâta timp cât o condiție este adevărată.",
                    """
                            int i = 0;
                            do {
                                System.out.println("Număr: " + i);
                                i++;
                            } while (i < 5);
                            """,
                    """
                            Bucla 'do-while' garantează că blocul de cod se va executa cel puțin o dată, 
                            deoarece condiția este evaluată după execuția blocului.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Instrucțiunea break").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea break",
                    "Concepte Fundamentale",
                    "O instrucțiune care oprește execuția unei bucle sau a unui switch.",
                    """
                            for (int i = 0; i < 10; i++) {
                                if (i == 5) {
                                    break; // Oprește bucla când i este 5
                                }
                                System.out.println("Număr: " + i);
                            }
                            """,
                    """
                            Instrucțiunea 'break' este folosită pentru a ieși imediat dintr-o buclă sau un switch, 
                            indiferent de condițiile rămase.
                            """
            ));
        }
        if(lectieRepository.findByTitlu("Instrucțiunea continue").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Instrucțiunea continue",
                    "Concepte Fundamentale",
                    "O instrucțiune care sare peste restul codului dintr-o iterație a buclei și trece la următoarea iterație.",
                    """
                            for (int i = 0; i < 10; i++) {
                                if (i % 2 == 0) {
                                    continue; // Sare peste numerele pare
                                }
                                System.out.println("Număr impar: " + i);
                            }
                            """,
                    """
                            Instrucțiunea 'continue' este folosită pentru a sări peste restul codului dintr-o iterație a buclei 
                            și a trece direct la următoarea iterație.
                            """
            ));
        }
       if(lectieRepository.findByTitlu("Metode abstracte").isEmpty()) {
           lectieRepository.save(new Lectie(
                   "Metode abstracte",
                   "Metode",
                   "O metodă declarată fără implementare, care trebuie să fie implementată în subclase.",
                   """
                           public abstract class Animal {
                               public abstract void sunet();
                           }
                           
                           public class Caine extends Animal {
                               @Override
                               public void sunet() {
                                   System.out.println("Ham Ham");
                               }
                           }
                           """,
                   """
                           Metodele abstracte sunt folosite în clasele abstracte pentru a defini un comportament 
                           care trebuie implementat de toate subclasele. Ele nu au corp și sunt declarate cu cuvântul cheie 'abstract'.
                           """
           ));
       }
    }
}