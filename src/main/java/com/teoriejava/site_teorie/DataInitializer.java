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
        if (lectieRepository.findByTitlu("Instrucțiunea continue").isEmpty()) {
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
        if (lectieRepository.findByTitlu("Metode abstracte").isEmpty()) {
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
        if (lectieRepository.findByTitlu("Structuri Lexicale în Java").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Structuri Lexicale în Java",
                    "Concepte Fundamentale",
                    "Elementele fundamentale ale limbajului Java: identificatori, cuvinte cheie, literali, operatori și separatorii.",
                    """
                            public class ExempluLexical {
                                public static void main(String[] args) {
                                    // Literali și identificatori
                                    int varsta = 20; // 'varsta' este identificator, '20' este literal întreg
                                    double pi = 3.14; // literal cu virgulă mobilă
                                    boolean activ = true; // literal boolean
                            
                                    // Operatori aritmetici și de atribuire
                                    int suma = varsta + 5;
                                    suma++; // incrementare
                            
                                    // Afișare utilizând operatorul de concatenare (+)
                                    System.out.println("Valoarea sumei este: " + suma);
                                }
                            }
                            """,
                    """
                            Structurile lexicale reprezintă blocurile de bază din care se construiesc programele Java:
                            1. Identificatori: Nume date claselor, metodelor și variabilelor (case-sensitive, ex: camelCase).
                            2. Cuvinte cheie (Keywords): Termeni rezervați cu semnificație specială (ex: class, public, if, for).
                            3. Literali: Valori constante care apar direct în cod (întregi, float, char, String, boolean, null).
                            4. Operatorii și Separatorii: Simboluri pentru calcul, atribuire și delimitarea structurilor de cod.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Tipuri Primitive și Array-uri").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Tipuri Primitive și Array-uri",
                    "Concepte Fundamentale",
                    "Cele 8 tipuri primitive de date în Java, conversiile (casting) și utilizarea array-urilor unidi- și multidimensionale.",
                    """
                            public class ExempluTipuriSiArrayuri {
                                public static void main(String[] args) {
                                    // Tipuri primitive
                                    int varsta = 20;
                                    double medie = 9.5;
                                    char grupa = 'A';
                                    boolean absolvent = false;

                                    // Array de numere
                                    int[] note = {8, 9, 10, 7, 9};
                                    
                                    // Parcurgere cu for-each
                                    int suma = 0;
                                    for (int nota : note) {
                                        suma += nota;
                                    }
                                    double mediaNote = (double) suma / note.length;
                                    
                                    System.out.println("Media notelor: " + mediaNote);
                                }
                            }
                            """,
                    """
                            1. Tipurile Primitive: Java are 8 tipuri primitive (byte, short, int, long, float, double, char, boolean). Ele stochează direct valorile în stivă și nu sunt obiecte.
                            2. Conversii (Casting): Pot fi implicite (widening, ex: byte la int) sau explicite (narrowing, ex: int la byte prin (byte)i).
                            3. Array-uri: Sunt obiecte de lungime fixă care stochează elemente de același tip. Indexarea începe de la 0, iar clasa 'java.util.Arrays' oferă metode utile precum sort, binarySearch sau toString.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Introducere în clasa String").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Introducere în clasa String",
                    "Concepte Fundamentale",
                    "Manipularea textului în Java, imutabilitatea, String Pool, metode importante și diferența dintre String și StringBuilder.",
                    """
                            public class ExempluString {
                                public static void main(String[] args) {
                                    // Creare și imutabilitate
                                    String text = "Hello";
                                    text = text.concat(" World"); // Atribuirea este necesară!
                                    System.out.println(text); // Hello World

                                    // Compararea conținutului (corect vs greșit)
                                    String s1 = "abc";
                                    String s3 = new String("abc");
                                    System.out.println(s1.equals(s3)); // true (conținut identic)

                                    // Utilizare StringBuilder pentru performanță la concatenări multiple
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Salut, ");
                                    sb.append("Java!");
                                    String rezultat = sb.toString();
                                    System.out.println(rezultat);
                                }
                            }
                            """,
                    """
                            1. Imutabilitate: Odată creat, conținutul unui obiect String nu poate fi modificat. Orice operație (cum ar fi concat) creează un obiect nou.
                            2. String Pool: Java folosește un bazin intern pentru optimizarea memoriei literaliilor identici.
                            3. Metode esențiale: length(), charAt(), substring(), equals(), toLowerCase(), split().
                            4. StringBuilder vs String: StringBuilder este mutabil și mult mai eficient pentru concatenări repetate într-o buclă, evitând crearea excesivă de obiecte în memorie.
                            """
            ));
        }
        if (lectieRepository.findByTitlu("Laboratorul 1 - Aplicații Practice").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Laboratorul 1 - Aplicații Practice",
                    "Laboratoare", // Aceasta va crea automat categoria "Laboratoare" în dropdown
                    "Acest laborator conține exercițiile de bază pentru structuri alternative, operatori și array-uri. Descărcați arhiva completă de mai jos și rulați proiectul în IntelliJ.",
                    "isp-lab-1.zip"
            ));
        }
        if (lectieRepository.findByTitlu("Laboratorul 3 - OOP: Clase și Obiecte").isEmpty()) {
            lectieRepository.save(new Lectie(
                    "Laboratorul 3 - OOP: Clase și Obiecte",
                    "Laboratoare",
                    "Introducere în clase, constructori, metode și principii de bază OOP în Java.",
                    "isp-lab-3.zip"
            ));
        }


    }
}